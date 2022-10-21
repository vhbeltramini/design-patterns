package main.Strategy.strategy3;

import main.Strategy.strategy3.jogo.Mecha;
import main.Strategy.strategy3.strategy.Anda;
import main.Strategy.strategy3.strategy.Voa;

public class Jogo {

	public static void main(String[] args) throws Exception {
		System.out.println("Começou");
		
		Mecha m1 = new Mecha();
		
		m1.mover(10, 30);
		m1.mover(10, 30);
		
		m1.setMovimentacao(new Voa());
		
		m1.mover(10, 30);
		m1.mover(10, 30);

		m1.setMovimentacao(new Anda());

		m1.mover(10, 30);
		m1.mover(10, 30);

	}

}
