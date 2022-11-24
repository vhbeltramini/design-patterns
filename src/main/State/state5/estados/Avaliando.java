package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class Avaliando extends EstadoArtigo {

	public Avaliando(Artigo artigo) {
		super(artigo);
	}
	
	@Override
	public void submeter() throws Exception {
//		 this.artigo.setEstado(new Submetido(artigo));
	}

}
