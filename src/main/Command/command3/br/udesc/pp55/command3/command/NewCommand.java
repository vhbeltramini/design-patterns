package main.Command.command3.br.udesc.pp55.command3.command;

import main.Command.command3.br.udesc.pp55.command3.dao.BancoPessoas;
import main.Command.command3.br.udesc.pp55.command3.observer.Observer;

public class NewCommand extends Command {

	private int id;
	private String nome;

	public NewCommand(Observer observer, String[] dados) {
		super(observer);
		id = Integer.parseInt(dados[0]);
		nome = dados[1];
	}

	@Override
	public void execute() {
		BancoPessoas.getInstance().addPessoa(id, nome);
	}

	@Override
	public void undo() {
		BancoPessoas.getInstance().removerPessoa(id);
	}

	@Override
	public void redo() {
		BancoPessoas.getInstance().addPessoa(id, nome);
	}

}
