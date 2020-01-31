/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.claseartifact;

/**
 *
 * @author San
 */
public class Animal {
    private String especie, raza, nombre;
    private int peso;

    public Animal(String especie, String raza, String nombre, int peso) {
        this.especie = especie;
        this.raza = raza;
        this.nombre = nombre;
        this.peso = peso;
    }

    public void adelgazar(int cantidad){
        this.peso -= cantidad;
    }
    
    public void engordar(int cantidad){
        this.peso += cantidad;
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "El animal se llama: " + nombre + "\nPesa: " + peso + "\nEs de la especie: " + especie + " y de la raza: " + raza + ".";
    }
}
