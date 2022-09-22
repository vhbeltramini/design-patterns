package main.AbstractFactory.abstractfactory5.cards;

import main.AbstractFactory.abstractfactory5.Shading;

import java.awt.*;

// A Symbol is one of the shapes that need drawing, oval, diamond or squiggle
abstract class Symbol {
    public static Symbol getInstance() {
        return null;
    }

    abstract public void draw(Graphics g, int yValue, Color color,
                              Color backGround, Shading shading);
}
