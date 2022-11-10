package prova;

import java.util.Date;

public class CancelarReservaCommand implements Command {


    private Hotel hotel;
    private int quarto;
    private Cliente cliente;
    private Date date;

    public CancelarReservaCommand(Hotel hotel, int quarto, Cliente cliente, Date date) {
        this.hotel = hotel;
        this.quarto = quarto;
        this.cliente = cliente;
        this.date = date;
    }

    @Override
    public void execute() throws Exception {
        hotel.cancelarReserva(date, quarto, cliente);
    }

    @Override
    public void undo() {
        System.out.println("not implemented");
    }
}
