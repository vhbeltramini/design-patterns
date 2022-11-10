package main.Provas.P2;

public class Negrito extends Elemento {

    public Negrito(String conteudo) {
        super(conteudo);
    }

    @Override
    public String getConteudoHTML() {
        return "<b>"+getConteudo()+"</b>";
    }

    @Override
    public String getConteudoBBCode() {
        return "[b]"+getConteudo()+"[/b]";
    }

}
