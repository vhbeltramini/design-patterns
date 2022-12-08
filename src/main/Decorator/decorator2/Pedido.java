package main.Decorator.decorator2;

public class Pedido implements IServicoPedido {

	private double total;
	private String estado;

	public Pedido(double total) {
		this.total = total;
		this.estado = "Aberto";
	}

	public double getTotal() {
		return this.total;
	}

	public void addValorFrete(double valor) {
		this.total += valor;
	}

	@Override
	public void concluirPedido(Pedido pedido) {
		this.estado = "Concluido";
	}
}
