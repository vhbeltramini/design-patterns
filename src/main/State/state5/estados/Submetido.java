package main.State.state5.estados;

import main.State.state5.artigo.Artigo;

public class Submetido extends EstadoArtigo {

	public Submetido(Artigo artigo) {
		super(artigo);
	}

	@Override
	public void revisao(int nota) throws Exception {
		Revisando newEstado = new Revisando(this.artigo);

		this.artigo.setEstado(newEstado);

		this.artigo.revisao(nota);
	}
}
