package main.Observer.observer4.observer4.main;

import main.Observer.observer4.observer4.assinante.Assinante;
import main.Observer.observer4.observer4.revista.Artigo;
import main.Observer.observer4.observer4.revista.Edicao;
import main.Observer.observer4.observer4.revista.Revista;
import main.Observer.observer4.observer4.web.WebSite;

public class Main {

    public static void main(String[] args) {
        Revista r1 = new Revista("Portugal");
        Revista r2 = new Revista("Brasil");

        Assinante a1 = new Assinante("A1", "Rua teste 1");
        Assinante a2 = new Assinante("A2", "Rua teste 2");
        Assinante a3 = new Assinante("A3", "Rua teste 3");
        Assinante a4 = new Assinante("A4", "Rua teste 4");
        Assinante a5 = new Assinante("A5", "Rua teste 5");

        WebSite webSite = new WebSite("web.udesc.br");

        r1.anexar(a1);
        r1.anexar(a2);
        r1.anexar(a3);
        r1.anexar(webSite);

        r2.anexar(a2);
        r2.anexar(a4);
        r2.anexar(webSite);

        Artigo artigo1 = new Artigo("T1");
        Artigo artigo2 = new Artigo("T2");
        Artigo artigo3 = new Artigo("T3");
        Artigo artigo4 = new Artigo("T4");
        Artigo artigo5 = new Artigo("T5");

        Edicao edicao1 = new Edicao(1);
        Edicao edicao2 = new Edicao(2);

        edicao1.addArtigo(artigo1);
        edicao1.addArtigo(artigo2);

        edicao2.addArtigo(artigo3);
        edicao2.addArtigo(artigo4);
        edicao2.addArtigo(artigo5);

        r1.lancarNovaEdicao(edicao1);
        r2.lancarNovaEdicao(edicao2);
    }

}
