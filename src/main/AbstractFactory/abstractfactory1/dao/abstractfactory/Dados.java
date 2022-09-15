package main.AbstractFactory.abstractfactory1.dao.abstractfactory;

public abstract class Dados {

	public abstract void ler();
	public abstract void gravar();
	
	public void imprimir() {
		System.out.println("Classe : " + this.getClass().getSimpleName());
	}
}
