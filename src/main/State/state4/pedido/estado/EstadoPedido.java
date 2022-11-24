package main.State.state4.pedido.estado;


import main.State.state4.pedido.Pedido;

public abstract class EstadoPedido {

    protected Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void analisar() throws Exception {
        throw new Exception("not allowed");
    }

    public void suspender() throws Exception {
        throw new Exception("not allowed");
    }

    public void retomar() throws Exception {
        throw new Exception("not allowed");
    }

    public void cancelar() throws Exception {
        throw new Exception("not allowed");
    }

    public void aprovar() throws Exception {
        throw new Exception("not allowed");
    }

    public void atender() throws Exception {
        throw new Exception("not allowed");
    }
}
