package main.Strategy.strategy3.jogo;

public class Mecha {

	private boolean estahVoando;

	public void mover(int x, int y) throws Exception {
		if (estahVoando) {
			
			Thread.sleep(100); // chega mais rapido ao destino
			System.out.println("Voando");
			
		} else {
			
			Thread.sleep(1000); // demora mais para chegar ao destino
			System.out.println("Andando");
		}
	}
	
	public void entrarModoVoo() {
		this.estahVoando = true;
	}
	
	public void entrarModoAndar() {
		this.estahVoando = false;
	}
	
}
