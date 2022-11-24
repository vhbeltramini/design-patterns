package main.State.state1.comstate;

public class MediaVelocidade extends EstadoVentilador {

	public MediaVelocidade(Ventilador ventilador) {
		super(ventilador);
		System.out.println("Media velocidade");
	}

	@Override
	public void proxVelocidade() {
		ventilador.setEstadoAtual(new AltaVelocidade(ventilador));
	}

}
