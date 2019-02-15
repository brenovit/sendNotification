package br.com.friends.sendEmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SendEmailApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SendEmailApplication.class, args);
	}	
}
