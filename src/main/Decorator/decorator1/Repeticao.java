package main.Decorator.decorator1;

public class Repeticao extends ArmaDecorator {

	public Repeticao(ArmaBase arma) {
		super(arma);
	}

	public void atirar() {
		for (int i = 1; i <= 5; i++)
			super.atirar();
	}
	
}
