package com.neo.redis.service;

import java.util.Map;

public interface WXservice {
    Map<String, String> dounifiedOrder(String attach, String total_fee) throws Exception;

    String payBack(String notifyData);
}
