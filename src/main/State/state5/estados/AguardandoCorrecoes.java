package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class AguardandoCorrecoes extends EstadoArtigo {

	public AguardandoCorrecoes(Artigo artigo) {
		super(artigo);
	}

	@Override
	public void corrigido() throws Exception {
		this.artigo.setEstado(new SubmetidoComCorrecoes(this.artigo));
	}
}
