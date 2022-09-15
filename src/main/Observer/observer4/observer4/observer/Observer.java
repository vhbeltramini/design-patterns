package main.Observer.observer4.observer4.observer;

import main.Observer.observer4.observer4.revista.Edicao;
import main.Observer.observer4.observer4.revista.Revista;

public interface Observer {

    void atualizaVersao(Revista revista, Edicao edicao);

}
