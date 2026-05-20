/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.store.management;

/**
 *
 * @author MSI
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static int getChoice(ArrayList options) {
        for (int i = 0; i < options.size() - 8; i++) {
            System.out.println((i + 1) + "- " + options.get(i));
        }
        System.out.println("---------------------------------------------");
        System.out.println("           Book's Store Management");
        System.out.println("---------------------------------------------");
        for (int i = 4; i < options.size(); i++) {
            System.out.println((i + 1) + "- " + options.get(i));
        }
        System.out.print("Choose 1 ... " + options.size() + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

}
