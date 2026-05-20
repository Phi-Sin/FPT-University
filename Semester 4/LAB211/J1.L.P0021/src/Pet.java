
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Pet {
    
    private String petID;
    private String petDescription;
    private Date petImportdate;
    private double petPrice;
    private String petCategory;
    private String name;

    public Pet() {
    }

    public Pet(String petID, String petDescription, Date petImportdate, double petPrice, String petCategory, String name) {
        this.petID = petID;
        this.petDescription = petDescription;
        this.petImportdate = petImportdate;
        this.petPrice = petPrice;
        this.petCategory = petCategory;
        this.name = name;
    }

    Pet(String petID, String petDescription, String petImportdate, String petPrice, String petCategory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public Date getPetImportdate() {
        return petImportdate;
    }

    public void setPetImportdate(Date petImportdate) {
        this.petImportdate = petImportdate;
    }

    public double getPetPrice() {
        return petPrice;
    }

    public void setPetPrice(double petPrice) {
        this.petPrice = petPrice;
    }

    public String getPetCategory() {
        return petCategory;
    }

    public void setPetCategory(String petCategory) {
        this.petCategory = petCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" + "petID=" + petID + ", petDescription=" + petDescription + ", petImportdate=" + petImportdate + ", petPrice=" + petPrice + ", petCategory=" + petCategory + ", name=" + name + '}';
    }


}
