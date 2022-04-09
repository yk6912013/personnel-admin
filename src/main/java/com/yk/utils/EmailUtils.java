package com.yk.utils;

import com.yk.entity.EmailModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Arrays;

/**
 * 邮件发送工具类
 */
public class EmailUtils {

    @Resource
    static JavaMailSender javaMailSender;

    final static Logger logger = LoggerFactory.getLogger(EmailUtils.class);
    final static String PATH = "src\\main\\java\\com\\yk\\script\\";

    public static void sendEmail(EmailModel emailModel) {
        String emailTo = emailModel.getEmployee().getEmail();
        String username = emailModel.getEmployee().getName();
        String titles = emailModel.getTitle();
        String pathPy = PATH + emailModel.getPath();
        String[] args = new String[]{"python", pathPy, emailTo, username, titles};
        logger.info(Arrays.toString(args));
        try {
            Process process = Runtime.getRuntime().exec(args);
            System.out.println(args+"我是");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendGEmail(EmailModel emailModel) {
        String content = emailModel.getContent();
        String pathPy = PATH + emailModel.getPath();
        String emailTo = emailModel.getToEmail();
        String titles = emailModel.getTitle();
//        String username = emailModel.getEmployee().getName();
        String[] args = new String[]{"python", pathPy, emailTo, "测试", titles, content};
        logger.info(Arrays.toString(args));
        try {
            Process process = Runtime.getRuntime().exec(args);
            System.out.println(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
