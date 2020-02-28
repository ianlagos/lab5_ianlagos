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
    protected int nivel_poder;

    public supervillano(String encarcelado, int casualties, int nivel_poder, String nombre, int edad, String planeta_origen, double altura) {
        super(nombre, edad, planeta_origen, altura);
        this.encarcelado = encarcelado;
        this.casualties = casualties;
        this.nivel_poder = nivel_poder;
    }
    
    
    public int getNivel_poder() {
        return nivel_poder;
    }

    public void setNivel_poder(int nivel_poder) {
        this.nivel_poder = nivel_poder;
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
        return  nombre;
    }
    
}
