/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import persistencia.SQLHelper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author samsung
 */
public class conexion {
    public Connection Con; //Objeto publico conexion

    public Connection getCon() {
        ConexionDB();
        return Con;

    }

    public void setCon(Connection Con) {//objeto publico que devuelve una conexion
        this.Con = Con;

    }
    
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
        } catch (ClassNotFoundException e1) {
            System.out.println("ClassNotFoundException: " + e1.getMessage());
        } catch (InstantiationException e2) {
            System.out.println("InstantiationException: " + e2.getMessage());
        } catch (IllegalAccessException e3) {
            System.out.println("IllegalAccessException: " + e3.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }// fin static

    public conexion() {   // constructor  
    }

    /*public void cerrarBd() throws SQLException //metodo para cerrar la base de datos
    {
        this.Con.close();//cierra la base de datos
    }*/

    static {
        try {
            //se instancia la conexion con el ojbdc oracle.jdbc.driver.OracleDriver
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();

        } catch (ClassNotFoundException e1) {
            System.out.println("ClassNotFoundException" + e1.getMessage());
        } catch (InstantiationException e2) {
            System.out.println("InstantiationException" + e2.getMessage());   //se controlan los mensajes de error
        } catch (IllegalAccessException e3) {
            System.out.println("IllegalAccessException" + e3.getMessage());
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }
    }

    public void ConexionDB() {
        String host = "localhost";
        String puerto = "8084";
        String SID = "xe";
        String user = "PC_Support";
        String password = "123";

        try {
            /*ok */ DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            setCon(DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + puerto + ":" + SID, "PC_Support", "123"));
            /*ok*/
            /*ok */ setCon(DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + puerto + ":" + SID, user, password));


            // /* para mysql
            //   setCon(DriverManager.getConnection("jdbc:mysql://localhost:3306/mibd", "juan", "123"));
            //*/
        } catch (SQLException e4) {
            System.out.print("SQLException e4 " + e4.getMessage() + e4.getErrorCode());

        } catch (Exception e5) {
            System.out.print("SQLException e5" + e5.getMessage());

        }
    }

    public static void main(String param[]) {
        conexion Connection = new conexion();

        try {
            ResultSet r = Connection.getCon().prepareStatement(SQLHelper.getValidarIngreso("zamueland", "123")).executeQuery();
            if (r.next()) {
                System.out.println("\nNombre de Usuario: " + r.getString(1) + "\n" + "Contraseña: " + r.getString(3) + "\n" + "Estado: " + r.getString(4));
                while (r.next()) {
                    System.out.println("\nNombre de Usuario: " + r.getString(1) + "\n" + "Contraseña: " + r.getString(3) + "\n" + "Estado: " + r.getString(4));
                }
            } else {
                System.out.println("no hay datos");
            }
        } catch (Exception e) {
            System.out.println("Excepcion " + e.getMessage());
        } finally {
            //try {
                //Connection.cerrarBd();
           // } catch (SQLException ex) {
            //}
        }

    }
}
