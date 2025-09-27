/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio12;


public class main {

    public static void main(String[] args) {
        Contribuyente cont = new Contribuyente("Homero J Simpson", "20-12345678-5");
        Impuesto i = new Impuesto(50000.0, cont);

        Calculadora calc = new Calculadora();
        calc.calcular(i);

    } 
}
