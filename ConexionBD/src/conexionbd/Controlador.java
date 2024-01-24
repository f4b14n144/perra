/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbd;

/**
 *
 * @author fabia
 */
public class Controlador 
{
    Operaciones o=new Operaciones();
    public void obtenerConexion ()
    {
        o.conectar();
    }
    
    public void agregar()
    {
        boolean respuesta=o.agregarEmpleado("015","juan","pesantez","52",3);
          if(respuesta)
        {
            System.out.println("Agregado correctamente");
            
        }
        else
        {
            System.out.println("no se agrego");
        }
    }
    
}
