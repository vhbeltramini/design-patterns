package main.Composite.composite2;


public class Individuo extends Participante {

	private boolean votaPar;

	public Individuo(String nome, boolean votaPar) {
		this.setNome(nome);
		this.votaPar = votaPar;
	}

	@Override
	public boolean votarSecao(int numSecao) {
		return (votaPar?(numSecao % 2 == 0):(numSecao % 2 == 1));
	}
	
}
