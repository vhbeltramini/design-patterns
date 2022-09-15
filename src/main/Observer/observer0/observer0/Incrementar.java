package main.Observer.observer0.observer0;

import java.util.ArrayList;

public class Incrementar {
        
    private ArrayList<Observer> janelas = new ArrayList<>();

    private Incrementar() {
    }

    private static Incrementar instancia;

    public static Incrementar getInstancia() {
            if (instancia == null)
                    instancia = new Incrementar();

            return instancia;
    }

    private int conta;

    public int getConta() {
            return conta;
    }

    public void inc() {
            conta++;
            attObservers();
    }

    public void anexar(Observer ob) {
        this.janelas.add(ob);
    }
    
        
    public void desanexar(Observer ob) {
    	this.janelas.remove(ob);
    }

    private void attObservers() {
        for (Observer obs:janelas)
            obs.atualizaValor(getConta());
    }

}
