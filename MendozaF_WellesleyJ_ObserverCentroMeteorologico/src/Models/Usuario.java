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
public class Usuario implements Observer  {
    private String nombre;
    private Visual visual;
    

    private int temperatura;

    public Usuario(String nombre, Visual visual) {
        this.nombre = nombre;
        this.visual = visual;
        

    }

    @Override
    public void actualizar(int temperatura) {
        
        System.out.println("Hola " + nombre + "! La temperatura ha cambiado a: " + temperatura);
        this.temperatura = temperatura;
        this.nombre = nombre;
        visual.actualizarLabelsPorNombre(nombre, temperatura);
   

        
      
    }

    public String getNombre() {
        return nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }
}




  

