package prova;

import java.util.Date;
/* classe mock */
public class Hotel {

	public void reservar(Date date, int quarto, Cliente cliente) {
		System.out.println("Reservado " + quarto);
	}
	
	public void cancelarReserva(Date date, int quarto, Cliente cliente) throws Exception {
		System.out.println("Cancelada reserva para quarto " + quarto);
	}
	
	public void checkIn(Date date, int quarto, Cliente cliente) {
		System.out.println("CheckIn no quarto " + quarto);
	}

	public double checkOut(Date date, int quarto, Cliente cliente) {
		System.out.println("CheckOut do quarto " + quarto);
		return 0;
	}
	
	public void addConsumo(Date date, int quarto, Produto produto, int qtdade) {
		System.out.println("Adicionado consumo no quarto " + quarto);
	}

	public void pagar(int quarto, Cliente cliente, double total) {
		System.out.println("Pago no quarto " + quarto);
	}
}
 

 