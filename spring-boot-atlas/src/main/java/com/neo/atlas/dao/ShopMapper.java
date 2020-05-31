/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/5/24 18:51
 * @since: 1.8.0
 * @version: 1.0.0
 */
package com.neo.atlas.dao;

import com.neo.atlas.entity.Shop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 模块描述: <br>
 * 【】
 *
 * @Author: Mr. KarlXu
 * @Date: 2020/5/24 18:51
 * @since: 1.8.0
 * @version: 1.0.0
 */
public interface ShopMapper {

    // /*master*/ 业务需要 atlas
    @Select("select * from shop")
    List<Shop> list();

    @Insert("insert into shop(name) values(#{name})")
    void save(@Param("name") String name);

}
