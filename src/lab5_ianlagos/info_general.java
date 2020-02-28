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
public class info_general {
    protected String nombre;
    protected int edad;
    protected String planeta_origen;
    protected double altura;

    public info_general() {
    }

    public info_general(String nombre, int edad, String planeta_origen, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.planeta_origen = planeta_origen;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPlaneta_origen() {
        return planeta_origen;
    }

    public void setPlaneta_origen(String planeta_origen) {
        this.planeta_origen = planeta_origen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "info_general{" + "nombre=" + nombre + ", edad=" + edad + ", planeta_origen=" + planeta_origen + ", altura=" + altura + '}';
    }
    
}
