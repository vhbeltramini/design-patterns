package main.State.state1.comstate;

public class Ventilador {
	
	private EstadoVentilador estadoAtual;
	
	public Ventilador() {
		this.estadoAtual = new Desligado(this);
	}
	
	public void setEstadoAtual(EstadoVentilador estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
	public void pressionarBotao() {
		this.estadoAtual.proxVelocidade();
	}

}
