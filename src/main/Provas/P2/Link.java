package main.Provas.P2;

public class Link extends Elemento {

    private String descricao;

    public Link(String descricao, String conteudo) {
        super(conteudo);
        this.descricao = descricao;
    }


    @Override
    public String getConteudoHTML() {
        return "<a href='"+getConteudo()+"'>"+descricao+"</a>";
    }

    @Override
    public String getConteudoBBCode() {
        return "[url="+getConteudo()+"]"+descricao+"[/url]";
    }
}
