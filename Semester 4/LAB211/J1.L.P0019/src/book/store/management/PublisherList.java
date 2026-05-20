/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.store.management;

/**
 *
 * @author MSI
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class PublisherList extends ArrayList<Publisher> {
    
    String filename = "publisher.dat";
    
    public PublisherList() {
        super();
        this.LoadFromFile(filename);
    }
    
    public void LoadFromFile(String fName){
                if(this.size()>0) this.clear();
        try {
            File f = new File(fName); 
            if(!f.exists()) return;
            FileReader fr = new FileReader(fName);
            BufferedReader bf = new BufferedReader(fr);
            String details; 
            while((details=bf.readLine())!=null) {

                StringTokenizer stk = new StringTokenizer(details,",");
                String publisherID = stk.nextToken();
                String publisherName = stk.nextToken();
                String publisherPhone = stk.nextToken();

               Publisher pub = new Publisher(publisherID, publisherName, publisherPhone);
                this.add(pub);
            }
            bf.close(); fr.close();

        } catch (Exception e) {
    }
    
    }
    
    public void saveToFile(String fName){
        if (this.isEmpty()) {
            System.out.println("Empty List!  ");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for(Publisher pub : this) {
                pw.println(pub.getPublisherID() + "," + pub.getPublisherName() + "," + pub.getPublisherPhone());
            }
            pw.close();
            //bw.close
            fw.close();
            System.out.println("The Publisher list has been saved to the file ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void printAllPublishers() {
        if(this.isEmpty())
            System.out.println("Empty List! ");
            else {
                    Collections.sort(this);
                    System.out.println("\n");
                    System.out.println("--------- Publisher List --------- ");
                    for (Publisher br : this ) System.out.println(br);
                    System.out.println("Total: " + this.size() + " publisher(s).");
                    }
        }
    
    public boolean isCodeDupplicated(String code) {
        code = code.trim();
        return search(code)!=null;
    }
    
    public boolean isExisted(String code) {
        code = code.trim();
        return search(code)==null;
    }
    
    public Publisher search(String code){
        code = code.trim();
        
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getPublisherID().equals(code)) 
                return  this.get(i);
        }
        return null;
    }
    
    public Publisher searchPublisherID(String code){
        code = code.trim();
        
        for ( Publisher pub : this) {
            if ( pub.getPublisherID().trim().equals(code))
                return  pub;
        }
        return null;
    }
    
    public  void addPublisher() {
        String newPublisherID, newPublisherName, newPublisherPhone;
        boolean codeDupplicated = false;
        do {            
//            newPublisherID = Inputter.inputStr("Input new publisher ID (P00000): ");
            newPublisherID = Inputter.inputPattern("Input new publisher ID (P00000):  ", "[sP][\\d]{5}");
            codeDupplicated = isCodeDupplicated(newPublisherID);
            if(codeDupplicated) System.out.println("Publisher's ID is dupplicated!");
        } while (codeDupplicated == true);
            newPublisherName = Inputter.inputStr("Name of new Publisher: ");
            newPublisherName = newPublisherName;
            newPublisherPhone = Inputter.inputPattern("Phone of new Publisher: ","[\\d]{10,12}");
            newPublisherPhone = newPublisherPhone;
            Publisher pub = new Publisher(newPublisherID, newPublisherName, newPublisherPhone);
            this.add(pub);
            System.out.println("Pulisher " + newPublisherID + " has been created ");
    }
    
    public void searchPublisher() {
        if(this.isEmpty()) {
            System.out.println("Empty list! No search can be performed!");
        } else {
            String sCode = Inputter.inputStr("Input Publisher ID for search: ");
            Publisher pub = this.search(sCode);
            if(pub==null)
                System.out.println("Publisher's ID " + sCode + " doesn't existed!");
            else
                System.out.println("Found: " + pub);
        }
    }    
    
    public void uppdatePublisher() {
         if(this.isEmpty()) {
            System.out.println("Empty list! No update can be performed!");
        } else {
            String uCode = Inputter.inputStr("Input ID for updated Publisher: ");
            Publisher pub = this.search(uCode);
            if(pub==null) {
                System.out.println("Publisher's ID " + uCode + " doesn't existed!");
            } else {
                String oldPublisherName = pub.getPublisherName();
                String msg1 = "Old PublisherName: " + oldPublisherName 
                        + ", new PublisherName: ";
                String newPublisherName = Inputter.inputNonBlankStr(msg1);
                pub.setPublisherName(newPublisherName);    
                String oldPublisherPhone = pub.getPublisherPhone();
                String msg2 = "Old PublisherPhone: " + oldPublisherPhone 
                        + ", new PublisherPhone: ";
                String newPublisherPhone = Inputter.inputNonBlankStr(msg2);
                pub.setPublisherPhone(newPublisherPhone);               
                System.out.println("Publisher " + uCode + " has been updated .");
            }
        }
    }
    
    public void removePublisher() {
          if(this.isEmpty()) {
            System.out.println("Empty list! No remove can be performed!");
        } else {
            String rCode = Inputter.inputStr("Input Publisher’s ID for removed: ");
            Publisher pub = this.search(rCode);
            if(pub==null)
                System.out.println("Publisher’s ID: " + rCode + " does not exist!");
            else {
                this.remove(pub);
                System.out.println("Publisher’s ID: " + rCode + " has been removed ");
            }
        }
    }
    
    public void print() {
        if(this.isEmpty()) {
            System.out.println("Empty List! ");
            return;
        } 
//        Collections.sort(this);
//        System.out.println("\nPublisher List");
        System.out.println("---------------------------");
        for(Publisher x:this) System.out.println(x);
//            x.print();
                    
    }
}
