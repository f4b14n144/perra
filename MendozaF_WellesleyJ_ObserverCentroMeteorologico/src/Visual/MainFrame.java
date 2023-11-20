/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import Models.Usuario;

public class MainFrame extends JFrame {
    private Termometro termometro;
    private JSlider slider;

public MainFrame() {
    
         // Create JLabels for notifications
        JLabel labelUsuario1 = new JLabel();
        JLabel labelUsuario2 = new JLabel();
        JLabel labelUsuario3 = new JLabel();
        JLabel labelUsuario4 = new JLabel();
        JLabel labelUsuario5 = new JLabel();

        // Create Usuario instances and associate each with its corresponding JLabel
  



        
        setTitle("Sistema de Monitoreo Meteorológico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 450); // Aumenté la altura para dar espacio al JLabel
        setLocationRelativeTo(null);

        termometro = new Termometro();
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int temperatura = slider.getValue();
                termometro.setTemperatura(temperatura);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JLabel label = new JLabel("Termómetro", SwingConstants.CENTER); // Creación del JLabel
        panel.add(label, BorderLayout.NORTH); // Agregar el JLabel al panel encima del termómetro
        
        panel.add(termometro, BorderLayout.CENTER);
        panel.add(slider, BorderLayout.SOUTH);

        add(panel);
        Usuario usuario1 = new Usuario("Joseph");
        Usuario usuario2 = new Usuario("Fabian");
        Usuario usuario3 = new Usuario("Paula");
        Usuario usuario4 = new Usuario("Juan");
        Usuario usuario5 = new Usuario("Josefa");

        termometro.addObserver(usuario1);
        termometro.addObserver(usuario2);
        termometro.addObserver(usuario3);
        termometro.addObserver(usuario4);
        termometro.addObserver(usuario5);
    }


    
}