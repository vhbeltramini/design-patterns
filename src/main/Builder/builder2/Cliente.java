package main.Builder.builder2;


import main.Builder.builder2.builder.Banco;
import main.Builder.builder2.builder.BancoBradesco;
import main.Builder.builder2.builder.BancoCaixa;

public class Cliente {

	public static void main(String[] args) {

		// Bradesco
		// TODO instanciar o builder do Bradesco

		Banco bancoBradesco = new BancoBradesco();
		GeradorBoleto gerador1 = new GeradorBoleto(bancoBradesco);
		gerador1.construir("Bino", "001", "01010101");
		 System.out.println(bancoBradesco.getBoleto());
		
		// Caixa
		// TODO instanciar o builder da Caixa
		Banco bancoCaixa = new BancoCaixa();
		GeradorBoleto gerador2 = new GeradorBoleto(bancoCaixa);
		gerador2.construir("Bino", "001", "01010101");
		 System.out.println(bancoCaixa.getBoleto());
		
		// Terceiro teste: NovoBoleto 
	}

}
