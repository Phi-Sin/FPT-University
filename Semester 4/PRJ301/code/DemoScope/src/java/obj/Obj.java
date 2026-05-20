/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

import java.io.Serializable;

/**
 *
 * @author Vincent
 */
public class Obj implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String name;
    
    public Obj() {
        this.name = "";
    }

    public Obj(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public Obj changeNameToHello() {
        this.name = "Hello";
        return this;
    }
}
