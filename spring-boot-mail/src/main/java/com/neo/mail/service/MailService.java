package com.neo.mail.service;

/**
 * 接口: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 15:28
 * @since: 1.8.0
 * @version: 1.0.0
 */
public interface MailService {

    void sendSimpleMail(String to, String subject, String content);

    void sendHtmlMail(String to, String subject, String content);

    void sendAttachmentsMail(String to, String subject, String content, String filePath);

    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);

}
