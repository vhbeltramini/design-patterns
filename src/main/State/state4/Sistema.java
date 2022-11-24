package main.State.state4;


import main.State.state4.pedido.Pedido;

public class Sistema {

	public static void main(String[] args) throws Exception {

		Pedido pedido1 = new Pedido();
		try {
			pedido1.aprovar();
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		pedido1.analisar();
		
		pedido1.suspender();
		pedido1.retomar();
		
		pedido1.aprovar();
		pedido1.cancelar();
		
		try {
			pedido1.atender(); 
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		
		pedido1 = new Pedido();
		pedido1.analisar();
		pedido1.aprovar();
		pedido1.cancelar();
		try {
			pedido1.atender(); 
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		
		pedido1 = new Pedido();
		pedido1.analisar();
		pedido1.aprovar();
		pedido1.atender();

	}

}
