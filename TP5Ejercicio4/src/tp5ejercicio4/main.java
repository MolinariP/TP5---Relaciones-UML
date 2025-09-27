/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio4;


public class main {

   
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Rio", "30-50000845-4");
        Cliente cliente = new Cliente("Fernando Araujo", "11222333");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234567890123456", "12/25", banco);
        cliente.setTarjeta(tarjeta);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tarjeta: " + tarjeta.getNumero());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    
    }
}
