package main.Command.command3.br.udesc.pp55.command3.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {

	private List<Command> todos = new ArrayList<>();
	
	private List<Command> undo = new ArrayList<>();
	
	public void execute(Command comm) {
	
		comm.execute();
		todos.add(comm);
	}

	public void undo() {
		
		if (todos.size() > 0) {
//			todos.get(todos.size()- 1).undo();
			Command comm = todos.remove(todos.size()-1);
			comm.undo();
			undo.add(comm);
		}
		
	}
	
	
	public void redo() {
		
		if (undo.size() > 0) {
//			todos.get(todos.size()- 1).undo();
			Command comm = undo.remove(undo.size()-1);
			comm.redo();
			todos.add(comm);
		}
		
	}

}

