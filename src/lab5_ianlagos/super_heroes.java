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
public class super_heroes extends info_general{
    protected int villanos_atrapados;
    protected int nivelP;

    public super_heroes(int villanos_atrapados, int nivelP, String nombre, int edad, String planeta_origen, double altura) {
        super(nombre, edad, planeta_origen, altura);
        this.villanos_atrapados = villanos_atrapados;
        this.nivelP = nivelP;
    }
    
    
    public int getVillanos_atrapados() {
        return villanos_atrapados;
    }

    public int getNivelP() {
        return nivelP;
    }

    public void setNivelP(int nivelP) {
        this.nivelP = nivelP;
    }
    
    public void setVillanos_atrapados(int villanos_atrapados) {
        this.villanos_atrapados = villanos_atrapados;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
