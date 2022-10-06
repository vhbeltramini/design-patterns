package main.AbstractFactory.abstractfactory5.cards;

public class ThreeLoc extends Location {
    private static Location instance = new ThreeLoc();

    public static Location getInstance() {
        return instance;
    }

    private ThreeLoc() {
        super();
        add(new Integer(30));
        add(new Integer(80));
        add(new Integer(130));
    }
}
