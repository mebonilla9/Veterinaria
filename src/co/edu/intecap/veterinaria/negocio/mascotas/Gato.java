/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.veterinaria.negocio.mascotas;

import co.edu.intecap.veterinaria.negocio.Animal;
import co.edu.intecap.veterinaria.negocio.Mascota;

/**
 *
 * @author capacitaciones
 */
public class Gato extends Mascota implements Animal{
    
    private boolean pelo;
    private boolean garras;

    @Override
    public void comer(double comida) {
        this.setPeso(this.getPeso() + (comida * 0.033));
        this.setEnergia(this.getEnergia() + 10);
        this.validarEnergia();
    }

    @Override
    public void defecar() {
        System.out.println("Ya fui al baño, recoje mis cosas estupido humano");
        this.setPeso(this.getPeso() * 0.01);
    }

    @Override
    public void beber(double bebida) {
        this.setPeso(this.getPeso() + (bebida * 0.0033));
    }

    @Override
    public void jugar() {
        super.jugar();
        this.setPeso(this.getPeso() / 0.05);
    }
    
    public void aranar(){
        System.out.println("He arañado a mi dueño, se lo merece por completo");
        this.setEnergia(this.getEnergia() - 3);
        this.validarEnergia();
    }
    
    public void lamer(){
        System.out.println("Me estoy limpiando, me siento muy bien");
        this.setEnergia(this.getEnergia() - 13);
        this.validarEnergia();
    }
    
    public void maullar(){
        System.out.println("Miau... Miau... Miau... ");
    }

    /**
     * @return the pelo
     */
    public boolean isPelo() {
        return pelo;
    }

    /**
     * @param pelo the pelo to set
     */
    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    /**
     * @return the garras
     */
    public boolean isGarras() {
        return garras;
    }

    /**
     * @param garras the garras to set
     */
    public void setGarras(boolean garras) {
        this.garras = garras;
    }
    
}
