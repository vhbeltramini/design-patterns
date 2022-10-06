package main.AbstractFactory.abstractfactory5.cards;


import java.awt.*;

// A Symbol is one of the shapes that need drawing, oval, diamond or squiggle
public abstract class Symbol {
    public static Symbol getInstance() {
        return null;
    }

    abstract public void draw(Graphics g, int yValue, Color color,
                              Color backGround, Shading shading);
}
