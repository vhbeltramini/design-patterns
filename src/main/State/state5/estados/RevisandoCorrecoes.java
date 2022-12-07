package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class RevisandoCorrecoes extends EstadoArtigo {

	public RevisandoCorrecoes(Artigo artigo) {
		super(artigo);
	}


	@Override
	public void correcoesRevisadas(int nota) throws Exception {
		this.artigo.addNotaCorrecaoRevisor(nota);

		if (this.artigo.getQuantasRevisoesCorrecao() == artigo.getQuantasCorrecoes()) {
			this.artigo.setEstado(new AvaliandoCorrecoes(this.artigo));
		}
	}

	@Override
	public void corrigido() throws Exception {
		this.artigo.setEstado(new SubmetidoComCorrecoes(this.artigo));
	}
}
