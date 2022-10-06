package main.Visitor.visitor3.visitor;

import main.Visitor.visitor3.empresa.Gerente;
import main.Visitor.visitor3.empresa.FuncNivelA;
import main.Visitor.visitor3.empresa.FuncNivelB;

public interface FuncionarioVisitor {

	void visitGerente(Gerente gerente);
	void visitFuncNivelA(FuncNivelA funcionario);
	void visitFuncNivelB(FuncNivelB funcionario);
	
}
