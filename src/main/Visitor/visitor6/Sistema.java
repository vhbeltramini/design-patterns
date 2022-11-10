package main.Visitor.visitor6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import main.Visitor.visitor6.equipe.Funcionario;
import main.Visitor.visitor6.visitor.VisitorCustoProjeto;
import main.Visitor.visitor6.visitor.VisitorEmpresa;
import main.Visitor.visitor6.visitor.VisitorFimProjeto;
import main.Visitor.visitor6.visitor.VisitorMontarEquipe;

public class Sistema {

	private static List<Funcionario> funcionarios = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		
		funcionarios.add(new Funcionario("A", 1500, "Programador"));
		funcionarios.add(new Funcionario("B", 2500, "Analista"));
		funcionarios.add(new Funcionario("C", 3500, "Projetista"));
		funcionarios.add(new Funcionario("D", 5000, "Analista", "Programador"));
		funcionarios.add(new Funcionario("E", 5200, "Programador", "Analista"));
		funcionarios.add(new Funcionario("F", 8500, "Programador", "Projetista", "Analista"));
		funcionarios.add(new Funcionario("G", 8700, "Analista", "Programador", "Projetista"));
		funcionarios.add(new Funcionario("H", 8700, "Programador", "Projetista", "Analista"));
		funcionarios.add(new Funcionario("I", 1500, "Programador"));
		funcionarios.add(new Funcionario("J", 2500, "Analista"));
		funcionarios.add(new Funcionario("K", 3500, "Projetista"));
		
		// nao pode mudar as linhas acima.... tudo o que for novo deve vir daqui para baixo
                // sugiro que crie metodos estaticos para atender os testes


		HashMap <String, Integer> necessidades = new HashMap<>();
		necessidades.put("Programador", 2);
		necessidades.put("Analista", 2);
		necessidades.put("Projetista", 2);

		VisitorMontarEquipe montarEquipe = new VisitorMontarEquipe("Equipe 1", necessidades);
		VisitorCustoProjeto custoProjeto = new VisitorCustoProjeto("Equipe 1");

		HashMap <String, Integer> necessidades2 = new HashMap<>();
		necessidades2.put("Programador", 4);
		necessidades2.put("Analista", 4);
		necessidades2.put("Projetista", 3);

		accept(montarEquipe);
		accept(custoProjeto);

		System.out.println(custoProjeto.getCustoProjetos());


		VisitorFimProjeto desmontarEquipe = new VisitorFimProjeto("Equipe 1");
		accept(desmontarEquipe);


		VisitorMontarEquipe montarEquipe2 = new VisitorMontarEquipe("Equipe 2", necessidades2);
		VisitorCustoProjeto custoProjeto2 = new VisitorCustoProjeto("Equipe 2");




		accept(montarEquipe2);

		accept(custoProjeto2);

		System.out.println(custoProjeto2.getCustoProjetos());


	}

	public static void accept(VisitorEmpresa visitor) throws Exception {
		for (Funcionario func:funcionarios)
			func.accept(visitor);
	}

}
 