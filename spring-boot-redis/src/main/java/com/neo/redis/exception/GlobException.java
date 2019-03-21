package com.neo.redis.exception;

import com.neo.redis.enums.ExceptionEnum;
import lombok.Getter;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/21 10:34
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Getter
public class GlobException extends RuntimeException {

    private Integer code;

    public GlobException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public GlobException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
    }

}
