/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio11;


public class main {

    public static void main(String[] args) {
        Artista artista = new Artista("Creedence Clearwater Revival", "Rock");
        Cancion cancion = new Cancion("Have you ever seen the rain", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);

    }
}
