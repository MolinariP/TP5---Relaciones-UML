/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio2;

public class main {


    public static void main(String[] args) {
        Bateria bateria = new Bateria("XHRSZ1M2", 300);
        Celular celular = new Celular("+541122334455", "Sorny", "Z10", bateria);
        Usuario usuario = new Usuario("Enrique Chalar", "34567890");
        usuario.setCelular(celular);

        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Celular: " + celular.getMarca() + " " + celular.getModelo());
        System.out.println("Batería: " + celular.getBateria().getModelo() + " - " + celular.getBateria().getCapacidad() + "mAh");
    }
    
    
}
