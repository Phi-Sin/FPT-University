/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.model;

/**
 *
 * @author Acer
 */
public class CartDTO {
    private String CmobileId;
    private String CmobileName;
    private float Cprice;

    public CartDTO() {
    }

    public CartDTO(String CmobileId, String CmobileName, float Cprice) {
        this.CmobileId = CmobileId;
        this.CmobileName = CmobileName;
        this.Cprice = Cprice;
    }

    public String getCmobileId() {
        return CmobileId;
    }

    public void setCmobileId(String CmobileId) {
        this.CmobileId = CmobileId;
    }

    public String getCmobileName() {
        return CmobileName;
    }

    public void setCmobileName(String CmobileName) {
        this.CmobileName = CmobileName;
    }

    public float getCprice() {
        return Cprice;
    }

    public void setCprice(float Cprice) {
        this.Cprice = Cprice;
    }
    
}
