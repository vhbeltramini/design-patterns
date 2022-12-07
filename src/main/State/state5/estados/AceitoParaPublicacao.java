package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class AceitoParaPublicacao extends EstadoArtigo {

	public AceitoParaPublicacao(Artigo artigo) {
		super(artigo);
	}

	@Override
	public void proxEstado() {
		if (this.artigo.getMediaRevisao() < this.artigo.getRevista().getNotaCortePublicacao()) {
			this.artigo.setEstado(new AguardandoCorrecoes(this.artigo));
		} else {
			this.artigo.setEstado(new AprovadoParaPublicacao(this.artigo));
		}
	}
}
