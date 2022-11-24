package main.State.state4.pedido.estado;

import main.State.state4.pedido.Pedido;

public class Registrado extends EstadoPedido {

    public Registrado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void analisar() {
        this.pedido.setEstado(new EmAnalise(this.pedido));
    }

}
