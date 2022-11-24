package main.State.state1.comstate;

public class AltaVelocidade extends EstadoVentilador {

	public AltaVelocidade(Ventilador ventilador) {
		super(ventilador);
		System.out.println("Alta velocidade");
	}

	@Override
	public void proxVelocidade() {
		ventilador.setEstadoAtual(new Desligado(ventilador));
	}

}
