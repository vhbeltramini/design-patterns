package main.TemplateAndFactory.tmFm.control;

import main.TemplateAndFactory.tmFm.model.*;

public class MovimentaWaterHero extends MovimentoHeroi{
    @Override
    protected Heroi criarPeca() {
        return new WaterHero();
    }

    @Override
    protected boolean validarOutrosTiposCasas(Peca peca) {
        return !peca.getClass().equals(Montanha.class);
    }
}
