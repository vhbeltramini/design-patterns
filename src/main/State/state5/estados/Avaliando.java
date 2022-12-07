package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class Avaliando extends EstadoArtigo {

	public Avaliando(Artigo artigo) {
		super(artigo);
	}

	@Override
	public void proxEstado() {
		if (this.artigo.getMediaRevisao() >= this.artigo.getRevista().getNotaCorte()) {
			this.artigo.setEstado(new AceitoParaPublicacao(this.artigo));
		} else {
			this.artigo.setEstado(new Reprovado(this.artigo));
		}
	}
}
