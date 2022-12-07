package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class AvaliandoCorrecoes extends EstadoArtigo {

	public AvaliandoCorrecoes(Artigo artigo) {
		super(artigo);
	}

	@Override
	public void proxEstado() {
		if (this.artigo.getMediaCorrecao() < this.artigo.getRevista().getNotaCortePublicacao() && artigo.getQuantasRevisoesCorrecao() == artigo.getQuantasCorrecoes()) {
			this.artigo.setEstado(new Reprovado(this.artigo));
		} else if (this.artigo.getMediaCorrecao() > this.artigo.getRevista().getNotaCortePublicacao() &&
		this.artigo.getQuantasRevisoesCorrecao() < this.artigo.getQuantasCorrecoes()) {
			this.artigo.setEstado(new AguardandoCorrecoes(this.artigo));
		} else if (this.artigo.getMediaCorrecao() >= artigo.getRevista().getNotaCortePublicacao()) {
			this.artigo.setEstado(new AprovadoParaPublicacao(this.artigo));
		}
	}
}
