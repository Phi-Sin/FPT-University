/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MSI
 */
public class Product {
    private int mobileId;
    private String description;
    private double price;
    private String mobileName;
    private int yearOfProduct;
    private int quantity;
    private boolean notSale;

    public Product() {
    }

    public Product(int mobileId, String description, double price, String mobileName, int yearOfProduct, int quantity, boolean notSale) {
        this.mobileId = mobileId;
        this.description = description;
        this.price = price;
        this.mobileName = mobileName;
        this.yearOfProduct = yearOfProduct;
        this.quantity = quantity;
        this.notSale = notSale;
    }

    public Product(int aInt, String string, double aDouble, String string0, int aInt0, int aInt1, int aInt2, boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMobileId() {
        return mobileId;
    }

    public void setMobileId(int mobileId) {
        this.mobileId = mobileId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public void setYearOfProduct(int yearOfProduct) {
        this.yearOfProduct = yearOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isNotSale() {
        return notSale;
    }

    public void setNotSale(boolean notSale) {
        this.notSale = notSale;
    }

    @Override
    public String toString() {
        return "product{" + "mobileId=" + mobileId + ", description=" + description + ", price=" + price + ", mobileName=" + mobileName + ", yearOfProduct=" + yearOfProduct + ", quantity=" + quantity + ", notSale=" + notSale + '}';
    }
    
    
}

