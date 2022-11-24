package main.State.state3;

import main.State.state3.cartao.Cartao;

public class Sistema {

	public static void main(String[] args) throws Exception {

		Cartao cartao = new Cartao();

		System.out.println(cartao);
		System.out.println(cartao.getTentativas());

		try {
			cartao.entrarPin("ZZ");
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " : " + cartao);
		}
		
		try {
			cartao.fazerPagamento();
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " : " + cartao);
		}
		
		try {
			cartao.entrarPin("XXXX");
			System.out.println(cartao);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " : " + cartao);
		}
		
		try {
			cartao.entrarPin("XXXX");
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " : " + cartao);
		}

		try {
			cartao.fazerPagamento();
			System.out.println(cartao);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " : " + cartao);
		}
		
		for (int i = 0; i < 4; i++)
			try {
				cartao.entrarPin("ZZZ");
			} catch (Exception ex) {
				System.out.println(ex.getMessage() + " : " + cartao);
			}


		
	}

}
