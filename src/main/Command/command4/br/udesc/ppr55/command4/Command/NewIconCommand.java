package main.Command.command4.br.udesc.ppr55.command4.Command;

import main.Command.command3.br.udesc.pp55.command3.command.Command;
import main.Command.command3.br.udesc.pp55.command3.dao.BancoPessoas;
import main.Command.command3.br.udesc.pp55.command3.observer.Observer;

public class NewIconCommand extends Command {

	private int id;
	private String nome;

	public NewIconCommand(Observer observer, String[] dados) {
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
