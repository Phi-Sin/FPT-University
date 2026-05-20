/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PetList extends ArrayList<Pet> {
    
    String filename = "pets.txt";
    
    public PetList() {
        super();
    }
    
    public void LoadFromFile(String fName) {
        try {
            File f = new File(fName); 
            if(!f.exists()) return;
            FileReader fr = new FileReader(fName);
            BufferedReader bf = new BufferedReader(fr);
            String details; 
            while((details=bf.readLine())!=null) {
                //splitting details into elements
                StringTokenizer stk = new StringTokenizer(details,",:");
                String petID = stk.nextToken().toUpperCase();
                String petDescription = stk.nextToken().toUpperCase();
                String petImportdate = stk.nextToken().toUpperCase();
                String petPrice = stk.nextToken().toUpperCase();
                String petCategory =stk.nextToken().toUpperCase();
//                double price = Double.parseDouble(stk.nextToken());
                //create a pet
                Pet pet = new Pet(petID,petDescription,petImportdate,petPrice,petCategory);
                this.add(pet);
            }
            bf.close(); fr.close();

        } catch (Exception e) {
//            System.out.println(e);
        }
    }
    
    public void saveToFile(String fName) {
        if(this.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for(Pet pet : this) {
                pw.println(pet.getPetID() + "," + pet.getPetDescription() + "," 
                        + pet.getPetImportdate() + "," + pet.getPetPrice() + "," + pet.getPetCategory());
            }
            pw.close(); fw.close();  
            System.out.println("The pet list has been saved to the file.");
        }
        catch(Exception e) {
//            System.out.println(e);
        }
    }
    
    public void printAllPets() {
        if(this.isEmpty()) System.out.println("Empty list!");
        else {
            System.out.println("---------- Pet List ----------");
            for (Pet cu : this) System.out.println(cu);
            System.out.println("Total: " + this.size() + " pet(s).");
        }
    }
    
    public boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code)!=null;
    }
    
    public Pet search(String code) {
        code = code.trim().toUpperCase();
        for (int i=0; i<this.size(); i++) {
            if(this.get(i).getPetID().equals(code))
                return this.get(i);
        }
        return null;
    }
    
    public Pet searchPetID(String code) {
        code = code.trim().toUpperCase();
        this.LoadFromFile(filename);
        for (Pet pet : this) {
            if (pet.getPetID().trim().equals(code))
                return pet;
        }
        return null;
    }
       
    public void addPet() {
        String petID, petDescription, petImportdate, petPrice, petCategory;
        boolean codeDupplicated = false;
        do {
            petID = Inputter.inputStr("Input new pet code : ");
            codeDupplicated = isCodeDupplicated(petID);
            if(codeDupplicated) System.out.println("Pet code is dupplicated!");          
        } while (codeDupplicated==true);
        petDescription = Inputter.inputNonBlankStr("Enter pet description: ");
        if (petDescription.length() >= 3 && petDescription.length() <= 50) {
            String PetDescription = petDescription.toUpperCase();
        } else {
            System.out.println("Missing or excess characters!");
            return;} 
        petImportdate = Inputter.inputNonBlankStr("Enter pet import date (YYYY-MM-DD): ");
        petImportdate = petImportdate.toUpperCase();
        petPrice = Inputter.inputNonBlankStr("Enter pet price: ");
        if(petPrice == null){
            System.out.println("Price can't empty! Pleas try again. ");
            return;}
        petCategory = Inputter.inputNonBlankStr("Enter the category of pet (Dog, Cat, Parrot): ");
        Pet pet = new Pet(petID,petDescription,petImportdate,petPrice,petCategory);
        this.add(pet);
        System.out.println("Pet " + petID + " has been added.");
    }
    
    public void searchPet() {
        if(this.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            String sCode = Inputter.inputNonBlankStr("Input pet code for search(C000) : ");
            Pet pet = this.search(sCode);
            if(pet==null)
                System.out.println("Pet " + sCode + " doesn't existed!");
            else
                System.out.println("Found: " + pet);
        }
    }    
    
    public void updatePet() {
        if(this.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            String uCode = Inputter.inputStr("Input code of updated pet(P000) : ");
            Pet pet = this.search(uCode);
            if(pet==null) {
                System.out.println("Pet " + uCode + " doesn't existed!");
            } else {
                String oldPetDescription = pet.getPetDescription();
                String msg1 = "Old PetDescription: " +  
                        oldPetDescription + ", New PetDescription: ";
                String newPetDescription = Inputter.inputStr(msg1);
                if (newPetDescription.trim().isEmpty()){
                       newPetDescription = pet.getPetDescription();
                }  
                pet.setPetDescription(newPetDescription);
                String oldPetImportdate = pet.getPetImportdate();
                String msg2 = "Old PetImportdate: " + oldPetImportdate 
                        + ", New PetImportdate: ";
                String newPetImportdate = Inputter.inputStr(msg2);
                if (newPetImportdate.trim().isEmpty()){
                       newPetImportdate = pet.getPetImportdate();
                }
                pet.setPetAddress(newPetAddress);              
                String petPhone = pet.getPetPhone();
                String msg3 = "Old PetPhone: " + petPhone 
                        + ", New PetPhone: ";
//                petPhone = Inputter.inputNonBlankStr(msg3);
                petPhone = Inputter.inputPattern(msg3, "^(\\w{0}|.{10,12})$");
                if (petPhone.trim().isEmpty()){
                      petPhone = pet.getPetPhone();
                }
                pet.setPetPhone(petPhone);  
                System.out.println("Pet " + uCode + " has been updated.");
            }
        }
    }
    
    public Pet getUserChoice() {
        this.LoadFromFile(filename);
        int choice = 0;         
        System.out.println("---------- Please select a pet ----------");
        choice = Menu.getChoice(this);
        return this.get(choice-1);
    }
    
}
