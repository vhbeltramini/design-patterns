package main.Visitor.visitor4.visitor;

import main.Visitor.visitor4.personagens.Arqueiro;
import main.Visitor.visitor4.personagens.Catapulta;
import main.Visitor.visitor4.personagens.Lanceiro;

public class VistorAtaqueLanceiro implements VistorAtaque {

    private Lanceiro lancerio;

    public VistorAtaqueLanceiro(Lanceiro lancerio) {
        this.lancerio = lancerio;
    }

    @Override
    public void visitArqueiro(Arqueiro arqueiro) {
        arqueiro.setPontoVida(arqueiro.getPontoVida()-(this.lancerio.getForcaAtaque()-1));
    }

    @Override
    public void visitCatapulta(Catapulta catapulta) {
        catapulta.setPontoVida(catapulta.getPontoVida()-this.lancerio.getForcaAtaque());
    }

    @Override
    public void visitLanceiro(Lanceiro lanceiro) {
        lanceiro.setPontoVida(lanceiro.getPontoVida()-(this.lancerio.getForcaAtaque()));
    }
}
