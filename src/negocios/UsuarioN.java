/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import BaseDatos.conexion;
import entidades.Usuario;
import java.sql.Connection;
import persistencia.Daos;

/**
 *
 * @author perne
 */


public class UsuarioN {
    public Daos dao;

    public UsuarioN() {
        dao = new Daos();
    }
    
    public Usuario validarIngreso(String user, String clave) {
        Connection c = new conexion().getCon();
        Usuario u = dao.getValidarIngreso(c, user, clave);
        return u;

    }
}
