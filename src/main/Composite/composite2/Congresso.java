package main.Composite.composite2;

import java.util.ArrayList;
import java.util.List;

public class Congresso {

	public static void main(String[] args) {
		
		Individuo d1 = new Individuo("D1", true);
		Individuo d2 = new Individuo("D2", false);
		Individuo d3 = new Individuo("D3", true);
		Individuo d4 = new Individuo("D4", false);
		Individuo d5 = new Individuo("D5", true);

		Orgao ong = new Orgao();
		ong.add(d3);
		ong.add(d4);
		ong.add(d5);
		
		List<Participante> participantes = new ArrayList<>();
		participantes.add(d1);
		participantes.add(d2);
		participantes.add(ong);
		
		for (int secao = 1; secao < 5; secao++) {
			int votos = 0;
			for (Participante p:participantes) {
				if (p.votarSecao(secao))
					votos++;
			}

			System.out.println("Resultado da se\u00E7\u00E3o " + secao + " : " + (votos>participantes.size()/2?"Aprovado":"Vetado"));
			
		}

		
		
	}

}
