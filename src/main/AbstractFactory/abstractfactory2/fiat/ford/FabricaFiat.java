package main.AbstractFactory.abstractfactory2.fiat.ford;

import main.AbstractFactory.abstractfactory2.abstractFactory.CarroPopular;
import main.AbstractFactory.abstractfactory2.abstractFactory.CarroSedan;
import main.AbstractFactory.abstractfactory2.abstractFactory.FabricaDeCarro;

public class FabricaFiat extends FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new PalioSedan(400);
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Palio();
	}

}
