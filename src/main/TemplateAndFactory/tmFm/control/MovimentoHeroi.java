package main.TemplateAndFactory.tmFm.control;

import main.TemplateAndFactory.tmFm.model.Campo;
import main.TemplateAndFactory.tmFm.model.Heroi;
import main.TemplateAndFactory.tmFm.model.Peca;

import java.util.Objects;

public abstract class MovimentoHeroi {

	private Heroi peca;
	private int x;
	private int y;
	
	public MovimentoHeroi() {

		this.peca = criarPeca(); // outra aplicacao do template method e factory method v1
		
	}
	
	protected abstract Heroi criarPeca();

	public Heroi getPeca() {
		return peca;
	}
	
	/*
	 * Template Method: os quatro metodos seguintes possuem a logica basica. 
	 *    Porem, esses metodos invocam um metodo abstrato que deve ser implementado nos descendentes. 
	 *
	 */

	public void vaiParaCima(Peca peca) {
		// essa comparacao entre tipos de classes nao eh o mais recomendado...
		// vamos resolver isso no futuro com outros padroes
		if (peca == null || peca.getClass() == Campo.class || validarOutrosTiposCasas(peca)) {
			y--;
		}
	}

	public void vaiParaEsquerda(Peca peca) {
		// essa comparacao entre tipos de classes nao eh o mais recomendado...
		// vamos resolver isso no futuro com outros padroes
		if (peca == null || peca.getClass() == Campo.class || validarOutrosTiposCasas(peca)) {
			x--;
		}
	}

	public void vaiParaBaixo(Peca peca) {
		// essa comparacao entre tipos de classes nao eh o mais recomendado...
		// vamos resolver isso no futuro com outros padroes
		if (peca == null || peca.getClass() == Campo.class || validarOutrosTiposCasas(peca)) {
			y++;
		}
	}

	public void vaiParaDireita(Peca peca) {
		// essa comparacao entre tipos de classes nao eh o mais recomendado...
		// vamos resolver isso no futuro com outros padroes
		if (peca == null || peca.getClass() == Campo.class || validarOutrosTiposCasas(peca)) {
			x++;
		}
	}

	protected abstract boolean validarOutrosTiposCasas(Peca peca);

	public void zerarDeslocamento() {
		this.x = 0;
		this.y = 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	/*
	 * Factory Method V2: um metodo estatico que retorne a instancia de um objeto 
	 *     de acordo com o parametro especificado. 
	 */
	
	public static MovimentoHeroi criarMovimentoHeroi(String tipoHeroi) {
		MovimentoHeroi movimentoHero;
		if (Objects.equals(tipoHeroi, "Montanha")) {
			movimentoHero = new MovimentaMontainHero();
		} else {
			movimentoHero = new MovimentaWaterHero();
		}
		return movimentoHero;
	}
	
}
