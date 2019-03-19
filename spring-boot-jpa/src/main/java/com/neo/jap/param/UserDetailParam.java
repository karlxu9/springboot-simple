package com.neo.jap.param;

import lombok.Data;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/15 17:45
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Data
public class UserDetailParam {
    private String userId;
    private Integer minAge;
    private Integer maxAge;
    private String realName;
    private String introduction;
    private String city;
}
