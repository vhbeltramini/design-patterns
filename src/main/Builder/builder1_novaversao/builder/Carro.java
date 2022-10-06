package main.Builder.builder1_novaversao.builder;

import java.util.Arrays;

import main.Builder.builder1_novaversao.builder.pecas.Motor;
import main.Builder.builder1_novaversao.builder.pecas.Pneu;

public class Carro {

	private Motor motor;
	private Pneu[] pneus;
	
	private Carro(CarroBuilder builder) {
		this.motor = builder.motor;
		this.pneus = builder.pneus;
	}

	public Motor getMotor() {
		return motor;
	}
	
	public Pneu[] getPneus() {
		return pneus;
	}
	
	@Override
	public String toString() {
		return motor + " - " + Arrays.toString(pneus);
	}
	
	public static class CarroBuilder {
		
		private Motor motor;
		private Pneu[] pneus;
		
		public void reset() {
			this.motor = null;
			this.pneus = null;
		}
		
		public CarroBuilder motor(Motor motor) {
			this.motor = motor;
			return this;
		}
		
		public CarroBuilder pneus(Pneu... pneus) {
			this.pneus = pneus;
			return this;
		}
		
		public Carro build() {
			return new Carro(this);
		}
	}
}
