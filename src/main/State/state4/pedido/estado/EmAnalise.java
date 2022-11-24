package main.State.state4.pedido.estado;

import main.State.state4.pedido.Pedido;

public class EmAnalise extends EstadoPedido {

    public EmAnalise(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void suspender() throws Exception {
        this.pedido.setEstado(new Pendente(this.pedido));
    }

    @Override
    public void cancelar() throws Exception {
        this.pedido.setEstado(new Cancelado(this.pedido));
    }

    @Override
    public void aprovar() throws Exception {
        this.pedido.setEstado(new Aprovado(this.pedido));
    }
}
