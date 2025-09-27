/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5ejercicio12;


public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculo del impuesto de " + impuesto.getContribuyente().getNombre() +
                           " por un monto de $" + impuesto.getMonto());
    }
}
