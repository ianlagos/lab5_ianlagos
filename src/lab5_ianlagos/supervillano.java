/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_ianlagos;

/**
 *
 * @author ian
 */
public class supervillano extends info_general{
    protected String encarcelado;
    protected int casualties;

    public supervillano(String encarcelado, int casualties, String nombre, int edad, String planeta_origen, double altura) {
        super(nombre, edad, planeta_origen, altura);
        this.encarcelado = encarcelado;
        this.casualties = casualties;
    }

    public String getEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(String encarcelado) {
        this.encarcelado = encarcelado;
    }

    public int getCasualties() {
        return casualties;
    }

    public void setCasualties(int casualties) {
        this.casualties = casualties;
    }

    @Override
    public String toString() {
        return  "encarcelado=" + encarcelado + ", casualties=" + casualties + '}';
    }
    
}