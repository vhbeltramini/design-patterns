package main.Observer.observer1.observer1;

public class GraficoBarra implements Observador {

	private String barraA, barraB, barraC;
	private boolean desenhar;
	
	public GraficoBarra(Dados dados) {
		this.desenhar = false;
		atualizarValorA(dados.getValorA());
		atualizarValorB(dados.getValorB());
		atualizarValorC(dados.getValorC());
		this.desenhar = true;
	}
	
    public void imprimir() {
    	if (desenhar)
	        System.out.println("Barras:\nValor A: " + barraA + "\nValor B: "
	                + barraB + "\nValor C: " + barraC);
    }

	@Override
	public void atualizarValorA(int valorA) {
		barraA = "";
		for (int i = 0; i < valorA; i++) {
            barraA += '=';
        }
        imprimir();
	}

	@Override
	public void atualizarValorB(int valorB) {
		barraB = "";
		for (int i = 0; i < valorB; i++) {
            barraB += '=';
        }
        imprimir();
	}

	@Override
	public void atualizarValorC(int valorC) {
		barraC = "";
		for (int i = 0; i < valorC; i++) {
            barraC += '=';
        }
        imprimir();
	}

}
