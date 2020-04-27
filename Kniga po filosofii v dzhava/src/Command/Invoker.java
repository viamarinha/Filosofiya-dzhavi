package Command;

public class Invoker {

	private Command command;

	public void setCommand(Command command) 
	{
		this.command = command;
	}

	public void turnTvon() 
	{
		command.execute();
	}
}
