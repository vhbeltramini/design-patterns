package main.Prototype.prototype02.prototype02.jogo;

public class Ogro extends Inimigo {

	private int forcaAtaque;

	public Ogro(int forcaAtaque) {
		super(100, 5);
		
		this.forcaAtaque = forcaAtaque;
	}

	@Override
	public int atacar() {
		return forcaAtaque;
	}

	@Override
	public String toString() {
		return super.toString() + "[" + forcaAtaque + "]";
	}

}
