package main.Decorator.decorator5;

import java.util.Random;

public class OrcBasico {

	public OrcBasico() {
		setSaude(100);
	}
	
	private static Random sorteio = new Random();
	
	private int saude;

	public int getSaude() {
		return saude;
	}

	public void setSaude(int saude) {
		this.saude = saude;
	}
	
	public int atacar() {
		return sorteio.nextInt(5);
	}
	
	public void defender(int ataque) {
		int porrada = ataque - sorteio.nextInt(2);
		if (porrada > 0)
			saude -= porrada;
	}
	
}
