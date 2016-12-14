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
public class Grupos {
    private String codigo;
    private String codigoGrupo;

    public Grupos(String codigo, String codigoGrupo) {
        this.codigo = codigo;
        this.codigoGrupo = codigoGrupo;
    }

    public Grupos() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }
    
    
    
}
