/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;
public class GATO extends ANIMALES {
    private String colorPelo;
    private boolean treparArbol;
    private boolean cazarRaton;

    public Gato(String nombre, int edad, String hacerSonidos, String colorPelo, boolean treparArbol, boolean cazarRaton) {
        super(nombre, edad, hacerSonidos);
        this.colorPelo = colorPelo;
        this.treparArbol = treparArbol;
        this.cazarRaton = cazarRaton;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Gato: " + nombre + ", Edad: " + edad + ", Hacer Sonidos: " + hacerSonidos);
        System.out.println("Color de Pelo: " + colorPelo + ", Trepar Árbol: " + treparArbol + ", Cazar Ratón: " + cazarRaton);
    }
}

