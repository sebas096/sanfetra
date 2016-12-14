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
public class Paseos {
    private String codigo;
    private String nombre;
    private String hospedaje;
    private String fechaSalida;
    private String fechaLlegada;
    private String precioUnitario;
    private String codigoLugar;
    private String descripcion;
    private String cupo;
    private String numeroBuses;

    public Paseos() {
    }

    public Paseos(String codigo, String nombre, String hospedaje, String fechaSalida, String fechaLlegada, String precioUnitario, String codigoLugar, String descripcion, String cupo, String numeroBuses) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.hospedaje = hospedaje;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.precioUnitario = precioUnitario;
        this.codigoLugar = codigoLugar;
        this.descripcion = descripcion;
        this.cupo = cupo;
        this.numeroBuses = numeroBuses;
    }

    public String getNumeroBuses() {
        return numeroBuses;
    }

    public void setNumeroBuses(String numeroBuses) {
        this.numeroBuses = numeroBuses;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(String hospedaje) {
        this.hospedaje = hospedaje;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCodigoLugar() {
        return codigoLugar;
    }

    public void setCodigoLugar(String codigoLugar) {
        this.codigoLugar = codigoLugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCupo() {
        return cupo;
    }

    public void setCupo(String cupo) {
        this.cupo = cupo;
    }
    
}
