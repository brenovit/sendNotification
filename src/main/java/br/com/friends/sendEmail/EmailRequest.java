package br.com.friends.sendEmail;

import lombok.Data;

@Data
public class EmailRequest {	
	private String subject;
	private String message;
	private String to;
}
