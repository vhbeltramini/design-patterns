package main.State.state2.conta;

public class ContaHabilitada extends ContaEstado {

	public ContaHabilitada(Conta conta) {
		super(conta);
	}
	
	@Override
	public String toString() {
		return "ContaHabilitada";
	}

}
