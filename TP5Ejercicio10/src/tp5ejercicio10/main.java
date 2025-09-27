/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio10;


public class main {


    public static void main(String[] args) {
        Titular titular = new Titular("Peter Parker", "34567890");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 35.5, "SMPP123", "01-04-2025");
        titular.setCuenta(cuenta);

        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Cuenta CBU: " + cuenta.getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());

    }
}
