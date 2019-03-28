package br.com.friends.notification.sms;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Configuration
@EqualsAndHashCode(callSuper=false)
@ConfigurationProperties(value="sms")
public class SMSProperties {
	private String apikey;
	private String url;
	private String sender;
}
