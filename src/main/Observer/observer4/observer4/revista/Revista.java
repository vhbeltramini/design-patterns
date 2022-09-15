package main.Observer.observer4.observer4.revista;

import main.Observer.observer4.observer4.observer.Observer;

import java.util.ArrayList;

public class Revista {

    private String nome;
    private ArrayList<Edicao> edicoes = new ArrayList<>();
    private ArrayList<Observer> obs = new ArrayList<>();

    public Revista(String nome) {
        this.nome = nome;
    }

    public void lancarNovaEdicao(Edicao edicao) {
        this.edicoes.add(edicao);

        for (Observer ob:obs) {
            ob.atualizaVersao(this, edicao);
        }

    }
    public String getNomeRevista() {
        return nome;
    }

    public ArrayList<Edicao> getEdicoes() {
        return edicoes;
    }

    public void addEdicao(Edicao edicao) {
        this.edicoes.add(edicao);
    }

    public void removeEdicao(Edicao edicao) {
        this.edicoes.remove(edicao);
    }

    public void anexar(Observer ob) {
        this.obs.add(ob);
    }

    public void desanexar(Observer ob) {
        this.obs.remove(ob);
    }

}
