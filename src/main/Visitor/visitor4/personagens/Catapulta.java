package main.Visitor.visitor4.personagens;

import main.Visitor.visitor4.visitor.VistorAtaque;

public class Catapulta extends Personagem {

	public Catapulta() {
		super(8, 5);
	}

	@Override
	public void accept(VistorAtaque visitor) throws Exception {
		visitor.visitCatapulta(this);
	}
}
