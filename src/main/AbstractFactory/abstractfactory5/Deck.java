package main.AbstractFactory.abstractfactory5;// Deck.java
// This file implements a Deck of Solitaire cards


import main.AbstractFactory.abstractfactory5.cards.*;

import java.awt.*;
import java.util.*;


// The Deck class contains each of the 81 unique Solitaire cards 
public class Deck {
    private static final int NUMCARDS = 81;   // There are 81 cards in the card deck
    private Card deck [];                     // The array of cards
    private int top;                          // the top card in the remaining deck

    // the constructor initalizes the array and then each
    // card in the array
    public Deck () {
        deck = new Card[NUMCARDS];
        top = 0;

        // We maintain arrays of the properties of each card
        // By reusing the same properties, we allow == and != to work
        Color colours[] = {Color.red, new Color(0, 150, 0), new Color(150, 0, 255)};
        Shading shadings[] = {Filled.getInstance(), Outlined.getInstance(), Striped.getInstance()};
        Symbol symbols[] = {Oval.getInstance(), Diamond.getInstance(), Squiggle.getInstance()};
        Location locations[] = {OneLoc.getInstance(), TwoLoc.getInstance(), ThreeLoc.getInstance()};

        for (int i=0; i<NUMCARDS; i++) {
            deck[i] = new Card(colours[(i/27)], shadings[(i/9)%3], locations[i%3], symbols[(i/3)%3]);
        }
    }

    // Shuffles a deck and resets the top card to 0.
    // Note that shuffling is like constructing, in that it brings
    // all the cards back into the deck.
    public void shuffle() {
        Random r = new Random();
        for (int i=0; i<NUMCARDS; i++) {
            Card temp = deck[i];
            int rnum = r.nextInt(NUMCARDS);
            deck[i] = deck[rnum];
            deck[rnum] = temp;
        }
        top=0;
    }

    // Deals the top card off the deck
    public Card dealOneCard () {
        if (top < NUMCARDS)
            return deck[top++];
        else 
            System.err.println ("Empty deck!!");
        return null;
    }
   
    // Tests whether there are more cards in the deck
    public boolean isEmpty(){
        return top == NUMCARDS;
    }
}




















