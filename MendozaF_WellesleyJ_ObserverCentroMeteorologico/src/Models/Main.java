/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

import Visual.MainFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author fabia
 */
public class Main {

  
    public static void main(String[] args) 
    {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
    
        
        
    }
    

