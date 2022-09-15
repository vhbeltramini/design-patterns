package main.TemplateAndFactory.tmFm.control;

import main.TemplateAndFactory.tmFm.model.Agua;
import main.TemplateAndFactory.tmFm.model.Campo;
import main.TemplateAndFactory.tmFm.model.Montanha;
import main.TemplateAndFactory.tmFm.model.Peca;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ControleJogoImpl implements ControleJogo {

	private Peca[][] tabuleiro;
	private int ultTecla;
	private String tipoHeroi;
	private MovimentoHeroi movimentoHeroi;
	
	private List<Observador> observadores = new ArrayList<>();
	
	@Override
	public void addObservador(Observador obs) {
		observadores.add(obs);
	}
	
	@Override
	public void inicializar() {
		
		tabuleiro = new Peca[3][3];
		tabuleiro[0][0] = new Campo();
		tabuleiro[0][1] = null; // coloca uma heroi mais abaixo
		tabuleiro[0][2] = new Montanha();
		
		tabuleiro[1][0] = new Montanha();
		tabuleiro[1][1] = new Agua();
		tabuleiro[1][2] = new Agua();

		tabuleiro[2][0] = new Campo();
		tabuleiro[2][1] = new Campo();
		tabuleiro[2][2] = new Campo();
	}

	@Override
	public Icon getPeca(int col, int row) {
		
		return (tabuleiro[col][row] == null?null:tabuleiro[col][row].getImagem());
	}

	@Override
	public void pressTecla(int keyCode) {
		this.ultTecla = keyCode;
	}

	@Override
	public void run() throws Exception {
		
		this.movimentoHeroi = MovimentoHeroi.criarMovimentoHeroi(tipoHeroi);
		tabuleiro[0][1] = this.movimentoHeroi.getPeca();
		notificarMudancaTabuleiro();
		
		Thread t = new Thread() {
			
			@Override
			public void run() {
				try {
					// posicoes do heroi
					int x = 0;
					int y = 1;
					
					Peca pecaAnterior = null;
					
					while (true) {
						// lerInputs
						movimentoHeroi.zerarDeslocamento();

						// como nao interessa nesse exercicio, nao estou consistindo se chegou no limite do mundo 
						switch (ultTecla) {
						    case 37: movimentoHeroi.vaiParaEsquerda(tabuleiro[x-1][y]); break;
					    	case 38: movimentoHeroi.vaiParaCima(tabuleiro[x][y-1]); break;
						    case 39: movimentoHeroi.vaiParaDireita(tabuleiro[x+1][y]); break;
						    case 40: movimentoHeroi.vaiParaBaixo(tabuleiro[x][y+1]); break;
						}
						ultTecla = 0;

						// mudar a posicao do heroi
						if (movimentoHeroi.getX() != 0) {
							Peca p = tabuleiro[x + movimentoHeroi.getX()][y];
							tabuleiro[x + movimentoHeroi.getX()][y] = movimentoHeroi.getPeca();
							tabuleiro[x][y] = pecaAnterior;
							pecaAnterior = p;
							x = x + movimentoHeroi.getX();
						} else {
							if (movimentoHeroi.getY() != 0) {
								Peca p = tabuleiro[x][y + movimentoHeroi.getY()];
								tabuleiro[x][y + movimentoHeroi.getY()] = movimentoHeroi.getPeca();
								tabuleiro[x][y] = pecaAnterior;
								pecaAnterior = p;
								y = y + movimentoHeroi.getY();
							}
						}
						
						notificarMudancaTabuleiro();						
						
						Thread.sleep(100); // soh para dar um tempinho
					}
				} catch (Exception e) {

					notificarFimJogo(e.toString());
				}
			}
		};
		t.start();
	
		notificarIniciouJogo();
		
	}

	@Override
	public void setTipoHeroi(String tipoHeroi) {
		this.tipoHeroi = tipoHeroi;
	}

	private void notificarIniciouJogo() {
		for (Observador obs:observadores)
			obs.iniciouJogo();
	}

	private void notificarMudancaTabuleiro() {
		for (Observador obs:observadores)
			obs.mudouTabuleiro();
		
	}
	
	private void notificarFimJogo(String msgErro) {
		for (Observador obs:observadores)
			obs.fimDeJogo(msgErro);
	}

	
}
