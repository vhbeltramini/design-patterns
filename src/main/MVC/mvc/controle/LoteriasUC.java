package main.MVC.mvc.controle;

import main.MVC.mvc.observer.Observador;

public interface LoteriasUC {

	void iniciarSorteio();

	void sortear();

	void finalizar();

	void addObservador(Observador obs);

	void removerObservador(Observador obs);

}
