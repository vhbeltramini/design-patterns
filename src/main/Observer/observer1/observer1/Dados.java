package main.Observer.observer1.observer1;

import java.util.ArrayList;
import java.util.List;

public class Dados {

    private int valorA, valorB, valorC;

    public Dados(int a, int b, int c) {
        valorA = a;
        valorB = b;
        valorC = c;
    }

    public int getValorA() {
            return valorA;
    }

    public void setValorA(int valorA) {
            this.valorA = valorA;
            notificarA();
    }

    public int getValorB() {
            return valorB;
    }

    public void setValorB(int valorB) {
            this.valorB = valorB;
            notificarB();
    }

    public int getValorC() {
            return valorC;
    }

    public void setValorC(int valorC) {
            this.valorC = valorC;
            notificarC();
    }

    private List<Observador> observadores = new ArrayList<>();
    
    public void anexar(Observador obs) {
    	this.observadores.add(obs);
    }
    
    public void desanexar(Observador obs) {
    	this.observadores.remove(obs);
    }

    private void notificarA() {
		for (Observador obs:observadores)
			obs.atualizarValorA(valorA);
	}

	private void notificarB() {
		for (Observador obs:observadores)
			obs.atualizarValorB(valorB);
	}

    private void notificarC() {
		for (Observador obs:observadores)
			obs.atualizarValorC(valorC);
	}

}
