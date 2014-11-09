/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.rrhh.interfaces;

import java.util.List;
import pe.edu.upeu.rrhh.modelo.ProvinciaModelo;

/**
 *
 * @author Dka
 */
public interface InterfaceProvincia {
    public List<ProvinciaModelo> list();
    public List<ProvinciaModelo> list(int id);
    public boolean edit(ProvinciaModelo provinciaMod);
    public boolean save(ProvinciaModelo provinciaMod);
    public boolean delete(int id);
}
