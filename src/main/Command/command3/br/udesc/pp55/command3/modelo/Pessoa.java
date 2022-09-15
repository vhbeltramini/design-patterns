package main.Command.command3.br.udesc.pp55.command3.modelo;

public class Pessoa {
	private int id;
	private String nome;
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String toString() {
		return nome + " ("+id+")";
	}
}
