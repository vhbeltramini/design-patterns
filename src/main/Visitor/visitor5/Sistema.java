package main.Visitor.visitor5;

import main.Visitor.visitor5.setor.Atendimento;
import main.Visitor.visitor5.taxi.Cliente;
import main.Visitor.visitor5.taxi.Taxi;
import main.Visitor.visitor5.visitor.VisitorAtende;

public class Sistema {

    public static void main(String[] args) throws Exception {
        Taxi taxi1 = new Taxi(1, 1);
        Taxi taxi2 = new Taxi(2, 1);
        Taxi taxi3 = new Taxi(3, 2);
        Taxi taxi4 = new Taxi(4, 3);

        Cliente cliente1 = new Cliente(1, "2123");
        Cliente cliente2 = new Cliente(1, "212-323");
        Cliente cliente3 = new Cliente(1, "335533-23123");
        Cliente cliente4 = new Cliente(2, "212323");
        Cliente cliente5 = new Cliente(3, "2123312312312");
        Cliente cliente6 = new Cliente(4, "5555555");

        Atendimento atendimento = new Atendimento();

        atendimento.add(taxi1);
        atendimento.add(taxi2);
        atendimento.add(taxi3);
        atendimento.add(taxi4);


        VisitorAtende atende1 = new VisitorAtende(cliente1);
        VisitorAtende atende2 = new VisitorAtende(cliente2);
        VisitorAtende atende3 = new VisitorAtende(cliente3);
        VisitorAtende atende4 = new VisitorAtende(cliente4);

        atendimento.accept(atende1);
        atendimento.accept(atende2);
        atendimento.accept(atende3);
        atendimento.accept(atende4);




    }

}
