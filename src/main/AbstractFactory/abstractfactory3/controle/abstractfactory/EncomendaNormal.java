package main.AbstractFactory.abstractfactory3.controle.abstractfactory;

import java.util.HashMap;

public class EncomendaNormal extends Encomenda {
    private HashMap<Destino, Double> preco = new HashMap<>();

    public EncomendaNormal() {
        preco.put(Destino.NORTE, 0.03);
        preco.put(Destino.CENTROOESTE, 0.04);
        preco.put(Destino.NORDESTE, 0.02);
        preco.put(Destino.SUL, 0.01);
        preco.put(Destino.SUDESTE, 0.01);

        preco.put(Destino.AMERICALATINA, 0.07);
        preco.put(Destino.AMERICADONORTE, 0.10);
        preco.put(Destino.EUROPA, 0.15);
        preco.put(Destino.AFRICA, 0.25);
        preco.put(Destino.ASIA, 0.17);
        preco.put(Destino.OCEANIA, 0.30);
    }

    @Override
    public double getPreco() throws Exception {
        if (getCubagem() > 0 || getDestino() != null) {
            return getCubagem() * preco.get(getDestino());
        }
        throw new RuntimeException("Destino e cubagem precisam ser informados");
    }
}
