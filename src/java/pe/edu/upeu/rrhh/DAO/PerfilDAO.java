/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.rrhh.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.rrhh.Factory.ConexionBD;
import pe.edu.upeu.rrhh.Factory.FactoryConnectionDB;
import pe.edu.upeu.rrhh.interfaces.InterfacePerfil;
import pe.edu.upeu.rrhh.modelo.PerfilModelo;
/**
 *
 * @author george
 */
public class PerfilDAO implements InterfacePerfil{
    ConexionBD conn;
    @Override
    public List<PerfilModelo> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM perfil");
        List<PerfilModelo> list = new ArrayList<PerfilModelo>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            PerfilModelo prov = new PerfilModelo();
            prov.setIdPerfil(rs.getInt("idPERFIL"));
            prov.setNom_Perfil(rs.getString("Nombre_Perfil"));
            prov.setEstado_Perfil(rs.getString("Estado_Perfil"));
            
            list.add(prov);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public List<PerfilModelo> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM perfil WHERE idPERFIL=").append(id);
        List<PerfilModelo> list = new ArrayList<PerfilModelo>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            PerfilModelo us = new PerfilModelo();
            us.setIdPerfil(rs.getInt("idPERFIL"));
            us.setNom_Perfil(rs.getString("Nombre_Perfil"));
            us.setEstado_Perfil(rs.getString("Estado_Perfil"));
            list.add(us);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
           
    }

    @Override
    public boolean edit(PerfilModelo perfilMod) {
         this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE perfil SET idPERFIL = ").append(perfilMod.getIdPerfil());
            
            sql.append(", Nombre_Perfil = '").append(perfilMod.getNom_Perfil()).append("' WHERE idPERFIL = ").append(perfilMod.getIdPerfil());
            sql.append(", Estado_Perfil = '").append(perfilMod.getEstado_Perfil()).append("' WHERE idPERFIL = ").append(perfilMod.getIdPerfil());            
            this.conn.execute(sql.toString());
            save = true;
        } catch (Exception e) {
        }finally{
            this.conn.close();
        }
        return save;
    }

    @Override
    public boolean save(PerfilModelo perfilMod) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO perfil(idPERFIL,Nombre_Perfil,Estado_Perfil) VALUES(").append("NULL");
                
                sql.append(", '").append(perfilMod.getNom_Perfil()).append("')");
                sql.append(", '").append(perfilMod.getEstado_Perfil()).append("')");
                this.conn.execute(sql.toString());
                save = true;
        } catch (Exception e) {
            this.conn.close();
        }        
        return save;
    }

    @Override
    public boolean delete(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean delete = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM perfil WHERE idPERFIL = ").append(id);
            this.conn.execute(sql.toString());
            delete = true;
        } catch (Exception e) {
            
        }finally{
            this.conn.close();
        }
        return delete;
    }
    
}
