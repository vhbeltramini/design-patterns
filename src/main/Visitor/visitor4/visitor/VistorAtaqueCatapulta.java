package main.Visitor.visitor4.visitor;

import main.Visitor.visitor4.personagens.Arqueiro;
import main.Visitor.visitor4.personagens.Catapulta;
import main.Visitor.visitor4.personagens.Lanceiro;
import main.Visitor.visitor4.personagens.Personagem;

public class VistorAtaqueCatapulta implements VistorAtaque {

    private Catapulta catapulta;

    public VistorAtaqueCatapulta(Catapulta catapulta) {
        this.catapulta = catapulta;
    }

    @Override
    public void visitArqueiro(Arqueiro arqueiro) {
        arqueiro.setPontoVida(arqueiro.getPontoVida()-(catapulta.getForcaAtaque()+1));
    }

    @Override
    public void visitCatapulta(Catapulta catapulta) {
        catapulta.setPontoVida(catapulta.getPontoVida()-catapulta.getForcaAtaque());
    }

    @Override
    public void visitLanceiro(Lanceiro lanceiro) {
        lanceiro.setPontoVida(lanceiro.getPontoVida()-(catapulta.getForcaAtaque()+2));
    }
}
