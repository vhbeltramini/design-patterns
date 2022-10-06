package main.Visitor.visitor2;

import main.Visitor.visitor2.arvore.ArvoreBinaria;
import main.Visitor.visitor2.visitor.ExibirEmOrdemVisitor;

public class Sistema {

	public static void main(String[] args) throws Exception {
		ArvoreBinaria arvore = new ArvoreBinaria("F");

		arvore.inserir("G");
		arvore.inserir("I");
		arvore.inserir("H");
		arvore.inserir("B");
		arvore.inserir("A");
		arvore.inserir("D");
		arvore.inserir("C");
		arvore.inserir("E");

		System.out.println("Exibir em ordem");
		ExibirEmOrdemVisitor v1 = new ExibirEmOrdemVisitor();
		arvore.accept(v1);
	}

}
