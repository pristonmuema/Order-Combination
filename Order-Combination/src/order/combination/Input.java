/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.combination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PRISTON
 */
public final class Input {

    private final Scanner scanner;
  
    /**
     * Set the scanner
     */
    public Input() {
        scanner = new Scanner(System.in);

    
    }

    public ArrayList<Order> getInputs() {
        ArrayList<Order> orders = new ArrayList<Order>();
        ArrayList<Order> order = new ArrayList<Order>();
      
        
      
        
        System.out.println("Welcome to Sendy Order Processor\n");
        while (true) {
            
            orders.add(new Order(getOrderNo(),getName(), getPickLocation(), getDeliverLocation(),getOrderDistance()));
            orders.add(new Order(getOrderNo(),getName(), getPickLocation(), getDeliverLocation(),getOrderDistance1()));
             orders.add(new Order(getOrderNo(),getName(), getPickLocation(), getDeliverLocation(),getOrderDistance2()));
           
            if (promptMore().equalsIgnoreCase("N")) {
                break;
            }
        }
        return orders;
        
        
    }
     
 
    

    /**
     * Get the pick up location
     *
     * @return
     */
    private Integer getOrderNo(){
           Random ra = new Random();
           return(ra.nextInt(10000+1));
       
       }
    private String getPickLocation() {
        return this.getScannerValue("Enter PickUp Location");
    }

    private String getDeliverLocation() {
        return this.getScannerValue("Enter DropOff Location");
    }
   
    DistanceCalculator dst = new DistanceCalculator();

    private double getOrderDistance() {
       return dst.distance(32.9697, -96.80322, 29.46786, -98.53506, "K" + " Kms\n");
    }
    private double getOrderDistance1() {
       return dst.distance(-1.0499998 ,37.083333,-1.2853884,36.824507,"K" + " Kms\n");
    }
     private double getOrderDistance2() {
       return dst.distance(0.6333308, 37.6333308,-1.5166646 ,37.2666656,"K" + " Kms\n");
    }
    
   

    /**
     * Get the delivery location
     *
     * @return
     */
    private String getName() {
       
        return this.getScannerValue("Enter name of the Order");
    }

    private String promptMore() {
        return this.getScannerValue("Do you to add another order? Y:N");
    }

    /**
     * @param prompt
     * @return
     */
    protected String getScannerValue(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine().trim().toUpperCase();
    }
}
