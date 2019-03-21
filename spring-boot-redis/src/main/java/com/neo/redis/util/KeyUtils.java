package com.neo.redis.util;

import java.util.Random;

/**
 * 模块描述: <br>
 * (随机数生成)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/21 10:30
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class KeyUtils {

    /**
     * @Author Mr. xyb
     * @Desc 生成毫秒数+随机数
     * @Date 2019/3/21 10:57
     * @Param []
     * @Return java.lang.String
     */
    public static String getUniqueKey() {
        Random random = new Random();
        int number = random.nextInt(9999999);
        String value = System.currentTimeMillis() + String.valueOf(number);
        return value;
    }

}
