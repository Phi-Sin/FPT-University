/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Order implements Comparable<Order> {
    
    private String orderID;
    private Pet pet;
    private Product product;
    private int orderQuantity;
    private String orderDate;
    private boolean status;
    
    public Order() {
    }
    
    public Order(String orderID, Pet pet, Product product, 
            int orderQuantity, String orderDate, boolean status) {
        this.orderID = orderID;
        this.pet = pet;
        this.product = product;
        this.orderQuantity = orderQuantity;
        this.orderDate = orderDate;
        this.status = status;
    }
    
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }  
   
    @Override
    public String toString() {
        return orderID + ", " + pet + ", " + product + ", " + 
                orderQuantity + ", " + orderDate + ", " + status; 
    }

    @Override
    public int compareTo(Order o) {
        return this.getPet().getPetID().compareTo(o.getPet().getPetID());
    }

}
