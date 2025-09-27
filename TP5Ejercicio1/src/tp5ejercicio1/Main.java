/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio1;


public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Homero Thompson", "23456789");
        Pasaporte pasaporte = new Pasaporte("LT23456789", "04-08-1905", "imagen.jpg", "JPG");
        titular.setPasaporte(pasaporte);
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
    
}
