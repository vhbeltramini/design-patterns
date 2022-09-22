package main.AbstractFactory.abstractfactory5.cards;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Vector;

// The Card class represents cards on a Solitaire Deck
// Each card has four properties, a colour, a shading pattern
// a number of designs and a symbol.
// In this class all objects are blue and ovals.
public class Card extends JComponent {
    static final int xSize = 150; // the width of the card

    static final int ySize = 200; // the height of the card

    static final Color backGround = new Color(240, 240, 240); // background card colour

    static Vector cardsInSet = new Vector();

    private Color colour; // the cards colour (red, green or purple)

    private Shading shading; // the cards shading (filled, outlined or
    // striped)

    private Location location; // the y location on the card where the shape is
    // drawn

    private Symbol symbol; // the shape to draw (oval, diamond, or squiggle)

    private int index; // the index in the array of cards where this one is
    // stored

    private int strokeIndex = 0; // a toggle switch for bolding the edges of
    // the card

    // the stroke width to use when drawing
    private Stroke cardStroke[] = {new BasicStroke(2.0f),
            new BasicStroke(5.0f)};

    // An array of colours for the border of the card
    private Color strokeColor[] = {Color.black, Color.blue};

    // the constructor simply sets each of the cards properties
    public Card(Color color, Shading shading, Location location, Symbol symbol) {
        this.colour = color;
        this.shading = shading;
        this.location = location;
        this.symbol = symbol;
        setSize(xSize, ySize);
    }

    // toString is included mostly for debugging
    public String toString() {
        return "Card " + colour + " " + symbol;
    }

    // paint draws the cards background and then places the shapes on it
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g; // the 2D graphics context

        Dimension d = getSize(); // the size of the card

        // This code draws the offwhite background
        g2d.setColor(backGround);
        g2d.fillRoundRect(1, 1, (int) d.getWidth() - 2,
                (int) d.getHeight() - 2, 20, 20);

        // Paint the border of the card
        g2d.setPaint(strokeColor[strokeIndex]);
        g2d.setStroke(cardStroke[strokeIndex]);
        g2d.drawRoundRect(1, 1, (int) d.getWidth() - 2,
                (int) d.getHeight() - 2, 20, 20);

        // We loop through this cards location drawing the symbol
        for (int i = 0; i < location.size(); i++) {
            int yValue = ((Integer) location.get(i)).intValue();
            symbol.draw(g2d, yValue, colour, backGround, shading);
        }
    }

    // the following methods are defined to keep layout managers and others from
    // changing the size of the card. Note that the location can still be set
    // using either setBounds or setLocation
    public void setSize(int width, int height) {
        super.setSize(xSize, ySize);
    }

    public void setSize(Dimension d) {
        super.setSize(xSize, ySize);
    }

    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, xSize, ySize);
    }

    public void setBounds(Rectangle r) {
        super.setBounds((int) r.getX(), (int) r.getY(), xSize, ySize);
    }

    // set and get the index of this card in the array of cards
    public void setIndex(int i) {
        index = i;
    }

    public int getIndex() {
        return index;
    }

    // set and get whether the edge of the card is bold or not
    public void setBold(boolean b) {
        if (b)
            strokeIndex = 1;
        else
            strokeIndex = 0;
    }

    public boolean getBold() {
        return strokeIndex == 1;
    }

    public void changeBold() {
        strokeIndex = (strokeIndex + 1) % 2;
    }

    // Check if three cards are all the same colour or all different
    public static boolean colourSet(Card one, Card two, Card three) {
        if ((one.colour == two.colour && one.colour == three.colour)
                || (one.colour != two.colour && one.colour != three.colour && two.colour != three.colour))
            return true;
        return false;
    }

    // Check if three cards all have the same shading or are all different
    public static boolean shadingSet(Card one, Card two, Card three) {
        if ((one.shading == two.shading && one.shading == three.shading)
                || (one.shading != two.shading && one.shading != three.shading && two.shading != three.shading))
            return true;
        return false;
    }

    // Check if three cards all have the same symbol or are all different
    public static boolean symbolSet(Card one, Card two, Card three) {
        if ((one.symbol == two.symbol && one.symbol == three.symbol)
                || (one.symbol != two.symbol && one.symbol != three.symbol && two.symbol != three.symbol))
            return true;
        return false;
    }

    // Check if three cards all have the same number of spots or are all
    // different
    public static boolean numberSet(Card one, Card two, Card three) {
        if ((one.location == two.location && one.location == three.location)
                || (one.location != two.location
                && one.location != three.location && two.location != three.location))
            return true;
        return false;
    }
}

