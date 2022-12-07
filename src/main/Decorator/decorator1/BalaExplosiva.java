package main.Decorator.decorator1;

public class BalaExplosiva extends ArmaDecorator {

	public BalaExplosiva(ArmaBase arma) {
		super(arma);
	}

	@Override
	public void atirar() {
		super.atirar();
		System.out.println("KABUUUUUMMMMMM!");
	}
}
