package main.AbstractFactory.abstractfactory3.controle.abstractfactory;

public class NorthAmerciaFreteFactory extends AbstractFreteFactory {
    @Override
    public Encomenda prepararEncomendaExpresso() throws Exception {
        throw new RuntimeException("Não fazemos entregas internacionais na modalidade expressa");
    }

    @Override
    public Encomenda prepararEncomendaNormal() throws Exception {
        return new EncomendaNormalNorthAmerica();
    }
}
