package main.AbstractFactory.abstractfactory5.abstractfactory;

import main.AbstractFactory.abstractfactory5.cards.Diamond;
import main.AbstractFactory.abstractfactory5.cards.Oval;
import main.AbstractFactory.abstractfactory5.cards.Squiggle;

public class CardProvaFactory extends CardAbstractFactory {

    @Override
    Oval createCartOval() {
        return null;
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
