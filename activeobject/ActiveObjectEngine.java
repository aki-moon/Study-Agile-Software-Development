package agilesoftwaredevelopment.designpattern.activeobject;

import java.util.LinkedList;

public class ActiveObjectEngine {
	LinkedList<Command> itsCommand = new LinkedList<Command>();

	public void addCommand(Command command) {
		itsCommand.add(command);
	}

	public void run() {
		for (Command command : itsCommand) {
			itsCommand.removeFirst();
			command.execute();
		}
	}
}
