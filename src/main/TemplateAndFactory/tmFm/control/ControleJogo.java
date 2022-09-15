package main.TemplateAndFactory.tmFm.control;

import javax.swing.*;

public interface ControleJogo {

	void inicializar() throws Exception;

	Icon getPeca(int col, int row) throws Exception;

	void pressTecla(int keyCode) throws Exception;

	void run() throws Exception;

	void setTipoHeroi(String tipoHeroi) throws Exception;

	void addObservador(Observador obs);

}
