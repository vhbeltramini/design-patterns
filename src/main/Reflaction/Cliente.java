package main.Reflaction;

public class Cliente {

	private String nome;

	public Cliente() {
		this.nome = "Padrao";
	}
	
	
	public Cliente(String nome) {
		this.nome  = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
