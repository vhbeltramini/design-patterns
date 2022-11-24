package main.State.state2;

import main.State.state2.conta.Conta;

public class Sistema {

	public static void main(String[] args) throws Exception {
		
		
		Conta conta = new Conta(); 		System.out.println(conta);
		
		conta.deposito(1000);      System.out.println(conta);
		conta.saque(500);          System.out.println(conta); 
		conta.saque(800);          System.out.println(conta);
		conta.saque(100);
		conta.deposito(900);       System.out.println(conta);
		conta.saque(1700);         System.out.println(conta);
		try {
			conta.saque(1);
		} catch (Exception ex) {
			System.out.println(conta);
			ex.printStackTrace();
		}

	}

}
