package main.AbstractFactory.abstractfactory2.ford;

import main.AbstractFactory.abstractfactory2.abstractFactory.CarroSedan;

public class FiestaSedan implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Fiesta\nF�brica:Ford\nCategoria:Sedan");
	}

	private int bagagem;
	
	@Override
	public void colocarBagagem(int kg) throws Exception {
		
		if (kg+bagagem < 500) {
			bagagem+=kg;
		} else {
			throw new Exception("Excesso de bagagem");
		}
	}

	@Override
	public int getKgBagageiro() {
		return bagagem;
	}

}
