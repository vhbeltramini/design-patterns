package main.Decorator.decorator3;

public class Sistema {

	public static void main(String[] args) {

		Texto texto = new TextoSimples("Teste do Decorator");
		System.out.println(texto);
		
		Maiusculas maiusculas = new Maiusculas(texto);
		System.out.println(maiusculas);

		Sublinhador sublinhador = new Sublinhador(maiusculas);
		System.out.println(sublinhador);
		
		// Inversor: transforma o texto de tras para frente
		// Cripto: troca cada caracter pelo seu posterior, conforme tabela ASCII. Por exemplo, a vira b, b vira c e o z vira {
		
		
	}

}
