package main.Builder.builder1;

import main.Builder.builder1.builder.Montadora;
import main.Builder.builder1.builder.Robo;
import main.Builder.builder1.builder.RoboEsportivoBasico;
import main.Builder.builder1.produto.Carro;

public class Cliente {

	public static void main(String[] args) {
		
		Robo robo = new RoboEsportivoBasico();
		Montadora montadora = new Montadora(robo);
		montadora.construir();
		Carro carro = robo.getResult();
		System.out.println(carro);

	}

}
