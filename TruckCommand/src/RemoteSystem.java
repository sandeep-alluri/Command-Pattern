
public class RemoteSystem {
	
	private Command command;

	 public RemoteSystem(Command command) {

	   this.command = command;

	 }

	 public void press() {

	   this.command.execute();

	 }

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
