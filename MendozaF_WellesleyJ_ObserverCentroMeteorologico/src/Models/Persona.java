/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author fabia
 */
public class Persona implements Suscrito
{

    private String nombre;
    
    public Persona ( String nombre)
    {
        this.nombre=nombre;
    }

    @Override
    public void actualizar( float temperatura) {
        System.out.println(nombre+"la temperatura cambio a "+temperatura);
    }
    
}
