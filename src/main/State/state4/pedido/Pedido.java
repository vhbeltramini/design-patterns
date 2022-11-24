package main.State.state4.pedido;

import main.State.state4.pedido.estado.EstadoPedido;
import main.State.state4.pedido.estado.Registrado;

public class Pedido {

	private EstadoPedido estadoPedido;

	public void setEstado(EstadoPedido estado) {
		this.estadoPedido = estado;
	}
	
	public Pedido() {
		this.estadoPedido = new Registrado(this);
	}
	
	public void analisar() throws Exception  {
		estadoPedido.analisar();
	}
	
	public void suspender() throws Exception  {
		estadoPedido.suspender();
	}
	
	public void retomar() throws Exception  {
		estadoPedido.retomar();
	}
	
	public void cancelar() throws Exception  {
		estadoPedido.cancelar();
	}
	
	public void aprovar() throws Exception  {
		estadoPedido.aprovar();
	}
	
	public void atender() throws Exception  {
		estadoPedido.atender();
	}
}
