package main.Builder.builder2.builder;

import main.Builder.builder2.produto.Boleto;

public class BancoBradesco extends Banco {

	@Override
	public void construirCarteira(String carteira) {
		super.construirCarteira("06");
	}

}
