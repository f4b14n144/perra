/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Visual.Visual;

/**
 *
 * @author fabia
 */
public class Usuario implements Observer {
   // private Visual visual = new Visual();
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(int temperatura) 
    {
        System.out.println("Hola " + nombre + "! La temperatura ha cambiado a: " + temperatura);
      
    }
  
    
}
