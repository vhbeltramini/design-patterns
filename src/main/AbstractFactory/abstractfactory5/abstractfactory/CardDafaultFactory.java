package main.AbstractFactory.abstractfactory5.abstractfactory;

import main.AbstractFactory.abstractfactory5.cards.Diamond;
import main.AbstractFactory.abstractfactory5.cards.Oval;
import main.AbstractFactory.abstractfactory5.cards.Squiggle;
import main.AbstractFactory.abstractfactory5.cards.Symbol;

public class CardDafaultFactory extends CardAbstractFactory {

    @Override
    public Symbol getCartOval() {
        return Oval.getInstance();
    }

    @Override
    public Symbol getCartDiamond() {
        return Diamond.getInstance();
    }

    @Override
    public Symbol getCartSquiggle() {
        return Squiggle.getInstance();
    }
}
