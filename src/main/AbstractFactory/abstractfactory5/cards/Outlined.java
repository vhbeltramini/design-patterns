package main.AbstractFactory.abstractfactory5.cards;

import java.awt.*;

// Outlined represents the Shading for outlined cards
public class Outlined extends Shading {

    // We have exactly one instance of the Outlined class
    private static Outlined instance = new Outlined();

    // The private constructor keeps outsiders from making instances
    private Outlined() {
    }

    // getInstance returns the one instance of this class
    public static Shading getInstance() {
        return instance;
    }

    // Outlined fills the cards with the background colour
    public Paint getPaint(Color colour, Color backGround) {
        return backGround;
    }
}
