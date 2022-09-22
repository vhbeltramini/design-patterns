package main.AbstractFactory.abstractfactory5.cards;

import java.util.Vector;

// Locations contains an array of y locations of where to
// draw the shapes. arr[0] has a vector of one element.
// This vector is used when one shape is to be drawn.
// arr[1] contains a vector of two elements.
// arr[2] contains a vector of three elements.
public abstract class Location {
    private Vector l;

    public Location() {
        l = new Vector();
    }

    public static Location getInstance() {
        return null;
    }

    public int size() {
        return l.size();
    }

    public Object get(int i) {
        return l.get(i);
    }

    protected boolean add(Object o) {
        return l.add(o);
    }
}
