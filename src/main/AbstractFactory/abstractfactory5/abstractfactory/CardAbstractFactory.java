package main.AbstractFactory.abstractfactory5.abstractfactory;

import main.AbstractFactory.abstractfactory5.cards.Diamond;
import main.AbstractFactory.abstractfactory5.cards.Oval;
import main.AbstractFactory.abstractfactory5.cards.Squiggle;

public abstract class CardAbstractFactory {

    abstract Oval createCartOval();
    abstract Diamond createCartDiamond();
    abstract Squiggle createCartSquiggle();

}
