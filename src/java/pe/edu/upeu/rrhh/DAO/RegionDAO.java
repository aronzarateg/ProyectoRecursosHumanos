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
import pe.edu.upeu.rrhh.interfaces.InterfaceRegion;
import pe.edu.upeu.rrhh.modelo.RegionModelo;

/**
 *
 * @author Dka
 */
public class RegionDAO implements InterfaceRegion{
    ConexionBD conn;

    @Override
    public List<RegionModelo> list() {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM region");
        List<RegionModelo> list = new ArrayList<RegionModelo>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            RegionModelo prov = new RegionModelo();
            prov.setIdregion(rs.getInt("idREGION"));
            prov.setNombreregion(rs.getString("Nombre_Region"));
            
            list.add(prov);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public List<RegionModelo> list(int id) {
        this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM region WHERE idREGION=").append(id);
        List<RegionModelo> list = new ArrayList<RegionModelo>();
        try {
            ResultSet rs = this.conn.query(sql.toString());
            while(rs.next()){
            RegionModelo us = new RegionModelo();
            us.setIdregion(rs.getInt("idREGION"));
            us.setNombreregion(rs.getString("Nombre_Region"));
           
            list.add(us);
            }
        } catch (SQLException e) {
        } finally{
            this.conn.close();
        }
        return list;
    }

    @Override
    public boolean edit(RegionModelo regionMod) {
         this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE region SET idREGION = ").append(regionMod.getIdregion());
            
            sql.append(", Nombre_Region = '").append(regionMod.getNombreregion()).append("' WHERE idREGION = ").append(regionMod.getIdregion());
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
    public boolean save(RegionModelo regionMod) {
         this.conn = FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        boolean save = false;
        try {
//            System.out.println(departamentp.getId()+", "+departamentp.getProv()+", "+departamentp.getDir()+", "+departamentp.getRuc()+", "+departamentp.getTel()+", "+departamentp.getEst());
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO region(idREGION,Nombre_Region) VALUES(").append("NULL");
                
                sql.append(", '").append(regionMod.getNombreregion()).append("')");
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
            sql.append("DELETE FROM region WHERE idREGION = ").append(id);
            this.conn.execute(sql.toString());
            delete = true;
        } catch (Exception e) {
            
        }finally{
            this.conn.close();
        }
        return delete;
    }
    /**
 *connection cx;
 * preparestatement ps;
 * resulset 
 */
}
