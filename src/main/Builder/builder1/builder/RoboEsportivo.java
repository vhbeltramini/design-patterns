package main.Builder.builder1.builder;

// Concrete builder
public class RoboEsportivo extends Robo {

	@Override
	public void construirMotor() {
		carro.setMotor(new MotorV8());
	}
	
	@Override
	public void construirPneus() {
		carro.setPneus(new Pneu18(), new Pneu18(), new Pneu18(), new Pneu18());
	}
	
}
