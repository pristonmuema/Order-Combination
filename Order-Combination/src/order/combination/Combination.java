/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.combination;

import java.util.ArrayList;
//import java.util.LinkedHashSet;
import java.util.List;
//import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author PRISTON
 */
public class Combination {
     private final Input input;
    LocationProcessor locationProcessor;
    private ArrayList<Order> list;

    /**
     * Constructor
     */
    public Combination() {
        input = new Input();
        locationProcessor = new LocationProcessor();
        
    }

    /**
     * Initiate processing
     */
    public void processCombination() {
        list = getOrders();
        list.stream().forEach((order) -> {
            locationProcessor.setLocations(order);
            
        });
        getDeliveryDetails();
    }
 
    /**
     * Get the delivery details
     *
     * @return
     */
    public void getDeliveryDetails() {
        String[] centers = locationProcessor.getLocations();
        
       System.out.println("Similar Orders");
      
        
    
        for (String place : centers) {
            /* For debugging
            System.out.println("Orders To " + place);
            System.out.println(getOrdersToPlace(place).toString());
            System.out.println("Orders From " + place);
            System.out.println(getOrdersFromPlace(place).toString());
            */
            //System.out.println("\n" + place + "\n");
            List<Order> from_here = getOrdersFromPlace(place);
            //List<Order> to_here = getOrdersToPlace(place);
            if (!from_here.isEmpty()) {
                System.out.println("Deliver Order");
                System.out.println(from_here);
            }
//            if (!to_here.isEmpty()) {
//                System.out.println("Drop the orders below");
//                System.out.println(to_here);
//            }
     
        }
    }

    /**
     * @param location
     * @return
     */
    private List<Order> getOrdersFromPlace(String location) {
        return list.stream().filter(p -> p.getPickLocation().equalsIgnoreCase(location)).collect(Collectors.toList());
    }

    /**
     * @param location
     * @return
     */
    private List<Order> getOrdersToPlace(String location) {
        return list.stream().filter(p -> p.getDropLocation().equalsIgnoreCase(location)).collect(Collectors.toList());
    }

    /**
     * Get a List of all orders
     *
     * @return
     */
    public ArrayList<Order> getOrders() {
        return input.getInputs();
    }
}
