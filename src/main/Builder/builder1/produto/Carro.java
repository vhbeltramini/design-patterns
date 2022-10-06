package main.Builder.builder1.produto;

import java.util.Arrays;

public class Carro {

	private Motor motor;
	private Pneu[] pneus;
	
	public Motor getMotor() {
		return motor;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public Pneu[] getPneus() {
		return pneus;
	}
	
	public void setPneus(Pneu... pneus) {
		this.pneus = pneus;
	}
	
	@Override
	public String toString() {
		return motor + " - " + Arrays.toString(pneus);
	}
	
}
