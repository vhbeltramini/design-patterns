package main.State.state5.artigo;

public class Revista {

	private String nome;
	private int qtosRevisores;
	private float notaCorte;
	private float notaCortePublicacao;
	private int qtasCorrecoes;

	public Revista(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getQtosRevisores() {
		return qtosRevisores;
	}

	public void setQtosRevisores(int qtosRevisores) {
		this.qtosRevisores = qtosRevisores;
	}

	public float getNotaCorte() {
		return notaCorte;
	}

	public void setNotaCorte(float notaCorte) {
		this.notaCorte = notaCorte;
	}

	public float getNotaCortePublicacao() {
		return notaCortePublicacao;
	}

	public void setNotaCortePublicacao(float notaCortePublicacao) {
		this.notaCortePublicacao = notaCortePublicacao;
	}

	public int getQuantasCorrecoes() {
		return qtasCorrecoes;
	}

	public void setQuantasCorrecoes(int qtasCorrecoes) {
		this.qtasCorrecoes = qtasCorrecoes;
	}

}
