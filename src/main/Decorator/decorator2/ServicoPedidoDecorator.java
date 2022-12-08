package main.Decorator.decorator2;


public abstract class ServicoPedidoDecorator implements IServicoPedido {

    private IServicoPedido servico;

    public ServicoPedidoDecorator(IServicoPedido servico) {
        this.servico = servico;
    }

    @Override
    public void concluirPedido(Pedido pedido) {
        servico.concluirPedido(pedido);
    }
}
