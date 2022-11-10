package main.Visitor.visitor4.visitor;

import main.Visitor.visitor4.personagens.Arqueiro;
import main.Visitor.visitor4.personagens.Catapulta;
import main.Visitor.visitor4.personagens.Lanceiro;

public class VistorAtaqueArqueiro implements VistorAtaque {

    private Arqueiro arqueiro;

    public VistorAtaqueArqueiro(Arqueiro arqueiro) {
        this.arqueiro = arqueiro;
    }

    @Override
    public void visitArqueiro(Arqueiro arqueiro) {
        arqueiro.setPontoVida(arqueiro.getPontoVida()- this.arqueiro.getForcaAtaque());
    }

    @Override
    public void visitCatapulta(Catapulta catapulta) {
        catapulta.setPontoVida(catapulta.getPontoVida()-arqueiro.getForcaAtaque());
    }

    @Override
    public void visitLanceiro(Lanceiro lanceiro) {
        lanceiro.setPontoVida(lanceiro.getPontoVida()-(arqueiro.getForcaAtaque()+1));
    }

}
