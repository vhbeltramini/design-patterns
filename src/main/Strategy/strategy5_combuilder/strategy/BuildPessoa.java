package main.Strategy.strategy5_combuilder.strategy;

import main.Strategy.strategy5_combuilder.produto.Pessoa;

import java.util.HashMap;
import java.util.List;

public class BuildPessoa extends PessoaBuilders {

	@Override
	public Pessoa build(Pessoa pessoa) {
		return new Pessoa.PessoaBuilder().email(pessoa.getEmail()).build();
	}


}
