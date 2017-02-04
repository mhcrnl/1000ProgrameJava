/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.linuxmagazin.salut;

/**
 *
 * @author mhcrnl
 */
public class SalutRoHandler {
    private String nume;
    private String email;
    private String descriere;
    
    public SalutRoHandler(){
        nume = null;
        email  =null;
        descriere = null;
    }

    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the descriere
     */
    public String getDescriere() {
        return descriere;
    }

    /**
     * @param descriere the descriere to set
     */
    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
    
    
}
