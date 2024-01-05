/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kelly
 */
public class PERRO {
    private String raza;
    private boolean correr;
    private boolean jugar;

    public Perro(String nombre, int edad, String hacerSonidos, String raza, boolean correr, boolean jugar) {
        super(nombre, edad, hacerSonidos);
        this.raza = raza;
        this.correr = correr;
        this.jugar = jugar;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Perro: " + nombre + ", Edad: " + edad + ", Hacer Sonidos: " + hacerSonidos);
        System.out.println("Raza: " + raza + ", Correr: " + correr + ", Jugar: " + jugar);
    }
}
 
}
