package com.neo.mail;

import com.neo.mail.service.MailService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * 模块描述: <br>
 * ()
 *
 * @Author: Mr. xyb
 * @Date: 2019/3/22 15:35
 * @since: 1.8.0
 * @version: 1.0.0
 */
public class SendMailTest extends MailApplicationTests {

    @Autowired
    private MailService mailService;

    @Test
    public void send() {
        mailService.sendSimpleMail("2401496715@qq.com", "你好啊", "哈哈哈哈");
    }

    @Test
    public void send2() {
        String content = "<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("2401496715@qq.com", "这是一封html邮件", content);
    }

    @Test
    public void send3() {
        String filePath = "C:\\Users\\admin\\Downloads\\aa.png";
        mailService.sendAttachmentsMail("2401496715@qq.com", "这是一封带附件的邮件", "一张图片", filePath);
    }

    @Test
    public void send4() {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "C:\\Users\\admin\\Downloads\\aa.png";

        mailService.sendInlineResourceMail("2401496715@qq.com", "主题：这是有图片的邮件", content, imgPath, rscId);
    }


    @Autowired
    private TemplateEngine templateEngine;
    @Test
    public void send5() {

        Context context = new Context();
        context.setVariable("id","010");
        context.setVariable("name","xyb");
        String emailTemplate = templateEngine.process("emailTemplate", context);
        mailService.sendHtmlMail("2401496715@qq.com","主题：这里是模板邮件",emailTemplate);
    }

}
