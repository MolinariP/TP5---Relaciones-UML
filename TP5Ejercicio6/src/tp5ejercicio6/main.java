/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio6;



public class main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Hannibal Lecter", "1122334455");
        Mesa mesa = new Mesa(1, 2);
        Reserva reserva = new Reserva("25-12-2025", "21:00", cliente, mesa);

        System.out.println("Reserva para: " + reserva.getCliente().getNombre());
        System.out.println("Mesa N°: " + reserva.getMesa().getNumero());

    }
}
