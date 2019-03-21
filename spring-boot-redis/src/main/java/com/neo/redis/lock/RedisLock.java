package com.neo.redis.lock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/21 9:40
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Component
@Slf4j
public class RedisLock {


    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * @Author Mr. xyb
     * @Desc 加锁
     * @Date 2019/3/21 10:11
     * @Param [key: productId, value: 当前时间 + 超时时间]
     * @Return java.lang.Boolean
     */
    public boolean lock(String key, String value) {
        /**
         * 设置成功返回true，反之false
         * 返回true表示拿到锁
         */
        if (redisTemplate.opsForValue().setIfAbsent(key, value)) {
            return true;
        }
        /**
         * 如果当前key已经存在值，则判断是否超时
         * 一般来说，这个情况就是下面这行“String oldValue = redisTemplate.opsForValue().getAndSet(key, value);”造成的
         * 这里set了一个key的值，但是却没拿到锁，所以超时了
         */
        String currentValue = redisTemplate.opsForValue().get(key);
        // 超时
        if (!StringUtils.isEmpty(currentValue) && Long.parseLong(currentValue) < System.currentTimeMillis()) {

            /**
             * 拿到当前线程的key的上一个值，同时将自己的新值set进去。
             * 判断是否为空，且是否与当前的currentValue相同
             * 判定是否为当前线程，此方案是为了防止并发问题出现，导致数据错乱
             * 后面的线程拿到的currentValue值正常来说不会与oldValue相等，这样也就不会出现并发导致数据错误的问题
             */
            String oldValue = redisTemplate.opsForValue().getAndSet(key, value);
            if (!StringUtils.isEmpty(oldValue) && oldValue.equals(currentValue)) {
                return true;
            }
            // redisTemplate.opsForValue().getOperations().delete(key);
        }
        return false;
    }


    /**
     * @Author Mr. xyb
     * @Desc 解锁
     * @Date 2019/3/21 10:24
     * @Param [key productId]
     * @Return void
     */
    public void unlock(String key, String value) {
        try {
            String currentValue = redisTemplate.opsForValue().get(key);
            if (!StringUtils.isEmpty(currentValue) && currentValue.equals(value)) {
                redisTemplate.opsForValue().getOperations().delete(key);
            }
        } catch (Exception e) {
            log.error("【Redis分布式锁】 解锁异常，{}", e);
        }
    }


}
