package main.Command.command1.br.udesc.ppr55.command1.controle;

public class Calculadora {

	private int memoria;
	
	public void add(int valor) {
		memoria += valor;
	}
	
	public void subtrair(int valor) {
		memoria -= valor;
	}
	
	public void multiplicar(int valor) {
		memoria *= valor;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int valor) {
		this.memoria = valor;
	}
}
