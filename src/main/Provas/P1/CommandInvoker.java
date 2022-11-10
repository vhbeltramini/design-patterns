package prova;



import prova.Command;
import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {

	private List<Command> imediatos = new ArrayList<>();
	
	private List<Command> todos = new ArrayList<>();
	
	private List<Command> undo = new ArrayList<>();
	
	public void add(Command comm) {
		imediatos.add(comm);
	}
	
	public void execute() throws Exception {
		
		
		for (Command comm:imediatos) {
			comm.execute();
			todos.add(comm);
		}
		
		imediatos.clear();
		
	}

	public void undo() throws Exception {
	
		Command comm = todos.remove(todos.size()-1);
		comm.undo();
		undo.add(comm);
		
	}
	
	
	public void imprimir() {
		
		System.out.println("Log :");
		for (Command comm:todos) {
			System.out.println(" " + comm);
		}
		
	}
	
	public void execute(Command comm) throws Exception {
		comm.execute();
		todos.add(comm);
	}
}
