/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.store.management;

/**
 *
 * @author MSI
 */
public class Book implements Comparable<Book> {

    private String bookID;
    private String bookName;
    private double price;
    private int quantity;
    private double subTotal;
    private String publisherID;
    private String publisherName;
    private boolean status;
//    private String status;

    public Book() {

    }
    
    public Book(String bookID, String bookname, double price, int quanity,
            double subTotal, String publiserID, String publisherName, boolean status) {

//    public Book(String bookID, String bookname, double price, int quanity,
//            double subTotal, String publiserID, String publisherName, boolean status) {
        this.bookID = bookID;
        this.bookName = bookname;
        this.price = price;
        this.quantity = quanity;
        this.subTotal = subTotal;
        this.publisherID = publiserID;
        this.publisherName = publisherName;
        this.status = status;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quanity) {
        this.quantity = quanity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

//    public String getStatus(){
//        return status;
//    }
//    
//    public void setStatus(String status){
//        this.status = status;
//    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return bookID + "," + bookName + "," + price + "," + quantity + "," + subTotal + "," + publisherName + "," + status;
    }

    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.getBookName());
    }
    

}
