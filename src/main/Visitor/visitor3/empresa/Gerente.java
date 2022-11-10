package main.Visitor.visitor3.empresa;

import main.Visitor.visitor3.visitor.FuncionarioVisitor;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario, 25);
	}

	public void accept(FuncionarioVisitor visitor) throws Exception {
		visitor.visitGerente(this);
	}

}
