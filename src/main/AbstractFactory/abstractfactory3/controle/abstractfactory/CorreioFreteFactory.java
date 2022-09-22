package main.AbstractFactory.abstractfactory3.controle.abstractfactory;

public class CorreioFreteFactory extends AbstractFreteFactory {
    @Override
    public Encomenda prepararEncomendaExpresso() throws Exception {
        return new EncomendaExpressa();
    }

    @Override
    public Encomenda prepararEncomendaNormal() throws Exception {
        return new EncomendaNormal();
    }
}
