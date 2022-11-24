package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class AprovadoParaPublicacao extends EstadoArtigo {

	public AprovadoParaPublicacao(Artigo artigo) {
		super(artigo);
	}
	
	@Override
	public void submeter() throws Exception {
//		 this.artigo.setEstado(new Submetido(artigo));
	}

}
