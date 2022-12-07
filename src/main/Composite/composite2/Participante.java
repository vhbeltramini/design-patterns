package main.Composite.composite2;


public abstract class Participante {

	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract boolean votarSecao(int numSecao);
	
}
