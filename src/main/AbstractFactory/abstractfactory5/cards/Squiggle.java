package main.AbstractFactory.abstractfactory5.cards;

import java.awt.*;

// class Squiggle knows how to draw a squiggle
public class Squiggle extends Symbol {

    private static Squiggle instance = new Squiggle();

    private Squiggle() {
    }

    public static Symbol getInstance() {
        return instance;
    }

    // The draw method draws a squiggle
    public void draw(Graphics g, int yValue, Color colour, Color backGround,
                     Shading shading) {

        // Draw the squiggle
        Polygon p = new Polygon();
        p.addPoint(40, yValue + 30);
        p.addPoint(65, yValue);
        p.addPoint(85, yValue + 20);
        p.addPoint(110, yValue + 10);
        p.addPoint(85, yValue + 40);
        p.addPoint(65, yValue + 20);

        // Fill the squiggle
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(colour);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawPolygon(p);
        g2d.setPaint(shading.getPaint(colour, backGround));
        g2d.fillPolygon(p);
    }
}
