/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio8;


public class main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Fernando de Aragon", "realeza@espania.com");
        Documento doc = new Documento("Tratado de Tordesillas", "Division en zonas de influencia", "HASH1234567890", "04-09-1479", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Firmado por: " + doc.getFirma().getUsuario().getNombre());

    }
}
