package br.com.friends.notification.general;

import lombok.Data;

@Data
public class NotificationRequest {	
	private String subject;
	private String message;
	private String email;
	private String number;
}
