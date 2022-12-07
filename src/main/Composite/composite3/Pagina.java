package main.Composite.composite3;

public class Pagina extends ComponenteSite {

    String conteudo;

    public Pagina(String titulo, String url) {
        super(titulo, url);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println(this.titulo + " " + this.url);
        System.out.println();
        System.out.println(this.conteudo);
        System.out.println();
    }
}
