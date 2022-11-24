package main.State.state5.artigo;

import main.State.state5.estados.EstadoArtigo;
import main.State.state5.estados.Redigindo;
import main.State.state5.estados.Submetido;

import java.util.ArrayList;
import java.util.List;

public class Artigo {

	private String titulo;
	private List<String> nomesAutores = new ArrayList<>();
	
	private EstadoArtigo estado;
	
	private List<Integer> notasRevisores = new ArrayList<>();
	
	private List<Integer> notasCorrecaoRevisores = new ArrayList<>();
	
	private int qtasCorrecoes;
	
	private Revista revista;
	
	public Revista getRevista() {
		return revista;
	}
	
	public void addNotaRevisor(int nota) {
		notasRevisores.add(nota);
	}
	
	public int getQuantasRevisoes() {
		return notasRevisores.size();
	}
	
	public float getMediaRevisao() {
		return (float)notasRevisores.stream().mapToInt(Integer::intValue).sum() / getQuantasRevisoes();
	}
	
	public void resetNotasCorrecoes() {
		qtasCorrecoes++;
		notasCorrecaoRevisores.clear();
	}
	
	public int getQuantasCorrecoes() {
		return qtasCorrecoes;
	}
	
	public void addNotaCorrecaoRevisor(int nota) {
		notasCorrecaoRevisores.add(nota);
	}
	
	public int getQuantasRevisoesCorrecao() {
		return notasCorrecaoRevisores.size();
	}
	
	public float getMediaCorrecao() {
		return notasCorrecaoRevisores.stream().mapToInt(Integer::intValue).sum() / getQuantasRevisoesCorrecao();
	}

	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void addAutor(String nome) {
		nomesAutores.add(nome);
	}
	
	public void setEstado(EstadoArtigo estado) {
		this.estado = estado;
		System.out.println(getTitulo() + " mudou para estado: " + estado); // serve apenas para depuracao
		estado.proxEstado();
	}
	
	public Artigo(String titulo) {
		this.titulo = titulo;
		this.estado = new Redigindo(this);
	}
	
	public void submeter(Revista revista) throws Exception {
		this.revista = revista;
		this.estado = new Submetido(this);
	}
	
	public void revisao(int nota) throws Exception  {
		estado.revisao(nota);
	}
	
	public void corrigido() throws Exception  {
		estado.corrigido();
	}
	
	public void correcoesRevisadas(int nota) throws Exception  {
		estado.correcoesRevisadas(nota);
	}

}
