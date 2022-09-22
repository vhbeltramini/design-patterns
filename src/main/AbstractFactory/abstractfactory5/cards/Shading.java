package main.AbstractFactory.abstractfactory5.cards;

import java.awt.*;

// Abstract class shading represents a method for filling the cards symbols
public abstract class Shading {
    public static Shading getInstance() {
        return null;
    }

    // A getter to get the paint object for the card
    abstract public Paint getPaint(Color c, Color backGround);
}
