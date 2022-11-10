package main.Visitor.visitor4.visitor;

import main.Visitor.visitor4.personagens.Arqueiro;
import main.Visitor.visitor4.personagens.Catapulta;
import main.Visitor.visitor4.personagens.Lanceiro;
import main.Visitor.visitor4.personagens.Personagem;

public interface VistorAtaque {

    void visitArqueiro(Arqueiro arqueiro);
    void visitCatapulta(Catapulta catapulta);
    void visitLanceiro(Lanceiro lanceiro);
}
