package main.AbstractFactory.abstractfactory3.controle.abstractfactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EncomendaExpressa extends Encomenda {

    private HashMap<Destino, Double> preco = new HashMap<>();
    private List<Destino> destinosValidos = new ArrayList<>();

    public EncomendaExpressa() {
        destinosValidos.add(Destino.NORTE);
        destinosValidos.add(Destino.CENTROOESTE);
        destinosValidos.add(Destino.NORDESTE);
        destinosValidos.add(Destino.SUL);
        destinosValidos.add(Destino.SUDESTE);
        preco.put(Destino.CENTROOESTE, 0.075);
        preco.put(Destino.NORDESTE, 0.05);
        preco.put(Destino.NORTE, 0.05);
        preco.put(Destino.SUL, 0.025);
        preco.put(Destino.SUDESTE, 0.025);
    }


    @Override
    public void setDestino(Destino destino) {
        super.setDestino(destino);
    }

    @Override
    public double getPreco() throws Exception {
        if (!destinosValidos.contains(getDestino()) || getPeso() <= 0) {
            throw new RuntimeException("Destino  ou peso invalidos");
        }
        return getPeso() * preco.get(getDestino());
    }
}
