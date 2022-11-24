package main.State.state4.pedido.estado;

import main.State.state4.pedido.Pedido;


public class Pendente extends EstadoPedido {

    public Pendente(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void retomar() throws Exception {
        this.pedido.setEstado(new EmAnalise(this.pedido));
    }

    @Override
    public void cancelar() throws Exception {
        this.pedido.setEstado(new Cancelado(this.pedido));
    }
}
