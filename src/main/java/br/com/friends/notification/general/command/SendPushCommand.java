package br.com.friends.notification.general.command;

import br.com.friends.notification.general.NotificationRequest;
import lombok.SneakyThrows;

public class SendPushCommand implements Command {

	private NotificationCommand command;
	private NotificationRequest request;
	
	public SendPushCommand(NotificationCommand command, NotificationRequest request) {
		this.command = command;
		this.request = request;
	}
	
	@Override
	@SneakyThrows
	public void execute() {
		command.sendPush(request);
	}

}
