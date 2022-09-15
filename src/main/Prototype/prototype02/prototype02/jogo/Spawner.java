package main.Prototype.prototype02.prototype02.jogo;

public class Spawner<T extends Inimigo> {

	private T base;

	public Spawner(T base) {
		this.base = base;
	}
	
	public T spawn() throws Exception {
		return (T) base.clone();
	}

}
