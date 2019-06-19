package br.com.friends.notification.general.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.friends.notification.email.EmailSenderService;
import br.com.friends.notification.general.dto.NotificationRequest;
import br.com.friends.notification.push.PushService;
import br.com.friends.notification.sms.SMSSenderService;
import lombok.SneakyThrows;

@Component
public class NotificationCommand {
	
	@Autowired
	private EmailSenderService emailService;
	@Autowired
	private PushService pushService;
	@Autowired
	private SMSSenderService smsService;

	@SneakyThrows
	public void sendEmail(NotificationRequest request) {
		emailService.sendMail(request);		
	}
	
	public void sendPush(NotificationRequest request) {
		pushService.sendPush(request);		
	}
	
	public void sendSMS(NotificationRequest request) {
		smsService.send(request);		
	}
}
