package main.State.state5;

import main.State.state5.artigo.Artigo;
import main.State.state5.artigo.Revista;

public class Sistema {

	public static void main(String[] args) throws Exception {
		
		
		Revista r1 = new Revista("ACM Transactions on Design Patterns");
		r1.setQtosRevisores(2);
		r1.setNotaCorte(2.5f);
		
		r1.setQuantasCorrecoes(2);
		r1.setNotaCortePublicacao(4);
		
		Artigo a1 = new Artigo("Automatic Code Generation based on State Pattern");
		a1.addAutor("John Smith");
		a1.addAutor("Mary Johnson");
		
		a1.submeter(r1);
		a1.revisao(2);
		a1.revisao(1); // artigo reprovado
		
		// apos algumas correcoes, os autores resubmeteram o trabalho
		Artigo a2 = new Artigo("Automatic Python Code Generation based on State Pattern");
		a2.addAutor("John Smith");
		a2.addAutor("Mary Johnson");
		a2.addAutor("Adam West");
		
		a2.submeter(r1);
		a2.revisao(3);
		a2.revisao(2);
		
		a2.corrigido(); // apos os autores corrigirem as solicitacoes dos revisores
		a2.correcoesRevisadas(2);
		a2.correcoesRevisadas(2);
		
		a2.corrigido(); // mais algumas correcoes
		a2.correcoesRevisadas(1);
		a2.correcoesRevisadas(1); // Reprovado : ainda nao deu dessa vez
		a2.correcoesRevisadas(1); // Reprovado : ainda nao deu dessa vez
		a2.correcoesRevisadas(1); // Reprovado : ainda nao deu dessa vez
		a2.correcoesRevisadas(1); // Reprovado : ainda nao deu dessa vez
		// os autores sao insistentes
		Artigo a3 = new Artigo("Automatic Python Code Generation based on State Pattern");
		a3.addAutor("John Smith");
		a3.addAutor("Mary Johnson");
		a3.addAutor("Adam West");

		a3.submeter(r1);
		a3.revisao(4);
		a3.revisao(5); // finalmente de primeira Aprovado para Publicacao
		
		Artigo a4 = new Artigo("Good Programming Practice at Unreal Engine 4");
		a4.addAutor("Adrian Viebitz");
		a4.addAutor("Vanbert Thomas Vogel");
		a4.addAutor("Anthonny Cavenzart Hilbert");
		
		a4.submeter(r1);
		a4.revisao(3);
		a4.revisao(3);
		a4.corrigido(); // apos os autores corrigirem as solicitacoes dos revisores
		a4.correcoesRevisadas(5);
		a4.correcoesRevisadas(5); // toma !!!! Aprovado !!!
		
	}

}
