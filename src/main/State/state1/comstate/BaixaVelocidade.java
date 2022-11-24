package main.State.state1.comstate;

public class BaixaVelocidade extends EstadoVentilador {

	public BaixaVelocidade(Ventilador ventilador) {
		super(ventilador);
		System.out.println("Baixa velocidade");
	}

	@Override
	public void proxVelocidade() {
		ventilador.setEstadoAtual(new MediaVelocidade(ventilador));
	}

}
