package br.com.friends.notification.general.command;

import br.com.friends.notification.general.NotificationRequest;

public class SendSMSCommand implements Command {
	
	private NotificationCommand command;
	private NotificationRequest request;
	
	public SendSMSCommand(NotificationCommand command, NotificationRequest request) {
		this.command = command;
		this.request = request;
	}
	
	@Override
	public void execute() {
		command.sendSMS(request);
	}
}
