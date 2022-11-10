package main.Visitor.visitor3;
import main.Visitor.visitor3.empresa.FuncNivelA;
import main.Visitor.visitor3.empresa.FuncNivelB;
import main.Visitor.visitor3.empresa.Gerente;
import main.Visitor.visitor3.empresa.Setor;
import main.Visitor.visitor3.visitor.CalcFolhaPagamentoDouble;
import main.Visitor.visitor3.visitor.CalcGozarFerias;
import main.Visitor.visitor3.visitor.FuncionarioVisitor;

public class Sistema {

	public static void main(String[] args) throws Exception {

		FuncNivelA f1 = new FuncNivelA("J", 5000);
		FuncNivelA f2 = new FuncNivelA("K", 4500);
		
		FuncNivelB f3 = new FuncNivelB("X", 1200);
		FuncNivelB f4 = new FuncNivelB("Y", 1500);
		
		Gerente g = new Gerente("AAA", 8000);
		
		Setor s = new Setor();
		s.add(f1);
		s.add(f2);
		s.add(f3);
		s.add(f4);
		s.add(g);
		
		s.setGerente(g);

		CalcFolhaPagamentoDouble v1 = new CalcFolhaPagamentoDouble();
		s.accept(v1);

		System.out.println("Gasto total salarios: " + v1.getTotalSalario());

		CalcGozarFerias v2 = new CalcGozarFerias();
		s.accept(v2);

		System.out.println("Total funcionarios que gozaram de ferias " + v2.getTotalFuncGozaramFerias());

	}

}
