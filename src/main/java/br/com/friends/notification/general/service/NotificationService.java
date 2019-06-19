package br.com.friends.notification.general.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.friends.notification.general.command.NotificationCommand;
import br.com.friends.notification.general.command.NotificationSenderExecutor;
import br.com.friends.notification.general.command.SendEmailCommand;
import br.com.friends.notification.general.command.SendPushCommand;
import br.com.friends.notification.general.command.SendSMSCommand;
import br.com.friends.notification.general.dto.NotificationRequest;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationCommand notificationCommand;
	
	public void send(NotificationRequest request) {
		NotificationSenderExecutor executor = new NotificationSenderExecutor();
		executor.add(new SendEmailCommand(notificationCommand, request));
		executor.add(new SendPushCommand(notificationCommand, request));
		executor.add(new SendSMSCommand(notificationCommand, request));
		
		executor.run();
	}	
}
