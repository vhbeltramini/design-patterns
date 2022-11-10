package prova;

import java.util.HashMap;

public class DadosQuartos implements Observer {

    private HashMap<Integer, Double> saldosQuartos = new HashMap<>();

    private DadosQuartos() {

    }

    private static DadosQuartos instance;

    public synchronized static DadosQuartos getInstance() {
        if (instance == null)
            instance = new DadosQuartos();

        return instance;
    }

    public Double getSaldoQuarto(Integer quarto) {
        return saldosQuartos.get(quarto);
    }

    @Override
    public void atualizaSaldoQuartos(Integer quarto, Double total) {
        saldosQuartos.put(quarto, total);
    }


}
