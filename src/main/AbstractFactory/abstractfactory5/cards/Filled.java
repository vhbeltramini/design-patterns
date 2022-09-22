package main.AbstractFactory.abstractfactory5.cards;

import java.awt.*;

// Filled represents the Shading for filled cards
public class Filled extends Shading {

    // We have exactly one instance of the filled class
    private static Filled instance = new Filled();

    // The private constructor keeps outsiders from making instances
    private Filled() {
    }

    // getInstance returns the only instance of this class
    public static Shading getInstance() {
        return instance;
    }

    // filled uses the foreground colour to fill the card
    public Paint getPaint(Color colour, Color backGround) {
        return colour;
    }
}
