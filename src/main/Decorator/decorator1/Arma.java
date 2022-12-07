package main.Decorator.decorator1;
public class Arma implements ArmaBase {

	public void atirar() {
		System.out.println("Bang!!");
	}

	public void alcanceVisao() {
		System.out.println("Alvo localizado ateh 10 metros");
	}
	
	public void atirarComCalma() {
		alcanceVisao();
		atirar();
	}
}
