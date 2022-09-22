package main.AbstractFactory.abstractfactory5.cards;

import java.awt.*;
import java.awt.image.BufferedImage;

// Striped represents the Shading for striped cards
class Striped extends Shading {

    // We have exactly one instance of the striped class
    private static Striped instance = new Striped();

    private Striped() {
    }

    public static Shading getInstance() {
        return instance;
    }

    // Striped objects are filled with a ShadingPaint of our creation
    public Paint getPaint(Color colour, Color backGround) {
        BufferedImage buffImage = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_RGB);

        Graphics2D gg = buffImage.createGraphics();
        gg.setColor(colour);
        gg.fillRect(0, 0, 10, 5); // draw a filled rectangle

        gg.setColor(backGround);
        gg.fillRect(0, 5, 10, 5); // draw a filled rectangle

        // paint buffImage onto the JFrame
        return (new TexturePaint(buffImage, new Rectangle(10, 12)));
    }
}
