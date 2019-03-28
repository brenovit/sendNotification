package br.com.friends.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SendNotificationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SendNotificationApplication.class, args);
	}	
}
