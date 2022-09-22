package main.AbstractFactory.abstractfactory2.fiat.ford;

import main.AbstractFactory.abstractfactory2.abstractFactory.CarroPopular;

public class Palio implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Fiesta\nF�brica: Ford\nCategoria:Popular");
	}

}
