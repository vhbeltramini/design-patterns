package main.AbstractFactory.abstractfactory5.cards;

public class TwoLoc extends Location {
    private static Location instance = new TwoLoc();

    public static Location getInstance() {
        return instance;
    }

    private TwoLoc() {
        super();
        add(new Integer(55));
        add(new Integer(105));
    }
}

