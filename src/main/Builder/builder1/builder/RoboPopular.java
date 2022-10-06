package main.Builder.builder1.builder;

public class RoboPopular extends Robo {
	@Override
	public void construirMotor() {
		carro.setMotor(new Motor1_0());
	}

	@Override
	public void construirPneus() {
		carro.setPneus(new PneuComum(), new PneuComum(), new PneuComum(), new PneuComum());
	}
}
