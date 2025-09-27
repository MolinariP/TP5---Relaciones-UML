/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5ejercicio9;


public class main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Michael Tritter", "IOMA");
        Profesional profesional = new Profesional("Dr. Gregory House", "Clinica");
        CitaMedica cita = new CitaMedica("12-10-2006", "09:30", paciente, profesional);

        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Cita: " + cita.getFecha() + " " + cita.getHora());

    }
}
