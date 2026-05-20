/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    public static int getChoice(ArrayList options) {
        for (int i=0; i<options.size(); i++) {
            System.out.println((i+1) + "- " + options.get(i));   
        }
        System.out.print("Choose 1 ... " + options.size() + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }  
    
    public static int getChoice2(ProductList products) {
        for (int i=0; i<products.size(); i++) {
            System.out.println((i+1) + "- " + products.get(i));   
        }
        System.out.print("Choose 1 ... " + products.size() + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }   
    
    public static String getChoice3(ArrayList options) {

//        System.out.println("");
//        System.out.println("   " + title);
//        for (int i=0; i<list.size(); i++) {
//            System.out.println("   4."+ (i+1) + "- " + list.get(i));   
//        }
//        System.out.print("   Choose 4.1 or 4.2: ");
//        return MyTool.sc.nextLine().trim().toUpperCase();

        for (int i=0; i<options.size(); i++) {
//            System.out.println((i+1) + "- " + options.get(i)); 
            System.out.println("   10."+ (i+1) + "- " + options.get(i)); 
        }
//        System.out.print("Choose 1 ... " + options.size() + ": ");
//        Scanner sc = new Scanner(System.in);
            System.out.print("   Choose 10.1 or 10.2: ");
            Scanner sc = new Scanner(System.in);
            return sc.nextLine().trim().toUpperCase();
    }

}
