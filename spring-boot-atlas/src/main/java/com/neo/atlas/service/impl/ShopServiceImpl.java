/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/5/24 18:53
 * @since: 1.8.0
 * @version: 1.0.0
 */
package com.neo.atlas.service.impl;

import com.neo.atlas.dao.ShopMapper;
import com.neo.atlas.entity.Shop;
import com.neo.atlas.service.ShopService;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Resource
    private ShopMapper shopMapper;


    @Override
    public List<Shop> list() {
        // 强制主库读
        //HintManager manager = HintManager.getInstance();
        //manager.setMasterRouteOnly();
        return shopMapper.list();
    }

    @Override
    public void save(String name) {
        shopMapper.save(name);
    }

}
