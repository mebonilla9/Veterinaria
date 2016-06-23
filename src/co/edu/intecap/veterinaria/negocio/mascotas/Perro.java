/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.negocio.mascotas;

import co.edu.intecap.veterinaria.negocio.Animal;
import co.edu.intecap.veterinaria.negocio.Mascota;
import java.awt.Color;

/**
 *
 * @author capacitaciones
 */
public class Perro extends Mascota implements Animal{

    private double tamano;
    private Color color;
    private boolean cola;
    
    @Override
    public void comer(double comida) {
        this.setPeso(this.getPeso() + (comida * 0.05));
        this.setEnergia(this.getEnergia() + 30);
        this.validarEnergia();
    }

    @Override
    public void defecar() {
        System.out.println("Ya fui al baño, recoje mi regalito");
        this.setPeso(this.getPeso() * 0.03);
    }

    @Override
    public void beber(double bebida) {
        this.setPeso(this.getPeso() + (bebida * 0.01));
    }

    @Override
    public void jugar() {
        super.jugar();
        this.setPeso(this.getPeso() / 0.15);
    }
    
    public void morder(){
        System.out.println("He mordido a mi dueño se va a enojar conmigo");
        this.setEnergia(this.getEnergia() - 10);
        this.validarEnergia();
    }
    
    public void correr(double distancia){
        this.setPeso(this.getPeso() - (distancia * 0.10));
        this.setEnergia(this.getEnergia() - 20);
        this.validarEnergia();
    }
    
    public void ladrar(){
        System.out.println("Guau... Guau... Guau...");
    }

    /**
     * @return the tamano
     */
    public double getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the cola
     */
    public boolean isCola() {
        return cola;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    
}
