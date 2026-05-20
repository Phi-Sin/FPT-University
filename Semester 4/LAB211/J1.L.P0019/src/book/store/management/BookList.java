/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.store.management;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *
 * @author MSI
 */
public class BookList extends ArrayList<Book> {

    PublisherList publist;

    public BookList() {
        super();
        publist = new PublisherList();
    }

    public void LoadFromFile(String fName) {
        try {
            File f = new File(fName);
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(fName);
            BufferedReader bf = new BufferedReader(fr);
            String details;
            while ((details = bf.readLine()) != null) {
                //splitting details into elements
                StringTokenizer stk = new StringTokenizer(details, ",");
                String bookID = stk.nextToken().trim();
                String bookName = stk.nextToken().trim();
                double price = Double.parseDouble(stk.nextToken());
                int quantity = Integer.parseInt(stk.nextToken());
                String publisherID = stk.nextToken().trim();
                String publisherName = stk.nextToken().trim();
                boolean status = Boolean.parseBoolean(stk.nextToken());
                double subTotal = quantity * price;
//                Book boo = new Book(bookID, bookName, price, quantity, subTotal,
//                        pub.getPublisherID(), pub.getPublisherName(), status);
                Publisher pub = publist.searchPublisherID(publisherID);
                Book boo = new Book(bookID, bookName, price, quantity, subTotal, publisherID, publisherName, status);
                this.add(boo);
//                System.out.println(book);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFile(String fName) {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Book boo : this) {
                pw.println(boo.getBookID() + "," + boo.getBookName() + ","
                        + boo.getPrice() + "," + boo.getQuantity() + "," + boo.getSubTotal() + "," + boo.getPublisherID()
                        + "," + boo.getPublisherName() + "," + boo.isStatus());
            }
            pw.close();
            fw.close();
            System.out.println("The Book list has been saved to the file.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printAllBooks() {
        if (this.isEmpty()) {
            System.out.println("Empty List!");
        } else {
            Collections.sort(this);
            System.out.println("\n");
            System.out.println("--------- Book List --------- ");
            for (Book boo : this) {
                System.out.println(boo);
            }
            System.out.println("Total: " + this.size() + " Book(s).");
        }
    }

    public Book search(String code) {
        code = code.trim();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBookID().equals(code)) {
                return this.get(i);
            }
        }
        return null;
    }

    public void searchBook() {
        if (this.isEmpty()) {
            System.out.println("Empty list! No search can be performed!");
        } else {
            String sCode = Inputter.inputStr("Input book code for search: ");
            Book pub = this.search(sCode);
            if (pub == null) {
                System.out.println("Book’s Name: " + sCode + " doesn't exist!");
            } else {
                System.out.println("Has Found: " + pub);
            }
        }
    }

    public Book searchByBookName(String code) {
        code = code.trim();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBookName().contains(code)) {
                return this.get(i);
            }
        }
        return null;
    }

    public void searchBookName() {
        if (this.isEmpty()) {
            System.out.println("Empty list! No search can be performed!");
        } else {
            String sName = Inputter.inputStr("Input book name for search: ");
            Book pub = this.searchByBookName(sName);
            if (pub == null) {
                System.out.println("Book’s Name: " + sName + " doesn't exist!");
            } else {
                for (int i = 0; i < this.size(); i++) {
                    if (this.get(i).getBookName().contains(sName)) {
                        System.out.println(this.get(i));
                    }
                }
            }
        }
    }

    private boolean isCodeDupplicated(String code) {
        code = code.trim();
        return search(code) != null;
    }

    public void addBook() {
        String newBookID, publisherID, newBookName;
        int quantity;
        double price;
        boolean status = false;
        boolean codeDupplicated = false;
        do {

            newBookID = Inputter.inputPattern("Input New Book ID (B00000): ",
                    "[sB][\\d]{5}");
            newBookID = newBookID.trim();
            codeDupplicated = isCodeDupplicated(newBookID);
            if (codeDupplicated) {
                System.out.println("Book's ID is dupplicated.Try again!");
            }
        } while (codeDupplicated == true);
        newBookName = Inputter.inputNonBlankStr("New Book Name: ");
        newBookName = newBookName;
        price = Inputter.inputDouble("Price: ");
//        quantity = Inputter.inputInt("Quantity: ");
        quantity = Inputter.inputInt("Quantity: ", 1, 1000000000);
        double subTotal = quantity * price;
        

        do {
//            publisherID = Inputter.inputStr("Input Publisher code (P00000): ");
            publisherID = Inputter.inputPattern("Input Publisher code (P00000): ", "[sP][\\d]{5}");
            codeDupplicated = publist.isExisted(publisherID);
            if (codeDupplicated) {
                System.out.println("Publisher code is not found!");
            }
        } while (codeDupplicated);
        Publisher pub = publist.searchPublisherID(publisherID);
        String publisherName = pub.getPublisherName();
        Book boo = new Book(newBookID, newBookName, price, quantity, subTotal, publisherID, publisherName, status);
        this.add(boo);
        System.out.println("Book:  " + newBookID + " has been added.");
    }

    public void updateBook() {
        String publisherID, newBookName;
        double newPrice;
        int newQuantity;
        boolean newStatus;
        boolean codeDuplicated = false;
        if (this.isEmpty()) {
            System.out.println("Empty list! No update can be performed!".toUpperCase());
        } else {
            String uCode = Inputter.inputStr("Input ID for update Book(B00000): ");
            Book boo = this.search(uCode);
            if (boo == null) {
                System.out.println("Book " + uCode + " doesn't existed!".toUpperCase());
            } else {
                do {
                    publisherID = Inputter.inputStr("Input publisher ID(P00000): ");
                    codeDuplicated = publist.isExisted(publisherID);
                    if (codeDuplicated) {
                        System.out.println("Publisher ID is not found!".toUpperCase());
                    }
                } while (codeDuplicated);
                publisherID = publisherID.toUpperCase();
                boo.setPublisherID(publisherID);
                newBookName = Inputter.inputStr("New book name: ");
                if (!newBookName.trim().isEmpty()) {
                    newBookName = newBookName.toUpperCase();
                    boo.setBookName(newBookName);
                }
                String priceInput = Inputter.inputStr("Price: ");
                if (priceInput.isEmpty()) {
                } else {
                    newPrice = Double.parseDouble(priceInput);
                    boo.setPrice(newPrice);
                }
                String quantityInput = Inputter.inputStr("Quantity: ");
                if (quantityInput.isEmpty()) {
                } else {
                    newQuantity = Integer.parseInt(quantityInput);
                    boo.setQuantity(newQuantity);
                }
                String statusInput = Inputter.inputStr("Status: ");
                if (statusInput.isEmpty()) {
                } else {
                    newStatus = Boolean.parseBoolean(statusInput);
                    boo.setStatus(newStatus);
                }
                System.out.println("Book " + uCode + " has been updated.".toUpperCase());
            }
        }
    }

    public void removeBook() {
        if (this.isEmpty()) {
            System.out.println("Empty list! No remove can be performed!");
        } else {
            String rCode = Inputter.inputStr("Input ID for removed book: ");
            Book boo = this.search(rCode);
            if (boo == null) {
                System.out.println("Book’s ID:  " + rCode + "  does not exist!");
            } else {
                this.remove(boo);
                System.out.println("Book’s ID:  " + rCode + " has been removed");
            }
        }
    }
}
