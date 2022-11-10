package prova;

import java.util.Date;

public class CheckOutCommand implements Command {


    private Hotel hotel;
    private int quarto;
    private Cliente cliente;
    private Date date;
    private Observer observer;

    public CheckOutCommand(Observer observer, Hotel hotel, int quarto, Cliente cliente, Date date) {
        this.observer = observer;
        this.hotel = hotel;
        this.quarto = quarto;
        this.cliente = cliente;
        this.date = date;
    }

    @Override
    public void execute() throws Exception {
        double total = hotel.checkOut(date, quarto, cliente);
        observer.atualizaSaldoQuartos(quarto, total);
    }

    @Override
    public void undo() {
        System.out.println("not implemented");
    }
}
