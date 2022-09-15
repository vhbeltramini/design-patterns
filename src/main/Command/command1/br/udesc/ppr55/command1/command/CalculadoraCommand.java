package main.Command.command1.br.udesc.ppr55.command1.command;

import main.Command.command1.br.udesc.ppr55.command1.controle.Calculadora;

public abstract class CalculadoraCommand implements Command {

	protected Calculadora calc;
	protected int valor;

	public CalculadoraCommand(Calculadora calc, int valor) {
		this.calc = calc;
		this.valor = valor;
	}

}
