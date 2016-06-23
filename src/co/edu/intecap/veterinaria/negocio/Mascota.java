/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.negocio;

/**
 *
 * @author capacitaciones
 */
public class Mascota {
    
    protected double peso;
    protected String raza;
    protected String dueno;
    protected int edad;
    protected String nombre;
    protected double energia;
    
    public void jugar(){
        this.setEnergia(this.getEnergia() - 40);
        System.out.println("Huy como me divierto!");
        this.validarEnergia();
    }
    
    public void dormir(){
        this.setEnergia(this.getEnergia() + 70);
        System.out.println("Zzzzzzz...");
        this.validarEnergia();
    }
    
    public void vacunar(){
        if(this.getEnergia() <= 30){
            this.setEnergia(this.getEnergia() + 50);
            System.out.println("Ya me encuentro sano y listo para jugar otra vez");
            return;
        }
        System.out.println("No necesito esa vacuna, me encuentro bien");
    }
    
    protected void validarEnergia(){
        if (this.getEnergia() >100) {
            this.setEnergia(100);
        }
        if (this.getEnergia() < 0) {
            this.setEnergia(0);
        }
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the dueno
     */
    public String getDueno() {
        return dueno;
    }

    /**
     * @param dueno the dueno to set
     */
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the energia
     */
    public double getEnergia() {
        return energia;
    }

    /**
     * @param energia the energia to set
     */
    public void setEnergia(double energia) {
        this.energia = energia;
    }
    
    
    
}
