package br.com.friends.notification.general;

import lombok.Data;

@Data
public class EmailRequest {	
	private String subject;
	private String message;
	private String to;
}
