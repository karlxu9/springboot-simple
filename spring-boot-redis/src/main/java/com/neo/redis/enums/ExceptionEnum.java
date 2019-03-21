package com.neo.redis.enums;

import lombok.Getter;

/**
 * 模块描述: <br>
 * (异常枚举)
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/21 10:40
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Getter
public enum ExceptionEnum {


    ERROR(-1, "错误"),

    PERSON_EXCEED_MAX(101, "人数超过最大值"),

    PRODUCT_STOCK_DEFICIENCY(102, "库存不足")
    ;

    private Integer code;

    private String message;


    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
