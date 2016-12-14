/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;



/**
 *
 * @author ASUS
 */
public class Ciudad {

    private String codigo;
    private String codigoDepto;
    private String nombre;

    public Ciudad() {
    }

    public Ciudad(String codigo, String codigoDepto, String nombre) {
        this.codigo = codigo;
        this.codigoDepto = codigoDepto;
        this.nombre = nombre;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoDepto() {
        return codigoDepto;
    }

    public void setCodigoDepto(String codigoDepto) {
        this.codigoDepto = codigoDepto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
