package prova;

import java.util.Date;

public class ReservarCommand implements Command {


    private Hotel hotel;
    private int quarto;
    private Cliente cliente;
    private Date date;

    public ReservarCommand(Hotel hotel, int quarto, Cliente cliente, Date date) {
        this.hotel = hotel;
        this.quarto = quarto;
        this.cliente = cliente;
        this.date = date;
    }

    @Override
    public void execute() throws Exception {
        hotel.reservar(date, quarto, cliente);
    }

    @Override
    public void undo() throws Exception {
        hotel.cancelarReserva(date, quarto, cliente);
    }
}
