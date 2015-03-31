/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author SONY
 */
public class PersonaDTO {
    
private int idPersona=0; 
private int tpdoc=0;
private String nom1="";
private String nom2="";
private String ape1="";
private String ape2="";
private String correo="";

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }



    /**
     * @return the nom1
     */
    public String getNom1() {
        return nom1;
    }

    /**
     * @param nom1 the nom1 to set
     */
    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    /**
     * @return the nom2
     */
    public String getNom2() {
        return nom2;
    }

    /**
     * @param nom2 the nom2 to set
     */
    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

    /**
     * @return the ape1
     */
    public String getApe1() {
        return ape1;
    }

    /**
     * @param ape1 the ape1 to set
     */
    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    /**
     * @return the ape2
     */
    public String getApe2() {
        return ape2;
    }

    /**
     * @param ape2 the ape2 to set
     */
    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the tpdoc
     */
    public int getTpdoc() {
        return tpdoc;
    }

    /**
     * @param tpdoc the tpdoc to set
     */
    public void setTpdoc(int tpdoc) {
        this.tpdoc = tpdoc;
    }


}
