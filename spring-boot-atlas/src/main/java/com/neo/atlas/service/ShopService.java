package com.neo.atlas.service;

import com.neo.atlas.entity.Shop;

import java.util.List;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/5/24 18:52
 * @since: 1.8.0
 * @version: 1.0.0
 */
public interface ShopService {

    List<Shop> list();


    void save(String name);

}
