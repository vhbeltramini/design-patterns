package main.Strategy.strategy4_combuilder.strategy;

import main.Strategy.strategy4_combuilder.pecas.MotorV8;
import main.Strategy.strategy4_combuilder.pecas.Pneu18;
import main.Strategy.strategy4_combuilder.sistema.Carro;


public class BuildCarroEsportivo extends BuildCarro {

	@Override
	public Carro build() {
		Carro.CarroBuilder cb = new Carro.CarroBuilder();
		cb.motor(new MotorV8())
		  .pneus(new Pneu18(), new Pneu18(), new Pneu18(), new Pneu18());
		
		Carro carro = cb.build();
		return carro;
	}

}
