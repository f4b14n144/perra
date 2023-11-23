/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

import Visual.Visual;


import javax.swing.SwingUtilities;

/**
 *
 * @author fabia
 */
public class Main {

  
    public static void main(String[] args) 
    {
        //MainFrame frame = new MainFrame();
       Visual vis = new Visual();
       vis.Menu(vis);
     
              
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
               
            }
        });
    }
    
        
        
    }
    

