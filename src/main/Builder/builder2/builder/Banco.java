package main.Builder.builder2.builder;

import main.Builder.builder2.produto.Boleto;

public abstract class Banco {

	private Boleto boleto;
	
	public void construirCedente(String cedente) {
		getBoleto().setCedente(cedente);
	}

	public void construirCarteira(String carteira) {
		getBoleto().setCarteira(carteira);
	}

	public void construirNossoNumero(String nossoNumero) {
		getBoleto().setNossoNumero(nossoNumero);
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void reset() {
		this.boleto = new Boleto();
	}
}
