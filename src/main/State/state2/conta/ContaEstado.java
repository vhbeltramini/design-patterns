package main.State.state2.conta;

public abstract class ContaEstado {

	protected Conta conta;

	public ContaEstado(Conta conta) {
		this.conta = conta;
	}

	public final void deposito(double valor) throws Exception {
		doDeposito(valor);
		proxEstado();
	}
	
	public final void saque(double valor) throws Exception {
		doSaque(valor);
		proxEstado();
	}

	protected void doDeposito(double valor) throws Exception {
		this.conta.setSaldo(conta.getSaldo() + valor);
	}

	protected void doSaque(double valor) throws Exception {
		this.conta.setSaldo(conta.getSaldo() - valor);
	}

	protected void proxEstado() {
		if (this.conta.getSaldo() >= 0) {
			this.conta.setEstado(new ContaHabilitada(this.conta));
		} else if (this.conta.getSaldo() <= -1000) {
			this.conta.setEstado(new ContaBloqueada(this.conta));
		} else {
			this.conta.setEstado(new ContaNegativa(this.conta));
		}
	}
	
}
