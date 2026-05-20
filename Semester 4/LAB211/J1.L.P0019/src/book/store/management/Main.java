/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book.store.management;

//import java.awt.Menu;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Main {

    public static void main(String[] args) {
        String filename1 = "publisher.dat";
        String filename2 = "book.dat";
        ArrayList<String> options = new ArrayList<>();
        ArrayList<String> options1 = new ArrayList<>();
        options.add("Create a  Publisher");
        options.add("Delete the  Publisher");
        options.add("Save the  Publisher list to file");
        options.add("Print the  Publisher list from the file");
        options.add("Create a Book");
        options.add("Search the Book based on their ID");
        options.add("Search the Book based on a part of Book's name");
        options.add("Update a Book");
        options.add("Delete the Book");
        options.add("Save the Book list to file");
        options.add("Print the Book list from the file");
        options.add("Quit");
        int choice = 0;

        PublisherList publist = new PublisherList();
        publist.LoadFromFile(filename1);

        BookList boolist = new BookList();
        boolist.LoadFromFile(filename2);

        do {
            System.out.println("---------------------------------------------");
            System.out.println("           Publisher's Store Management");
            System.out.println("---------------------------------------------");
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    publist.addPublisher();
                    break;
                case 2:
                    publist.removePublisher();
                    break;
                case 3:
                    publist.saveToFile(filename1);
                    break;
                case 4:
                    publist.printAllPublishers();
                    break;
                case 5:
                    boolist.addBook();
                    break;
                case 6:
                    boolist.searchBook();
                    break;
                case 7:
                    boolist.searchBookName();
                    break;
                case 8:
                    boolist.updateBook();
                    break;
                case 9:
                    boolist.removeBook();
                    break;
                case 10:
                    boolist.saveToFile(filename2);
                    break;
                case 11:
                    boolist.printAllBooks();
                    break;
                default:
                    System.out.println("Quit Complete!");
                    System.out.println("Bye!");
            }
        } while (choice > 0 && choice < 12);
    }

}
