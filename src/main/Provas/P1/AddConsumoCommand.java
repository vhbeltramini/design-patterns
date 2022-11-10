package prova;

import java.util.Date;

public class AddConsumoCommand implements Command {


    private Hotel hotel;
    private int quarto;
    private Integer quantidade;
    private Cliente cliente;
    private Date date;

    private Produto produto;

    public AddConsumoCommand(Hotel hotel, int quarto, Cliente cliente, Date date, Produto produto, Integer quantidade) {
        this.hotel = hotel;
        this.quarto = quarto;
        this.cliente = cliente;
        this.date = date;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public void execute() throws Exception {
        hotel.addConsumo(date, quarto, produto, quantidade);
    }

    @Override
    public void undo() {
        System.out.println("not implemented");
    }
}
