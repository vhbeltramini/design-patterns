package main.Command.command2.br.udesc.ppr55.command2.controle;

public class Deposito {

	private int quantidade;
	
	public void add(int qtdade) {
		this.quantidade += qtdade;
	}
	
	public void remove(int qtdade) {
		this.quantidade -= qtdade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
}
