package com.neo.redis.service;

/**
 * 接口: <br>
 * (秒杀操作)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/21 9:36
 * @since: 1.8.0
 * @version: 1.0.0
 */
public interface SeckillService {


    /**
     * 查询秒杀的商品信息
     *
     * @param productId
     * @return
     */
    String querySeckillProductInfo(String productId);


    /**
     * 进行秒杀
     *
     * @param productId 商品id
     */
    void orderProductMockDiffUser(String productId);

}
