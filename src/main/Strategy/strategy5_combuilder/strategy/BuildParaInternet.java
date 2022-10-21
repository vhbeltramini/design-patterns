package main.Strategy.strategy5_combuilder.strategy;

import main.Strategy.strategy4_combuilder.pecas.MotorV8;
import main.Strategy.strategy4_combuilder.pecas.Pneu18;
import main.Strategy.strategy4_combuilder.sistema.Carro;
import main.Strategy.strategy5_combuilder.produto.Pessoa;


public class BuildParaInternet extends PessoaBuilders {

	@Override
	public Pessoa build(Pessoa pessoa) {
		Carro.CarroBuilder cb = new Carro.CarroBuilder();
		cb.motor(new MotorV8())
		  .pneus(new Pneu18(), new Pneu18(), new Pneu18(), new Pneu18());
		
		Carro carro = cb.build();
		return carro;
	}

}
