package main.Decorator.decorator2;


public class Sistema {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100);

        IServicoPedido serviceFrete = new MensagemPedido(new FretePedido(pedido1, "Correio"), "9999-9999");

        serviceFrete.concluirPedido(pedido1);
    }

}
