package main.AbstractFactory.abstractfactory5.cards;

import java.awt.*;

// class Diamond knows how to draw diamonds
public class DiamondProva extends Symbol {

    private static DiamondProva instance = new DiamondProva();

    private DiamondProva() {
    }

    public static Symbol getInstance() {
        return instance;
    }

    // the draw method draws a diamond
    public void draw(Graphics g, int yValue, Color colour, Color backGround,
                     Shading shading) {

        // Draw the diamond
        Polygon p = new Polygon();
        p.addPoint(75, yValue);
        p.addPoint(110, yValue + 20);
        p.addPoint(75, yValue + 40);
        p.addPoint(40, yValue + 20);

        // Fill the diamond
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(colour);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawPolygon(p);
        g2d.setPaint(shading.getPaint(colour, backGround));
        g2d.fillPolygon(p);
    }
}
