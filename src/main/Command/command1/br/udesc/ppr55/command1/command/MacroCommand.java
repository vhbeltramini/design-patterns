package main.Command.command1.br.udesc.ppr55.command1.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

	private List<Command> comms = new ArrayList<>();
	
	public void add(Command comm) {
		comms.add(comm);
	}
	
	@Override
	public void execute() {
		for (Command comm:comms) {
			comm.execute();
		}
	}

	@Override
	public void undo() {
		for (int i=comms.size()-1; i>=0; i--) {
			comms.get(i).undo();
		}
	}

	@Override
	public void redo() {
		for (Command comm:comms) {
			comm.redo();
		}
	}
	
	@Override
	public String toString() {
		String ret = "Macro : ";
		for (Command comm:comms) {
			ret += "\n " + comm;
		}
		return ret;
	}

}
