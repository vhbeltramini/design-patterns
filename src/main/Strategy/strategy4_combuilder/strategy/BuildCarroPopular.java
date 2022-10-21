package main.Strategy.strategy4_combuilder.strategy;

import main.Strategy.strategy4_combuilder.pecas.Motor1_0;
import main.Strategy.strategy4_combuilder.pecas.PneuComum;
import main.Strategy.strategy4_combuilder.sistema.Carro;

public class BuildCarroPopular extends BuildCarro {

	@Override
	public Carro build() {
		Carro.CarroBuilder cb = new Carro.CarroBuilder();
		
		cb.motor(new Motor1_0())
				.pneus(new PneuComum(), new PneuComum(), new PneuComum(), new PneuComum());

		return cb.build();
	}

}
