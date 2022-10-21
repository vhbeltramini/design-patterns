package main.Strategy.strategy3.strategy;

import main.Strategy.strategy3.jogo.Mecha;

public class Voa implements Movimentacao {

	@Override
	public void mover(Mecha robo) throws Exception {
		Thread.sleep(100); // chega mais rapido ao destino
		System.out.println("Voando");

	}
}
