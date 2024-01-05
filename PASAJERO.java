/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kelly
 */
public class PASAJERO extends CHOFERPASAJERO{
    public boolean pedirTaxi;
    public boolean cancelarTaxi;

   

    public PASAJERO(String nombre, int edad, String cedula,boolean pedirTaxi, boolean cancelarTaxi) {
        super(nombre, edad, cedula);
        this.pedirTaxi = pedirTaxi;
        this.cancelarTaxi = cancelarTaxi;
    }
    

public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(", Cedula: " + edad + "PASAJERO: " + nombre + ", edad: " + cedula);
        System.out.println(cancelarTaxi + "PedirTaxi: " + ", CancelarTaxi: " + pedirTaxi);
    }
}