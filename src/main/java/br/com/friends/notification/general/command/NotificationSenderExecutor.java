package br.com.friends.notification.general.command;

import java.util.ArrayList;
import java.util.List;

public class NotificationSenderExecutor {
	
	private List<Command> commands;
	
	public NotificationSenderExecutor(){
		commands = new ArrayList<Command>();
	}
	
	public void add(Command command) {				
		commands.add(command);
	}
	
	public void run() {
		for (Command command : commands) {
			command.execute();
		}
	}
	
}
