package com.neo.jap.service;

import com.neo.jap.model.UserDetail;
import com.neo.jap.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/15 17:45
 * @since: 1.8.0
 * @version: 1.0.0
 */
public interface UserDetailService {

    Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);

}
