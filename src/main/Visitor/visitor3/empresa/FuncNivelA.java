package main.Visitor.visitor3.empresa;

import main.Visitor.visitor3.visitor.FuncionarioVisitor;

public class FuncNivelA extends Funcionario {

	public FuncNivelA(String nome, double salario) {
		super(nome, salario, 35);
	}

	public void accept(FuncionarioVisitor visitor) throws Exception {
		visitor.visitFuncNivelA(this);
	}
}
