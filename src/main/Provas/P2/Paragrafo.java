package main.Provas.P2;

public class Paragrafo extends Elemento {

    public Paragrafo(String conteudo) {
        super(conteudo);
    }

    @Override
    public String getConteudoHTML() {
        return "<p>"+getConteudo()+"</p>";
    }

    @Override
    public String getConteudoBBCode() {
        return "\\n\\n" +getConteudo()+"\\n\\n";
    }

}
