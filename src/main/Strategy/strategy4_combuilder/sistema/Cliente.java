package main.Strategy.strategy4_combuilder.sistema;

import main.Strategy.strategy4_combuilder.strategy.BuildCarro;
import main.Strategy.strategy4_combuilder.strategy.BuildCarroEsportivo;
import main.Strategy.strategy4_combuilder.strategy.BuildCarroPopular;

public class Cliente {

	public static void main(String[] args) {
		
		BuildCarro bc;
		
		bc = new BuildCarroEsportivo();
		Carro carro = bc.build();
		System.out.println(carro);
		
		bc = new BuildCarroPopular();
		Carro carro2 = bc.build();
		System.out.println(carro2);
		

	}

}
