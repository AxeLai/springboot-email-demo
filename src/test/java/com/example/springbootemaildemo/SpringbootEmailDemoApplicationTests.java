package com.example.springbootemaildemo;

import com.example.springbootemaildemo.Api.EmailApi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootEmailDemoApplicationTests {
	@Autowired
	private EmailApi emailApi;

	@Test
	void sendEmail() {
		//接收邮箱
		String to = "***h.com";
		String subject = "***主题***";
		String content = "***内容***";

		String from  ="***接收邮箱qq.com***";
		emailApi.sendSimpleMail(to, subject, content, from);
	}

}
