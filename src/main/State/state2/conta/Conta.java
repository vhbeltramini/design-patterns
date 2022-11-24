package main.State.state2.conta;

public class Conta {

	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	private ContaEstado estado;
	
	public void setEstado(ContaEstado estado) {
		this.estado = estado;
	}
	
	public Conta() {
		this.estado = new ContaHabilitada(this);
	}
	
	public void deposito(double valor) throws Exception {
		this.estado.deposito(valor);
	}
	
	public void saque(double valor) throws Exception {
		this.estado.saque(valor);
	}

	@Override
	public String toString() {
		return estado + "( " + saldo + " )";
	}
}
