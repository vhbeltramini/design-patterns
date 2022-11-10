package main.Visitor.visitor5.visitor;

import main.Visitor.visitor5.taxi.Cliente;
import main.Visitor.visitor5.taxi.Taxi;

public class VisitorAtende implements VisitorTaxi {

    private Cliente cliente;
    private boolean atendido;

    public VisitorAtende(Cliente cliente) {
        this.cliente = cliente;
        this.atendido = false;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void visitTaxi(Taxi taxi) {
        if (!isAtendido() && (!taxi.isOcupado() && cliente.getPontoProximo() == taxi.getPontoTaxi())) {
            taxi.atender(cliente);
            this.atendido = true;
        }
    }
}
