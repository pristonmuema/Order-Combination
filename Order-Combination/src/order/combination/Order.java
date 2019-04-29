/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order.combination;

/**
 *
 * @author PRISTON
 */
public class Order {
     private String name;

    private String pickLocation;

    private String dropLocation;
    private double pickUpLat;
    private double pickUpLon;
    private double dropOffLat;
    private double dropOffLon;
    private double orderDistance;
    private Integer orderNo;
    
    public Order(double pickUpLat, double pickUpLon, double dropOffLat, double dropOffLon){
        this.pickUpLat = pickUpLat;
        this.pickUpLon = pickUpLon;
        this.dropOffLat = dropOffLat;
        this.dropOffLon = dropOffLon;
    }
    
     public double getDropOffLat() {
        return dropOffLat;
    }

    public void setDropOffLat(double dropOffLat) {
        this.dropOffLat = dropOffLat;
    }

    public double getDropOffLon() {
        return dropOffLon;
    }

    public double getPickUpLat() {
        return pickUpLat;
    }

  

    public double getPickUpLon() {
        return pickUpLon;
    }

    public void setDropOffLon(double dropOffLon) {
        this.dropOffLon = dropOffLon;
    }
    public double getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
 public double calculateOrderDistance(){
        DistanceCalculator dst = new DistanceCalculator();
        return dst.distance(this.pickUpLat, this.pickUpLon, this.dropOffLat,this.dropOffLon,"K");
    }
   



    public Order(Integer no,String the_name, String pick_at, String drop_at,Double dist) {
        this.orderNo=no;
        this.name = the_name;
        this.pickLocation = pick_at;
        this.dropLocation = drop_at;
        this.orderDistance=dist;
        
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPickLocation() {
        return pickLocation;
    }

    public void setPickLocation(String pickLocation) {
        this.pickLocation = pickLocation;
       
    }
  

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }
     public Double getOrderDistance() {
        return orderDistance;
    }
    public void setOrderDistance(double orderDistance) {
        this.orderDistance = orderDistance;
       
    }

    @Override
    public String toString() {
        return "OrderName " + name + " OrderNo " + orderNo + " Pick From " + pickLocation + " Drop TO " + dropLocation + " Distance " + orderDistance + " Cost " + orderDistance*30 + " Ksh ";
    }

}
