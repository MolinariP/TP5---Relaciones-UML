/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio14;


public class main {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Los Sumerios", 180);
        EditorVideo editor = new EditorVideo();
        editor.exportar("avi", proyecto);

    }   
}
