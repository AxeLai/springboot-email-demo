# springboot-email-demo
springboot实现简单的邮件发送功能

需要提供一个发送者的邮箱，切需要为邮箱开通smtp
需要的配置如下：
spring:
  mail:
    host: smtp.qq.com  #为邮箱服务商的smtp地址
    username: 110@qq.com  #发送者邮箱
    password: XXXX  #邮箱授权码
    default-encoding: UTF-8  #编码
