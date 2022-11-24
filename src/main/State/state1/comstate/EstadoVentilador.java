package main.State.state1.comstate;

public abstract class EstadoVentilador {

	protected Ventilador ventilador;

	public EstadoVentilador(Ventilador ventilador) {
		this.ventilador = ventilador;
	}
	
	public abstract void proxVelocidade();
	
}
