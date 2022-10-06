package main.AbstractFactory.abstractfactory5.abstractfactory;

import main.AbstractFactory.abstractfactory5.cards.*;

public class CardProvaFactory extends CardAbstractFactory {

    @Override
    public Symbol getCartOval() {
        return OvalProva.getInstance();
    }

    @Override
    public Symbol getCartDiamond() {
        return DiamondProva.getInstance();
    }

    @Override
    public Symbol getCartSquiggle() {
        return SquiggleProva.getInstance();
    }
}
