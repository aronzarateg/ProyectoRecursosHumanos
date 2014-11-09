/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.rrhh.modelo;

/**
 *
 * @author george
 */
public class PerfilModelo {
    private int idPerfil;
    private String nom_Perfil;
    private String estado_Perfil;

    public PerfilModelo() {
    }

    public PerfilModelo(int idPerfil, String nom_Perfil, String estado_Perfil) {
        this.idPerfil = idPerfil;
        this.nom_Perfil = nom_Perfil;
        this.estado_Perfil = estado_Perfil;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNom_Perfil() {
        return nom_Perfil;
    }

    public void setNom_Perfil(String nom_Perfil) {
        this.nom_Perfil = nom_Perfil;
    }

    public String getEstado_Perfil() {
        return estado_Perfil;
    }

    public void setEstado_Perfil(String estado_Perfil) {
        this.estado_Perfil = estado_Perfil;
    }
}
