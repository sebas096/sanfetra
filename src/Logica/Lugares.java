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
public class Lugares {
    private String codigo;
    private String lugar;

    public Lugares(String codigo, String nombre) {
        this.codigo = codigo;
        this.lugar = nombre;
    }

    public Lugares() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getlugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    
    
    
}
