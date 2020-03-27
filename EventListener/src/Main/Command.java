package Main;

import java.util.ArrayList;
import java.util.List;

public class Command {
	String command;
	List<CommandChangedEvent> listeners;
	public Command()
	{
		listeners=new ArrayList<CommandChangedEvent>();
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
		for(CommandChangedEvent  l:listeners)
		{
			l.onCommandChange();
		}
	}
	public void addCommandChangedListener(CommandChangedEvent e)
	{
		listeners.add(e);
	}
	
}
