package main.Strategy.strategy3.jogo;

import main.Strategy.strategy3.strategy.Anda;
import main.Strategy.strategy3.strategy.Movimentacao;

public class Mecha {

	private Movimentacao movimentacao;

	public void mover(int x, int y) throws Exception {
		getMovimentacao().mover(this);
	}
	public Movimentacao getMovimentacao() {
		if (movimentacao == null ) {
			movimentacao = new Anda();
		}
		return movimentacao;
	}

	public void setMovimentacao(Movimentacao movimentacao) {
		this.movimentacao = movimentacao;
	}
}
