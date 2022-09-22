package main.AbstractFactory.abstractfactory5.cards;

import java.awt.*;

// class Oval knows how to draw ovals
public class Oval extends Symbol {

    private static Oval instance = new Oval();

    private Oval() {
    }

    public static Symbol getInstance() {
        return instance;
    }

    // the draw method draws an oval
    public void draw(Graphics g, int yValue, Color colour, Color backGround,
                     Shading shading) {

        // Draw the oval
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(colour);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawOval(40, yValue, 70, 40);

        // Fill the oval
        g2d.setPaint(shading.getPaint(colour, backGround));
        g2d.fillOval(40, yValue, 70, 40);
    }
}
