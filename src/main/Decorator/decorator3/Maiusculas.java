package main.Decorator.decorator3;

public class Maiusculas extends TextoDecorator {

	public Maiusculas(Texto texto) {
		super(texto);
	}

	@Override
	public String getTexto() {
		return super.getTexto().toUpperCase();
	}
	
}
