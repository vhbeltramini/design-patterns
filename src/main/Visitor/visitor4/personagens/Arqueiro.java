package main.Visitor.visitor4.personagens;

import main.Visitor.visitor4.visitor.VistorAtaque;

public class Arqueiro extends Personagem {

	public Arqueiro() {
		super(15, 2);
	}

	@Override
	public void accept(VistorAtaque visitor) throws Exception {
		visitor.visitArqueiro(this);
	}
}
