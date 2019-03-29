package br.com.friends.notification.general.command;

import br.com.friends.notification.general.NotificationRequest;
import lombok.SneakyThrows;

public class SendEmailCommand implements Command {
	
	private NotificationCommand command;
	private NotificationRequest request;
	
	public SendEmailCommand(NotificationCommand command, NotificationRequest request) {
		this.command = command;
		this.request = request;
	}
	
	@Override
	@SneakyThrows
	public void execute() {
		command.sendEmail(request);
	}

}
