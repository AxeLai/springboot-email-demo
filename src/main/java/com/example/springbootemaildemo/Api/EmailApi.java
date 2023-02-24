package com.example.springbootemaildemo.Api;



/**
 * @author lai
 * 发送邮件接口
 */
public interface EmailApi {
    /**
     * 发送邮件
     * @param to 接收邮件的邮箱
     * @param subject 标题
     * @param content 内容
     * @param from 发送者邮箱
     */
    void sendSimpleMail(String to, String subject, String content, String from);

}
