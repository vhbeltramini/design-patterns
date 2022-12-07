package main.Decorator.decorator1;

public abstract class ArmaDecorator implements ArmaBase {

	private ArmaBase arma;

	public  ArmaDecorator(ArmaBase arma) {
		this.arma = arma;
	}
	
	
	public void atirarComCalma() {
		alcanceVisao();
		atirar();
	}

	@Override
	public void atirar() {
		this.arma.atirar();
	}

	@Override
	public void alcanceVisao() {
		this.arma.alcanceVisao();
	}

}
