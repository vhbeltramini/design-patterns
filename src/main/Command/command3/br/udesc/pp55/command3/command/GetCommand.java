package main.Command.command3.br.udesc.pp55.command3.command;

import main.Command.command3.br.udesc.pp55.command3.dao.BancoPessoas;
import main.Command.command3.br.udesc.pp55.command3.observer.Observer;

public class GetCommand extends Command {

	private int id;

	public GetCommand(Observer observer, String[] dados) {
		super(observer);
		id = Integer.parseInt(dados[0]);
	}

	@Override
	public void execute() {
		System.out.println(BancoPessoas.getInstance().getPessoa(id).toString());
	}

	@Override
	public void undo() {
		System.out.println(BancoPessoas.getInstance().getPessoa(id).toString());
	}

	@Override
	public void redo() {
		System.out.println(BancoPessoas.getInstance().getPessoa(id).toString());
	}

}
