package main.Observer.observer4.observer4.web;

import main.Observer.observer4.observer4.observer.Observer;
import main.Observer.observer4.observer4.revista.Artigo;
import main.Observer.observer4.observer4.revista.Edicao;
import main.Observer.observer4.observer4.revista.Revista;

public class WebSite implements Observer {

    private String url;

    public WebSite(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void atualizaVersao(Revista revista, Edicao edicao) {
        System.out.println("WebSite{" +
                "URL='" + getUrl() + '\'' +
                "Revista='" + revista.getNomeRevista() + '\'' +
                "Edicao='" + edicao.getNumeroEdicao() + '\'' +
                "Artigo='" + edicao.getArtigos().stream().map(Artigo::getTituloArtigo).toList() + '\'' +
                '}');
    }

}
