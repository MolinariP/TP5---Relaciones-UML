/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio3;

/**
 *
 * @author 54234
 */
public class main {

   
    public static void main(String[] args) {
        Autor autor = new Autor("Greg Iles", "Estadounidense");
        Editorial editorial = new Editorial("Emece", "Av Independencia 1668 CABA");
        Libro libro = new Libro("Terror en la red", "9789500424202", autor, editorial);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
    }
    
}
