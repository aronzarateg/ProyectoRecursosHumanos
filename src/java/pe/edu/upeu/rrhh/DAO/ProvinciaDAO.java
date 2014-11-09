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
import pe.edu.upeu.rrhh.interfaces.InterfaceProvincia;
import pe.edu.upeu.rrhh.modelo.ProvinciaModelo;

/**
 *
 * @author Dka
 */
public class ProvinciaDAO implements InterfaceProvincia{
       ConexionBD conn;

    @Override
    public List<ProvinciaModelo> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM provincia");
        List<ProvinciaModelo> list = new ArrayList<ProvinciaModelo>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            ProvinciaModelo prov = new ProvinciaModelo();
            prov.setIdprovincia(rs.getInt("idPROVINCIA"));
            prov.setIdregion(rs.getInt("idREGION"));
            prov.setNombreprovincia(rs.getString("Nombre_Provincia"));
            
            list.add(prov);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public List<ProvinciaModelo> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM provincia WHERE idPROVINCIA=").append(id);
        List<ProvinciaModelo> list = new ArrayList<ProvinciaModelo>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            ProvinciaModelo us = new ProvinciaModelo();
            us.setIdprovincia(rs.getInt("idPROVINCIA"));
            us.setIdregion(rs.getInt("idREGION"));
            us.setNombreprovincia(rs.getString("Nombre_Provincia"));
           
            list.add(us);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean edit(ProvinciaModelo provinciaMod) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE provincia SET idPROVINCIA = ").append(provinciaMod.getIdprovincia());
             sql.append(", idREGION = ").append(provinciaMod.getIdregion());
            sql.append(", Nombre_Provincia = '").append(provinciaMod.getNombreprovincia()).append("' WHERE idPROVINCIA = ").append(provinciaMod.getIdprovincia());
            this.conn.execute(sql.toString());
            save = true;
            //System.out.println(departamento.getDpto());
        } catch (Exception e) {
        }finally{
            this.conn.close();
        }
//        System.out.println(departamento.getIddpto());
//        System.out.println(departamento.getDpto());
//        System.out.println(departamento.getCostos());
//        System.out.println(departamento.getStatus());
        return save;
    }

    @Override
    public boolean save(ProvinciaModelo provinciaMod) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
//            System.out.println(departamentp.getId()+", "+departamentp.getProv()+", "+departamentp.getDir()+", "+departamentp.getRuc()+", "+departamentp.getTel()+", "+departamentp.getEst());
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO provincia(idPROVINCIA,idREGION,Nombre_Provincia) VALUES(").append("NULL");
                sql.append(", ").append(provinciaMod.getIdregion());
                sql.append(", '").append(provinciaMod.getNombreprovincia()).append("')");
                //String sql1 = "INSERT INTO Proveedor(iddepartamentp)VALUES(10)";
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
            sql.append("DELETE FROM provincia WHERE idPROVINCIA = ").append(id);
            this.conn.execute(sql.toString());
            delete = true;
        } catch (Exception e) {
            
        }finally{
            this.conn.close();
        }
        return delete;
    }
}
