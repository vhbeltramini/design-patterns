package main.State.state4.pedido.estado;

import main.State.state4.pedido.Pedido;

public class Aprovado extends EstadoPedido {

    public Aprovado(Pedido pedido) {
        super(pedido);
    }


    @Override
    public void atender() throws Exception {
        this.pedido.setEstado(new Atendido(this.pedido));
    }

    @Override
    public void cancelar() throws Exception {
        this.pedido.setEstado(new Cancelado(this.pedido));
    }
}
