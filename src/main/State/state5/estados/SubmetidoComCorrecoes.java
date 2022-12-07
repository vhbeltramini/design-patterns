package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class SubmetidoComCorrecoes extends EstadoArtigo {

	public SubmetidoComCorrecoes(Artigo artigo) {
		super(artigo);
	}

	@Override
	public void correcoesRevisadas(int nota) throws Exception {
		RevisandoCorrecoes revisandoCorrecoes = new RevisandoCorrecoes(this.artigo);

		this.artigo.setEstado(revisandoCorrecoes);

		this.artigo.correcoesRevisadas(nota);
	}
}
