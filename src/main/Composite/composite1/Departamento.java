package main.Composite.composite1;

import java.util.ArrayList;
import java.util.List;

public class Departamento extends MembroEmpresa {

	private List<MembroEmpresa> membros = new ArrayList<>();
	
	public void add(MembroEmpresa membro) {
		membros.add(membro);
	}
	
	public void remove(MembroEmpresa membro) {
		membros.remove(membro);
	}
	
	public MembroEmpresa getMembroEmpresa(int index) {
		return membros.get(index);
	}
	
	@Override
	public double getSalario() {
		
		double total = 0;
		for (MembroEmpresa m:membros)
			total += m.getSalario();
		return total;
	}

}
