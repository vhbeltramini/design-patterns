package main.State.state3.cartao;

public class Bloquado extends CartaoEstado {

	private Cartao cartao;

	public Bloquado(Cartao cartao) {
		this.cartao = cartao;
	}

	@Override
	public void entrarPin(String pin) throws Exception {
		throw new Exception("Cartão bloqueado.");
	}

	@Override
	public void fazerPagamento() throws Exception {
		throw new Exception("Cartão bloqueado.");
	}
	
	@Override
	public String toString() {
		return "Bloqueado";
	}

}
