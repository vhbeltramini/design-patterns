package main.Provas.P2;

public class Cabecalho extends Elemento {

    private Integer tamanho;

    public Cabecalho(Integer tamanho, String conteudo) {
        super(conteudo);
        this.tamanho = tamanho;
    }

    @Override
    public String getConteudoHTML() {
        return "<h"+tamanho+">"+getConteudo()+"</h"+tamanho+">";
    }

    @Override
    public String getConteudoBBCode() {
        return getConteudo();
    }

}
