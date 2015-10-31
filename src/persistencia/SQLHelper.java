/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author samsung
 */
public class SQLHelper {
    
    public static String getUsuarios(){
        return "SELECT * FROM TBLUSUARIO";
    }
    
    public static String getValidarIngreso(String user, String pdw) {
        return "SELECT usuario,nombre, clave, estado, perfil "
                + "FROM tblusuario "
                + " WHERE usuario='" + user + "' AND clave='" + pdw + "' ";
    }//fin metodo validar
}
