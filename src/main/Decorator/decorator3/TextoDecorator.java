package main.Decorator.decorator3;

public abstract class TextoDecorator implements Texto {

	private Texto texto;

	public TextoDecorator(Texto texto) {
		this.texto = texto;
	}
	
	@Override
	public String getTexto() {
		return texto.getTexto();
	}

	@Override
	public String toString() {
		return getTexto();
	}
	
}
