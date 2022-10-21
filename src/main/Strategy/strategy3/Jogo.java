package main.Strategy.strategy3;

import main.Strategy.strategy3.jogo.Mecha;

public class Jogo {

	public static void main(String[] args) throws Exception {
		System.out.println("Come�ou");
		
		Mecha m1 = new Mecha();
		
		m1.mover(10, 30);
		m1.mover(10, 30);
		
		m1.entrarModoVoo();
		
		m1.mover(10, 30);
		m1.mover(10, 30);
		
	}

}
