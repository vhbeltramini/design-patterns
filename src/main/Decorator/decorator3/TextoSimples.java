package main.Decorator.decorator3;

public class TextoSimples implements Texto {

	private String texto;

	public TextoSimples(String texto) {
		this.texto = texto;
	}
	
	@Override
	public String getTexto() {
		return texto;
	}
	
	@Override
	public String toString() {
		return getTexto();
	}

}
