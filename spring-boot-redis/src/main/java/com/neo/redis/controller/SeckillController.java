package com.neo.redis.controller;

import com.neo.redis.service.SeckillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模块描述: <br>
 * (秒杀系统 - Redis分布式锁)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/21 9:35
 * @since: 1.8.0
 * @version: 1.0.0
 */
@RestController
@RequestMapping("/skill")
@Slf4j
public class SeckillController {

    @Autowired
    private SeckillService seckillService;


    /**
     * @Author Mr. xyb
     * @Desc 查询参与秒杀的商品信息
     * @Date 2019/3/21 11:19
     * @Param [productId: 商品id]
     * @Return java.lang.String
     */
    @GetMapping("/query/{productId}")
    public String query(@PathVariable("productId") String productId) {
        String info = seckillService.querySeckillProductInfo(productId);
        return info;
    }

    /**
     * @Author Mr. xyb
     * @Desc 下单
     * @Date 2019/3/21 11:17
     * @Param [productId 商品id]
     * @Return java.lang.String
     */
    @GetMapping("/order/{productId}")
    public String skill(@PathVariable String productId) {
        for (int i = 0; i < 10000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    log.info("@Skill request, productId:" + productId);
                    seckillService.orderProductMockDiffUser(productId);
                    System.out.println(seckillService.querySeckillProductInfo(productId));
                }
            }).start();
        }
        return seckillService.querySeckillProductInfo(productId);
    }

}
