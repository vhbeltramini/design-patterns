package main.Decorator.decorator2;

public class MensagemPedido extends ServicoPedidoDecorator {

    private String numero;

    public MensagemPedido(IServicoPedido iServicoPedido, String numero) {
        super(iServicoPedido);
        this.numero = numero;
    }

    @Override
    public void concluirPedido(Pedido pedido) {
        System.out.println("Enviando valor total para o número " + this.numero + " | Valor total = " + pedido.getTotal());
        super.concluirPedido(pedido);
    }

}
