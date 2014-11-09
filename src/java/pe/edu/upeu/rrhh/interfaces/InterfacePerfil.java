/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.rrhh.interfaces;

import java.util.List;
import pe.edu.upeu.rrhh.modelo.PerfilModelo;

/**
 *
 * @author george
 */
public interface InterfacePerfil {
    public List<PerfilModelo> list();
    public List<PerfilModelo> list(int id);
    public boolean edit(PerfilModelo perfilMod);
    public boolean save(PerfilModelo perfilMod);
    public boolean delete(int id);
}
