package main.Command.command3.br.udesc.pp55.command3.command;

import main.Command.command3.br.udesc.pp55.command3.dao.BancoPessoas;
import main.Command.command3.br.udesc.pp55.command3.observer.Observer;

public class DeleteCommand extends Command {

	private int id;
	private String nome;

	public DeleteCommand(Observer observer, String[] dados) {
		super(observer);
		id = Integer.parseInt(dados[0]);
	}

	@Override
	public void execute() {
		nome = BancoPessoas.getInstance().getPessoa(id).getNome();
		BancoPessoas.getInstance().removerPessoa(id);
	}

	@Override
	public void undo() {
		BancoPessoas.getInstance().addPessoa(id, nome);
	}

	@Override
	public void redo() {
		BancoPessoas.getInstance().removerPessoa(id);
	}

}
