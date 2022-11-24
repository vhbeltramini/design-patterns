package main.State.state3.cartao;

public class Cartao {

	private CartaoEstado estado;
	private int tentativas;
	
	public void setEstado(CartaoEstado estado) {
		this.estado = estado;
	}

	public CartaoEstado getEstado() {
		return estado;
	}

	public int getTentativas() {
		return tentativas;
	}
	
	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}
	
	public Cartao() {
		this.estado = new ProntoParaUsar(this);
	}

	public void entrarPin(String pin) throws Exception {
		this.estado.entrarPin(pin);
	}
	
	public void fazerPagamento() throws Exception {
		this.estado.fazerPagamento();
	}
	
	@Override
	public String toString() {
		return this.estado+"";
	}
}
