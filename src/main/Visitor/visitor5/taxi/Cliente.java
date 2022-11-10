package main.Visitor.visitor5.taxi;

import main.Visitor.visitor5.visitor.VisitorTaxi;

public class Cliente {

	private String numeroTelefone;
	private int pontoProximo;
	
	public Cliente(int pontoProximo, String numeroTelefone) {
		this.pontoProximo = pontoProximo;
		this.numeroTelefone = numeroTelefone;
	}
	

	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public int getPontoProximo() {
		return pontoProximo;
	}

}
