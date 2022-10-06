package main.Builder.builder2.builder;

import main.Builder.builder2.produto.Boleto;

public class BancoCaixa extends Banco {

	@Override
	public void construirCedente(String cedente) {
		super.construirCedente(cedente.toUpperCase());
	}

}
