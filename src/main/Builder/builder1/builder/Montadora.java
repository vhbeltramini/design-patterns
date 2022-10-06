package main.Builder.builder1.builder;

// Director
public class Montadora {

	private Robo robo;

	public Montadora(Robo robo) {
		this.robo = robo;
	}
	
	public void construir() {
		this.robo.reset();
		this.robo.construirMotor();
		this.robo.construirPneus();
	}
}
