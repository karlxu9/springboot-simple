package com.neo.redis.util;

import com.github.wxpay.sdk.WXPayConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/5/31 0:09
 * @since: 1.8.0
 * @version: 1.0.0
 */
@Component
public class WxConfigUtil implements WXPayConfig {

    private byte[] certData;
    @Value("weixin.app_id")
    public String APP_ID;
    @Value("weixin.key")
    public String KEY;
    @Value("weixin.mch_id")
    public String MCH_ID;

    public WxConfigUtil() {

    }

    @Override
    public String getAppID() {
        return APP_ID;
    }

    @Override
    public String getMchID() {
        return MCH_ID;
    }

    @Override
    public String getKey() {
        return KEY;
    }

    @Override
    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return 10000;
    }
}
