package main.Builder.builder2.produto;

public class NovoBoleto {

	private String cedente;
	private String carteira;
	private String nossoNumero;

	private NovoBoleto(NovoBoletoBuilder builder) {
		// inicializar os atributos vindos do builder

	}
	
	public String getCedente() {
		return cedente;
	}
	
	public String getCarteira() {
		return carteira;
	}
	
	public String getNossoNumero() {
		return nossoNumero;
	}
	
	public static class NovoBoletoBuilder {

		
		// implementar os metodos de inicializacao, reset e o build
		
	}
}
