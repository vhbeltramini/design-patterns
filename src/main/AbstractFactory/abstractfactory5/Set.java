package main.AbstractFactory.abstractfactory5;
/*
 * Set.java
 * This class contains up to three cards.
 * It has code to determine if the three cards
 * are a set or not.  It also contains a flash
 * method that flashes the three cards a couple
 * of times
 */

import main.AbstractFactory.abstractfactory5.cards.Card;

import java.util.*;

public class Set extends Vector {

    // Creates new Set
    public Set() { }

    // a static function to see if three cards form a set
   public boolean isSet () {
      if (size() != 3) 
          return false;
      Card one = (Card)(get(0));
      Card two = (Card)(get(1));
      Card three = (Card)(get(2));
      if (Card.colourSet(one, two, three) &&
          Card.shadingSet(one, two, three) &&
          Card.symbolSet(one, two, three) &&
          Card.numberSet(one, two, three))
          return true;
      
      return false;
   } 

    // The following method flashes the three cards in the set
   public void flashSet() {
      for (int j=0; j<4; j++){
         for (int i=0; i<3; i++){
            Card cd =  (Card)get(i);
            cd.changeBold();
            cd.paintImmediately(0, 0, 150, 200);
         }
         try {Thread.sleep(250);} catch (Exception ex) {}
      }
      for (int i=0; i<3; i++){
         Card cd =  (Card)get(i);
         cd.setBold(false);
         cd.paintImmediately(0, 0, 150, 200);
      }      
   }
 
}
