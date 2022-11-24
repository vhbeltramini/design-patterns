package main.State.state3.cartao;

public class ProntoParaUsar extends CartaoEstado {

	private Cartao cartao;

	public ProntoParaUsar(Cartao cartao) {
		this.cartao = cartao;
	}

	@Override
	public void entrarPin(String pin) throws Exception {
		if (pin.equals("XXXX")) {
			cartao.setTentativas(0);
			cartao.setEstado(new ProntoParaPagamento(cartao));
		} else {
			cartao.setTentativas(cartao.getTentativas()+1);
			if (cartao.getTentativas() >= 3 ) {
				cartao.setEstado(new Bloquado(this.cartao));
			}
			throw new Exception("Erro de PIN");
		}
	}

	@Override
	public void fazerPagamento() throws Exception {
		throw new Exception("N\u00E3o podes fazer o pagamento.");
	}

	@Override
	public String toString() {
		return "ProntoParaUsar";
	}
}
