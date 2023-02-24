package com.example.springbootemaildemo.Api;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 发送邮件 实现类
 *
 * @author lai
 */
@Slf4j
@Service
public class EmailApiImpl implements EmailApi {



    @Autowired
    JavaMailSender javaMailSender;

    @Override
    @Async("asyncEmailExecutor")
    public void sendSimpleMail(String to, String subject, String content, String from){
        try {
            log.info("send-email");
            SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
            simpleMailMessage.setFrom(from);
            simpleMailMessage.setTo(to);
            simpleMailMessage.setSubject(subject);
            simpleMailMessage.setText(content);
            javaMailSender.send(simpleMailMessage);
        }catch (Exception e){
            log.error("send email failture: {}", e);
        }
    }

}
