package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public abstract class EstadoArtigo {
	
	protected Artigo artigo;

	public EstadoArtigo(Artigo artigo) {
		this.artigo = artigo;
	}
	
	public void submeter() throws Exception {
		throw new Exception("Nao pode revisar agora");
	}
	
	public void revisao(int nota) throws Exception {
		throw new Exception("Nao pode revisar agora");
	}
	
	public void corrigido() throws Exception  {
		throw new Exception("Nao pode corrigir agora");
	}
	
	public void correcoesRevisadas(int nota)  throws Exception  {
		throw new Exception("Nao pode revisar as correcoes agora");
	}

	public void proxEstado() {
		// Usar no caso de estados que quando sao criados avaliam alguma condicao para ir ao proximo estado
	}
	

}
