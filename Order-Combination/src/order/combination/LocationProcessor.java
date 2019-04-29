/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.combination;

import java.util.Arrays;
import java.util.HashSet;


/**
 *
 * @author PRISTON
 */
public class LocationProcessor {
     protected String[] places = {};

    /**
     * Set locations
     *
     * @param order
     */
    protected void setLocations(Order order) {
        pushLocation(order.getPickLocation());
        pushLocation(order.getDropLocation());
        
    }

    /**
     * Get all the location points
     *
     * @return
     */
    protected String[] getLocations() {
        return this.places;
    }

    /**
     * Add to our list of touch points
     *
     * @param place
     */
    private void pushLocation(String place) {
      
        boolean inArray = Arrays.stream(places).anyMatch(place::equalsIgnoreCase);
        if (!inArray) {
            Helpers helper = new Helpers();
            places = helper.addNewItemToArray(place, places);
            
        }
    }

    /**
     * Return flag indicating if there are duplicates in the rows of the 2D array
     *
     * @return true if a row has duplicates, else false
     */
    
    
   
   
    public boolean anyMatch(char[][] inArray) {
        for (int row = 0; row < inArray.length; row++) {
            for (int col = 0; col < inArray[row].length; col++) {
                Character num = inArray[row][col];
                for (int otherCol = col + 1; otherCol < inArray.length; otherCol++) {
                    if (num.equals(inArray[row][col])) {
                       return true; 
                    }
                }
            }
        }

        return false;
    
        
    }
    
    

}
