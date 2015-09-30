/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author samsung
 */
public class Solicitudes {
    
    int id;
    String caso;
    String tipo_caso;
    
    public Solicitudes(){
        
    }
    
    public Solicitudes(int id, String caso, String tipo_caso){
        this.id = id;
        this.caso = caso;
        this.tipo_caso = tipo_caso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getTipo_caso() {
        return tipo_caso;
    }

    public void setTipo_caso(String tipo_caso) {
        this.tipo_caso = tipo_caso;
    }
    
    
}
