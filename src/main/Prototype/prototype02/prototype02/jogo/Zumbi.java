package main.Prototype.prototype02.prototype02.jogo;

public class Zumbi extends Inimigo {

	private int visao;
	private int fatorAtaque;

	public Zumbi(int visao, int fatorAtaque) {
		super(50, 2);
		this.visao = visao;
		this.fatorAtaque = fatorAtaque;
	}

	@Override
	public int atacar() {
		return visao * fatorAtaque;
	}

	@Override
	public String toString() {
		return super.toString() + "[ " + visao + " - " + fatorAtaque + " ]";
	}
}
