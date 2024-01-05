/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kelly
 */
public class CHOFER extends CHOFERPASAJERO{
    private final String placa;
    private final String codigoTaxi;
    private final boolean aceptarCarrera;
    private final boolean cancelarCarrera;

    public CHOFER(String nombre, int edad, String cedula, String placa, String codigoTaxi, boolean aceptarCarrera, boolean cancelarCarrera) {
        super(nombre, edad, cedula);
        this.placa = placa;
        this.codigoTaxi = codigoTaxi;
        this.aceptarCarrera = aceptarCarrera;
        this.cancelarCarrera = cancelarCarrera;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Chofer: " + nombre + ", Edad: " + edad + ", Cedula: " + cedula);
        System.out.println("Placa: " + placa + ", Código Taxi: " + codigoTaxi);
        System.out.println("Aceptar Carrera: " + aceptarCarrera + ", Cancelar Carrera: " + cancelarCarrera);
    }
}

    
}
