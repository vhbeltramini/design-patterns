package main.State.state1.semstate;

public class Ventilador {

	private int estadoAtual = 0;
	
	public void pressionarBotao() {
		if (estadoAtual == 0) {
			estadoAtual = 1;
			System.out.println("Baixa velocidade");
		} else {
			if (estadoAtual == 1) {
				estadoAtual = 2;
				System.out.println("Media velocidade");
			} else {
				if (estadoAtual == 2) {
					estadoAtual = 3;
					System.out.println("Alta velocidade");
				} else {
					estadoAtual = 0;
					System.out.println("Desligado");
				}
			}
		}
	}
	
}
