package main.AbstractFactory.abstractfactory3.controle.abstractfactory;

import java.util.HashMap;

public class EncomendaNormalNorthAmerica extends Encomenda {

    public EncomendaNormalNorthAmerica() {
        setDestino(Destino.AMERICADONORTE);
    }

    @Override
    public double getPreco() throws Exception {
        if (getCubagem() <= 0 || getPeso() <= 0) {
            throw new RuntimeException("Peso e cubagem precisam ser informados");
        }
        double fatorMod;
        if (getCubagem() <= 27000) {
            fatorMod = 0.3;
        } else if (getCubagem() > 27000 && getCubagem() <= 31600) {
            fatorMod = 0.7;
        } else {
            fatorMod = 1.0;
        }
        return getCubagem() * 0.009 + getPeso() * fatorMod * 0.005;
    }
}
