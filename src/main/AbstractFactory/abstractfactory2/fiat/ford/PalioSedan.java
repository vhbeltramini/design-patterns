package main.AbstractFactory.abstractfactory2.fiat.ford;

import main.AbstractFactory.abstractfactory2.abstractFactory.CarroSedan;

public class PalioSedan implements CarroSedan {

	public PalioSedan(int bagagem) {
		this.bagagem = bagagem;
	}

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Palio\nF�brica:Fiat\nCategoria:Sedan");
	}

	private int bagagem;
	
	@Override
	public void colocarBagagem(int kg) throws Exception {
		
		if (kg+getKgBagageiro() < 500) {
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
