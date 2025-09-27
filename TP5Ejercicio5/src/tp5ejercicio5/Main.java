/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio5;


public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Anthony Stark", "99888777");
        Computadora compu = new Computadora("JARVIS", "AS0198-JRVS0245", "JS90", "JS90-Z97531-159");
        propietario.setComputadora(compu);

        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("Computadora: " + compu.getMarca());
        System.out.println("Placa Madre: " + compu.getPlacaMadre().getModelo());
    }
}

