/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author SOPORTE
 */
public class Cliente {
    private String razonSocial;
    private int cuilCuit;
    private String domicilio;
    private int telefono;
    private String correo;

    public Cliente(String razonSocial, int cuilCuit, String domicilio, int telefono, String correo) {
        this.razonSocial = razonSocial;
        this.cuilCuit = cuilCuit;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuilCuit() {
        return cuilCuit;
    }

    public void setCuilCuit(int cuilCuit) {
        this.cuilCuit = cuilCuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
