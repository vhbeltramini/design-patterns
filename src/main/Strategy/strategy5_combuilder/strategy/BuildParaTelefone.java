package main.Strategy.strategy5_combuilder.strategy;

import main.Strategy.strategy5_combuilder.produto.Pessoa;

public class BuildParaTelefone extends PessoaBuilders {

	@Override
	public Pessoa build(Pessoa pessoa) {


		return new BuildParaTelefone().build(pessoa);
	}
}
