package main.Provas.P2;

public abstract class Elemento {

    private String conteudo;

    public Elemento(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public abstract String getConteudoHTML();
    public abstract String getConteudoBBCode();

    public void accept(Visitor visitor) {
        visitor.visitElement(this);
    }
}
