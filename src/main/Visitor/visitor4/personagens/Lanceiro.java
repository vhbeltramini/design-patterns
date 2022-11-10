package main.Visitor.visitor4.personagens;

import main.Visitor.visitor4.visitor.VistorAtaque;

public class Lanceiro extends Personagem {

	public Lanceiro() {
		super(10, 1);
	}
	@Override
	public void accept(VistorAtaque visitor) throws Exception {
		visitor.visitLanceiro(this);
	}
}
