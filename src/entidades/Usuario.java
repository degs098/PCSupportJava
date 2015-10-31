/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author perne
 */
public class Usuario {
    String usuario;
    String nombre;
    String clave;
    String estado;
    String perfil;

    public String getUsuario() {
        return usuario;
    }
    
    public Usuario() {
    }

    public Usuario(String usuario, String nombre, String clave,String estado, String perfil) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.clave = clave;       
        this.estado = estado;
        this.perfil = perfil;        
    }//fin constructor con parametros

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
}
