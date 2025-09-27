/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio13;


public class main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Bender Rodriguez", "bender@ilovebender.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("COD0110011012", usuario);

    }
}
