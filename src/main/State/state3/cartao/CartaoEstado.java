package main.State.state3.cartao;

public abstract class CartaoEstado {

	public abstract void entrarPin(String pin) throws Exception;

	public abstract void fazerPagamento() throws Exception;

}
