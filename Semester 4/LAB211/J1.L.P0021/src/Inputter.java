/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Inputter {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static int inputInt(String msg, int min, int max) {
        if(min>max) {
            int t=min; min=max; max=t;
        }
        int data;
        do {
            System.out.print(msg);
            data = Integer.parseInt(sc.nextLine());
        }
        while(data<min || data>max);
        return data;
    }
    
    public static int inputInt(String msg) {
        int data;
        do {
            System.out.print(msg);
            data = Integer.parseInt(sc.nextLine());
        }
        while(data<0);
        return data;
    }
    
    public static double inputDouble(String msg) {
        double data;
        do {
            System.out.print(msg);
            data = Double.parseDouble(sc.nextLine());
        }
        while(data<=0);
        return data;
    }
    
    public static boolean inputBoolean(String msg) {
        boolean data;
        System.out.print(msg);
        data = Boolean.parseBoolean(sc.nextLine());
        return data;
    }
    
    public static String inputStr(String msg) {
        System.out.print(msg);
        String data = sc.nextLine().trim();
        return data;
    }
    
    public static String inputNonBlankStr(String msg) {
        String data;
        do {
            System.out.print(msg);
            data = sc.nextLine().trim();
        } while(data.length()==0);
        return data;
    }
    
    //Checking whether str matches a pattern or not
    //Use the method String.matches (regEx) - IMPLEMENT IT
    public static boolean validStr (String str, String regEx) {
        boolean input = false;
        input = str.matches(regEx);
        return input;
    }
    
    public static String readPattern(String message, String pattern) {
        String input = "";
        boolean valid;
        do {            
            System.out.print(message + ": ");
            input = sc.nextLine().trim();
            valid = validStr(input,pattern);
        } while (!valid);
        return input;
    }
    
    public static String inputPattern(String msg, String pattern) {
        String data;
        do {
            System.out.print(msg);
            data = sc.nextLine().trim();
        }
        while(!data.matches(pattern));
        return data;
    }
    
}
