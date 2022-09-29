package com.project.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfig {
	@Value("${spring.mail.host}") //smtp
	private String HOST;
	@Value("${spring.mail.port}") ///587
	private int PORT;
	@Value("${spring.mail.username}") //name
	private String USERNAME;
	@Value("${spring.mail.password}") //ryagudbasidbhsi
	private String PASSWORD;
	
	
	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(HOST);
		mailSender.setPort(PORT);
		mailSender.setUsername(USERNAME);
		mailSender.setPassword(PASSWORD);
		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");
		return mailSender;
	}
}
