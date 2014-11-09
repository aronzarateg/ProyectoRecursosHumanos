/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.rrhh.modelo;

/**
 *
 * @author Dka
 */
public class ProvinciaModelo {
    private int idprovincia    ;
    private int idregion    ;
    private String nombreprovincia;

    public ProvinciaModelo() {
    }

    public ProvinciaModelo(int idprovincia, int idregion, String nombreprovincia) {
        this.idprovincia = idprovincia;
        this.idregion = idregion;
        this.nombreprovincia = nombreprovincia;
    }

    public int getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }

    public String getNombreprovincia() {
        return nombreprovincia;
    }

    public void setNombreprovincia(String nombreprovincia) {
        this.nombreprovincia = nombreprovincia;
    }
    
}
