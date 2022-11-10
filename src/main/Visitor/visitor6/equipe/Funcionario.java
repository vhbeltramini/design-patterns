package main.Visitor.visitor6.equipe;

import main.Visitor.visitor3.visitor.FuncionarioVisitor;
import main.Visitor.visitor6.visitor.VisitorEmpresa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * O que jah existe na classe nao pode ser modificado (alterado).
 * Mas podes adicionar novas funcionalidades.
 */
public class Funcionario {

	private String nome;
	private List<String> funcoes;
	private double salario;
	private String projetoAtual;

	public Funcionario(String nome, double salario, String... funcoes) {
		this.nome = nome;
		this.funcoes = new ArrayList<>(Arrays.asList(funcoes));
		this.salario = salario;
		this.projetoAtual = "";
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public List<String> getFuncoes() {
		return funcoes;
	}
	
	public String getProjetoAtual() {
		return projetoAtual;
	}
	
	public void setProjetoAtual(String projeto) {
		this.projetoAtual = projeto;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	public void accept(VisitorEmpresa visitor) throws Exception {
		visitor.visitFuncionario(this);
	}


}
