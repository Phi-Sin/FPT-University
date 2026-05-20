/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author MSI
 */
public class SaleBean {
    private String itemID = "unknown";
    private double discountCode = 1.0;
    private int numItems = 0;
    
   public String getItemID(){
       return (itemID);
   }
   
   public void setItemID(String itemID) {
       if (itemID != null){
           this.itemID = itemID;
       } else {
           this.itemID = "unknown";
       }
   }
   //set gellter and sellter
   public double getDiscountCode(){
       return(discountCode);
   }
   
   public void setDiscountCode(double discountCode){
       this.discountCode = discountCode;
   }
   
   public int getNumItems(){
       return(numItems);
   }
}
