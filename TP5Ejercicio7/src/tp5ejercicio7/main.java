/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio7;

public class main {


    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "TA1982V8");
        Vehiculo vehiculo = new Vehiculo("KITT", "Pontiac Firebird ", motor);
        Conductor conductor = new Conductor("Michael Knight", "B56T149137");
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + conductor.getNombre());
        System.out.println("Vehículo: " + vehiculo.getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
    }
}
