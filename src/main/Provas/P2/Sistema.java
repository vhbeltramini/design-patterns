package main.Provas.P2;

public class Sistema {

	/* Nao pode alterar o metodo main */
	public static void main(String[] args) throws Exception {
		Documento doc = new Documento();
		
		doc.addElemento(new Negrito("Este eh um texto em negrito"));
		doc.addElemento(new Link("Outra pagina", "http://outrapagina.com"));
		doc.addElemento(new Cabecalho(1, "Titulo"));
		doc.addElemento(new Paragrafo("Exemplo de paragrafo"));

		Visitor html = new HTMLVisitor();
		Visitor bbcode = new BBCodeVisitor();
		
		doc.accept(html);
		doc.accept(bbcode);
		
		System.out.println(html.toString());
		System.out.println(bbcode.toString());
	}

}
