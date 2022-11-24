package main.State.state3.cartao;

public class ProntoParaPagamento extends CartaoEstado {

	private Cartao cartao;

	public ProntoParaPagamento(Cartao cartao) {
		this.cartao = cartao;
		this.cartao.setTentativas(0);
	}

	@Override
	public void entrarPin(String pin) throws Exception {
		throw new Exception("PIN j\u00E1 validado.");
	}

	@Override
	public void fazerPagamento() throws Exception {
		// pagamento feito
		cartao.setEstado(new ProntoParaUsar(cartao));
	}
	
	@Override
	public String toString() {
		return "ProntoParaPagamento";
	}

}
