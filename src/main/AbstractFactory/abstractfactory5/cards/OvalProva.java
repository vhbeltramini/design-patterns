package main.AbstractFactory.abstractfactory5.cards;

import java.awt.*;

// class Oval knows how to draw ovals
public class OvalProva extends Symbol {

    private static OvalProva instance = new OvalProva();

    private OvalProva() {
    }

    public static Symbol getInstance() {
        return instance;
    }

    // the draw method draws an oval
    public void draw(Graphics g, int yValue, Color color, Color backGround,
                     Shading shading) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawRect(40, yValue, 70, 40);

        g2d.setPaint(shading.getPaint(color, backGround));
        g2d.fillRect(40, yValue, 70, 40);
    }
}
