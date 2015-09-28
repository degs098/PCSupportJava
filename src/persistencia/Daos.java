/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author perne
 */
public class Daos {
    
    public Daos() {
        Daos Dao;
    }
    
    public Usuario getValidarIngreso(Connection con, String user, String pwd) {
        Usuario u = new Usuario();
        u.setUsuario("0");
        try {
            PreparedStatement p =
                    con.prepareStatement(
                    SQLHelper.getValidarIngreso(user, pwd));
            ResultSet r = p.executeQuery();
            while (r.next()) {
                 u.setUsuario(r.getString(1));
                u.setNombre(r.getString(2));
                u.setClave(r.getString(3));                
                u.setEstado(r.getString(4));
                
            }// fin while
        } catch (Exception er) {
            System.out.println("er :" + er.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {

                System.out.println("e :" + e.getMessage());

            }
        }
        return u;
    }
    
}
