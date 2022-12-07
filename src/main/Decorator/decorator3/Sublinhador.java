package main.Decorator.decorator3;

public class Sublinhador extends TextoDecorator {

	public Sublinhador(Texto texto) {
		super(texto);
	}
	
	public String getTexto() {
		String original = super.getTexto();
		char[] array = original.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			buffer.append(array[i]).append('_');
		}
		return buffer.toString();
	}


}
