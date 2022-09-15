package main.Observer.observer1.observer1;

public class Tabela implements Observador {

	private int valorA, valorB, valorC; 
	
	public Tabela(Dados dados) {
		this.valorA = dados.getValorA();
		this.valorB = dados.getValorB();
		this.valorC = dados.getValorC();
	}
	
	public void imprimir() {
        System.out.println("Tabela:\nValor A: " + valorA
                + "\nValor B: " + valorB + "\nValor C: "
                + valorC);
    }

	@Override
	public void atualizarValorA(int valorA) {
		this.valorA = valorA;
		imprimir();
	}

	@Override
	public void atualizarValorB(int valorB) {
		this.valorB = valorB;
		imprimir();
	}

	@Override
	public void atualizarValorC(int valorC) {
		this.valorC = valorC;
		imprimir();
	}

}
