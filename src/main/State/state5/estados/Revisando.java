package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class Revisando extends EstadoArtigo {

	public Revisando(Artigo artigo) {
		super(artigo);
	}

	@Override
	public void revisao(int nota) throws Exception {
		artigo.addNotaRevisor(nota);

		if (artigo.getQuantasRevisoes() == artigo.getRevista().getQtosRevisores()) {
			this.artigo.setEstado(new Avaliando(this.artigo));
		}
	}
}
