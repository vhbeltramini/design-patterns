package main.TemplateAndFactory.tmFm.control;

import main.TemplateAndFactory.tmFm.model.*;

public class MovimentaMontainHero extends MovimentoHeroi {
    @Override
    protected Heroi criarPeca() {
        return new MontainHero();
    }

    @Override
    protected boolean validarOutrosTiposCasas(Peca peca) {
        return !peca.getClass().equals(Agua.class);
    }
}
