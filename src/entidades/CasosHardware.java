/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author samsung
 */
public class CasosHardware {
    String id;
    String caso;
    String solucion;
    
    public CasosHardware(){
        
    }
    
    public CasosHardware(String id, String caso, String solucion){
        this.id = id;
        this.caso = caso;
        this.solucion = solucion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }
        
}
