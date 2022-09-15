package main.AbstractFactory.abstractfactory2.ford;

import main.AbstractFactory.abstractfactory2.abstractFactory.CarroPopular;
import main.AbstractFactory.abstractfactory2.abstractFactory.CarroSedan;
import main.AbstractFactory.abstractfactory2.abstractFactory.FabricaDeCarro;

public class FabricaFord extends FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Fiesta();
	}

}
