/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabia
 */
public class CentroMeteorologicoConcreto implements CentroMeteorologico
{
    private List<Suscrito> Suscriptores= new ArrayList();

     @Override
    public void registrarSubscriptor(Suscrito sus) 
    {
        Suscriptores.add(sus);
    }

    @Override
    public void notificarCambio( float temperatura) 
    {
           for (Suscrito  sus: Suscriptores)
        {
            sus.actualizar(temperatura);
        }
    }
    
  
}
