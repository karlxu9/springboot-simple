package com.neo.redis.service.impl;

import com.neo.redis.enums.ExceptionEnum;
import com.neo.redis.exception.GlobException;
import com.neo.redis.lock.RedisLock;
import com.neo.redis.service.SeckillService;
import com.neo.redis.util.KeyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 模块描述: <br>
 * (秒杀业务层)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/21 9:37
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Service
public class SeckillServiceImpl implements SeckillService {
    @Autowired
    private RedisLock redisLock;
    @Value("${redis.lock.timeout}")
    private Long TIMEOUT;

    static Map<String, Integer> products;
    static Map<String, Integer> stocks;
    static Map<String, String> orders;

    static {
        products = new HashMap<>();
        stocks = new HashMap<>();
        orders = new HashMap<>();
        products.put("12345", 10000);
        stocks.put("12345", 10000);
    }

    /**
     * 打印结果
     *
     * @param productId
     * @return
     */
    private String queryMap(String productId) {
        return "国庆活动，皮蛋粥特价，限量份"
                + products.get(productId)
                + "还剩：" + stocks.get(productId) + "份"
                + "该商品成功下单用户数目："
                + orders.size() + " 人";
    }


    @Override
    public String querySeckillProductInfo(String productId) {
        return this.queryMap(productId);
    }

    /**
     * 存在并发问题，推荐使用分布式锁解决
     * synchronized效率太低
     *
     * @param productId 商品id
     */
    @Override
    public void orderProductMockDiffUser(String productId) {
        Long time = System.currentTimeMillis() + TIMEOUT;
        if (!redisLock.lock(productId, String.valueOf(time))) {
            throw new GlobException(ExceptionEnum.PERSON_EXCEED_MAX);
        }
        // 查询当前key的库存
        int stockNum = stocks.get(productId);
        // 库存不足
        if (stockNum == 0) {
            throw new GlobException(ExceptionEnum.PRODUCT_STOCK_DEFICIENCY);
        }
        // 下单
        orders.put(KeyUtils.getUniqueKey(), productId);
        stockNum = stockNum - 1;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stocks.put(productId, stockNum);

        redisLock.unlock(productId, String.valueOf(time));
    }
}
