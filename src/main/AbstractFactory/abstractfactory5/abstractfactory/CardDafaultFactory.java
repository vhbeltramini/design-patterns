package main.AbstractFactory.abstractfactory5.abstractfactory;

import main.AbstractFactory.abstractfactory5.cards.Diamond;
import main.AbstractFactory.abstractfactory5.cards.Oval;
import main.AbstractFactory.abstractfactory5.cards.Squiggle;

public class CardDafaultFactory extends CardAbstractFactory {

    @Override
    Oval createCartOval() {
        return (Oval) Oval.getInstance();
    }

    @Override
    Diamond createCartDiamond() {
        return null;
    }

    @Override
    Squiggle createCartSquiggle() {
        return null;
    }
}
