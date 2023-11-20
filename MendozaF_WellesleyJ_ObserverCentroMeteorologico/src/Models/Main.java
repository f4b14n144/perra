/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

/**
 *
 * @author fabia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CentroMeteorologicoConcreto cmc=new CentroMeteorologicoConcreto();
        
        Persona p1=new Persona("marta");
        Persona p2=new Persona("juan");
        Persona p3=new Persona("joseph");
        Persona p4=new Persona("fabian");
        
        cmc.registrarSubscriptor(p1);
        cmc.registrarSubscriptor(p2);
        cmc.registrarSubscriptor(p3);
        cmc.registrarSubscriptor(p4);
        
        cmc.notificarCambio(30);
        cmc.notificarCambio(50);
        cmc.notificarCambio(1000);
        
    }
    
}
