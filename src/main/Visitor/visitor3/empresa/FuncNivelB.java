package main.Visitor.visitor3.empresa;

import main.Visitor.visitor3.visitor.FuncionarioVisitor;

public class FuncNivelB extends Funcionario {

	public FuncNivelB(String nome, double salario) {
		super(nome, salario, 30);
	}

	public void accept(FuncionarioVisitor visitor) throws Exception {
		visitor.visitFuncNivelB(this);
	}

}
