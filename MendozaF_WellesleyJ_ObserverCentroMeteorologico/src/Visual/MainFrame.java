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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;

public class MainFrame extends JFrame implements ActionListener {
    
    private JFrame frame;
    private Termometro termometro;
    private JSlider slider;
    private JPanel panelMedio;
  

public MainFrame() {
        // Create the main frame
        frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Sistema de Monitoreo Meteorológico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 450);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        // Create the Termometro and slider
        termometro = new Termometro();
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int temperatura = slider.getValue();
                termometro.setTemperatura(temperatura);
            }
        });

        // Create the panelMedio
        panelMedio = new JPanel();
        panelMedio.setBackground(Color.red);
        panelMedio.setLayout(new BorderLayout());

        // Add Termometro to panelMedio at the center
        panelMedio.add(termometro, BorderLayout.CENTER);

        // Create the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Termómetro", SwingConstants.CENTER);
        panel.add(label, BorderLayout.NORTH);
        panel.add(panelMedio, BorderLayout.CENTER); // Add panelMedio to the center of the panel
        panel.add(slider, BorderLayout.SOUTH);
        
        JLabel labelus= new JLabel();
        labelus.setSize(100,40);
        

        // Add the main panel to the frame
        frame.add(panel);

        // Create Usuario instances
        Usuario usuario1 = new Usuario("Joseph");
        Usuario usuario2 = new Usuario("Fabian");
        Usuario usuario3 = new Usuario("Paula");
        Usuario usuario4 = new Usuario("Juan");
        Usuario usuario5 = new Usuario("Josefa");

        // Add observers to the Termometro
        termometro.addObserver(usuario1);
        termometro.addObserver(usuario2);
        termometro.addObserver(usuario3);
        termometro.addObserver(usuario4);
        termometro.addObserver(usuario5);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}