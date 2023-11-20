/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author fabia
 */
public class Usuario implements Observer {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(int temperatura) {
        System.out.println("Hola " + nombre + "! La temperatura ha cambiado a: " + temperatura);
        // You can update JLabels or perform other actions here for UI notification
    }
}
