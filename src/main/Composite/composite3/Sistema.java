package main.Composite.composite3;

public class Sistema {

    public static void main(String[] args) {
        Postagem postagem = new Postagem("Como fazer uma postagem", "www.google.com/como-fazer-uma-postagem");


        Pagina pagina = new Pagina("Introdução", "www.google.com/P0-como-fazer-uma-postagem");
        pagina.setConteudo("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tortor sapien, dignissim eget imperdiet eget, tristique id metus.");
        Pagina pagina1 = new Pagina("Parte 1", "www.google.com/P1-como-fazer-uma-postagem");
        pagina1.setConteudo("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tortor sapien, dignissim eget imperdiet eget, tristique id metus.");
        Pagina pagina2 = new Pagina("Parte 2", "www.google.com/P2-como-fazer-uma-postagem");
        pagina2.setConteudo("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tortor sapien, dignissim eget imperdiet eget, tristique id metus.");

        postagem.add(pagina);
        postagem.add(pagina1);
        postagem.add(pagina2);


        postagem.imprimir();
    }
}
