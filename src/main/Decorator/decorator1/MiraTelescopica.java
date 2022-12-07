package main.Decorator.decorator1;

public class MiraTelescopica extends ArmaDecorator {

	public MiraTelescopica(ArmaBase arma) {
		super(arma);
	}

	@Override
	public void alcanceVisao() {
		super.alcanceVisao();
		System.out.println("Alvo localizado ateh 50 metros");
	}
}
