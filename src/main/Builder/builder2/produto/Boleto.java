package main.Builder.builder2.produto;

public class Boleto {

	private String cedente;
	private String carteira;
	private String nossoNumero;
	
	public String getCedente() {
		return cedente;
	}
	public void setCedente(String cedente) {
		this.cedente = cedente;
	}
	public String getCarteira() {
		return carteira;
	}
	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}
	public String getNossoNumero() {
		return nossoNumero;
	}
	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}
	
	@Override
	public String toString() {
		return cedente + " - " + carteira + " - " + nossoNumero;
	}
		
	
}
