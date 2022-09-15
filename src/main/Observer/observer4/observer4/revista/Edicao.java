package main.Observer.observer4.observer4.revista;

import java.util.ArrayList;

public class Edicao {

    private int Numero;
    private ArrayList<Artigo> Artigos = new ArrayList<>();

    public Edicao(int numero) {
        Numero = numero;
    }

    public int getNumeroEdicao() {
        return Numero;
    }

    public void addArtigo(Artigo a) {
        this.Artigos.add(a);
    }

    public void removeArtigo(Artigo a) {
        this.Artigos.remove(a);
    }

    public ArrayList<Artigo> getArtigos() {
        return Artigos;
    }
}
