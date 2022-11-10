package main.Visitor.visitor5.setor;

import main.Visitor.visitor5.taxi.Taxi;
import main.Visitor.visitor5.visitor.VisitorAtende;
import main.Visitor.visitor5.visitor.VisitorTaxi;

import java.util.HashSet;
import java.util.Set;

public class Atendimento {


    // usei set para garantir que n�o existam funcionarios repetidos
    private Set<Taxi> taxis = new HashSet<>();

    public void add(Taxi taxi) {
        taxis.add(taxi);
    }


    public void accept(VisitorAtende visitor) throws Exception {
        for (Taxi taxi: taxis) {
            taxi.accept(visitor);
            if (visitor.isAtendido()) {
                break;
            }
        }

        if (!visitor.isAtendido()) {
            System.out.println("Atendimento ligou para cliente ("+visitor.getCliente().getNumeroTelefone()+") avisando que não tem taxi");
        }

        }

}
