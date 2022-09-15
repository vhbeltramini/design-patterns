package main.Observer.observer5.observer5.deposito;

import main.Observer.observer5.observer5.observer.Observer;

import java.util.ArrayList;

public class Deposito {

    private ArrayList<Observer> observers = new ArrayList<>();
    private int qdtAtual;
    private int qdtCritica;
    private int qdtMax;

    public Deposito(int qdtCritica, int qdtMax) {
        this.qdtCritica = qdtCritica;
        this.qdtMax = qdtMax;
        this.qdtAtual = 0;
    }

    public int getQdtAtual() {
        return qdtAtual;
    }

    public int getQdtCritica() {
        return qdtCritica;
    }

    public int getQdtMax() {
        return qdtMax;
    }

    public void addQtdAtual(int qtd) {
        this.qdtAtual += qtd;
        for (Observer obs: observers) {
            obs.quantidadeAdicionada(qtd);
            obs.atualizaQuantidadeAtual(getQdtAtual());
        }
    }

    public void removeQtdAtual(int qtd) {
        this.qdtAtual -= qtd;
        for (Observer obs: observers) {
            obs.quantidaeRetirada(qtd);
            obs.atualizaQuantidadeAtual(getQdtAtual());
            if (getQdtAtual() >= getQdtCritica()) {
                obs.atualizaStatusQuantidadeCritica(getQdtAtual(), getQdtCritica());
            }
        }
    }


    @Override
    public String toString() {
        return "Exemplo";
    }

    public void anexar(Observer obs) {
        this.observers.add(obs);
    }

    public void desanexar(Observer obs) {
        this.observers.remove(obs);
    }


}
