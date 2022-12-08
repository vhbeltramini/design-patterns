package main.Decorator.decorator2;

import main.Decorator.decorator0.ServicoEmailDecorator;

import java.util.Objects;

public class FretePedido extends ServicoPedidoDecorator {

    private String tipoTransporte;

    public FretePedido(IServicoPedido iServicoPedido, String tipoTransporte) {
        super(iServicoPedido);
        this.tipoTransporte = tipoTransporte;
    }

    @Override
    public void concluirPedido(Pedido pedido) {
        if (Objects.equals(tipoTransporte, "Correio")) {
            System.out.println("O pedido será enviado utilizando o " + tipoTransporte);
            pedido.addValorFrete(40.0);
            super.concluirPedido(pedido);
            return;
        }
        System.out.println("O pedido será enviado utilizando a" + tipoTransporte);
        pedido.addValorFrete(30.0);
        super.concluirPedido(pedido);
    }

}
