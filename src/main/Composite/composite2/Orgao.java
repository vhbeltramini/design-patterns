package main.Composite.composite2;

import java.util.ArrayList;
import java.util.List;

public class Orgao extends Participante {

	private List<Participante> membros = new ArrayList<>();
	
	public void add(Participante participante) {
		membros.add(participante);
	}
	
	public void remove(Participante participante) {
		membros.remove(participante);
	}
	
	public Participante getParticipante(int index) {
		return membros.get(index);
	}

	@Override
	public boolean votarSecao(int numSecao) {
		int favor = 0;
		int contra = 0;

		for (Participante part : membros) {
			if (part.votarSecao(numSecao)) {
				favor++;
			} else {
				contra++;
			}
		}
		return favor >= contra;
	}
	
}
