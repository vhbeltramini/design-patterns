package prova;

import java.util.Date;

public class PagarCommand implements Command {


    private Hotel hotel;
    private int quarto;
    private Cliente cliente;
    private Date date;

    public PagarCommand(Hotel hotel, int quarto, Cliente cliente, Date date) {
        this.hotel = hotel;
        this.quarto = quarto;
        this.cliente = cliente;
        this.date = date;
    }

    @Override
    public void execute() throws Exception {
        hotel.pagar(quarto, cliente, DadosQuartos.getInstance().getSaldoQuarto(quarto));
    }

    @Override
    public void undo() {
        System.out.println("not implemented");
    }
}
