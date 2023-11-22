/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;

import Models.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;


import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author jellz
 */
public  class Visual implements ActionListener{
    
    
        private JPanel panel1;
        private JPanel panel2;
        private JFrame frame;
     //   private Termometro termometro;
        private JLabel mensaje;
        private JLabel mensaje1;
        private JLabel mensaje2;
        private JLabel mensaje3;
        private JLabel mensaje4;
        private JLabel cuadro1;
        private JLabel cuadro2;
        private JLabel cuadro3;
        private JLabel cuadro4;
        private JLabel cuadro5;
        private JRadioButton boton;
        private JRadioButton boton1;
        private JRadioButton boton2;
        private JRadioButton boton3;
        private JRadioButton boton4;
       private boolean estaAplastado = false;
       private boolean estaAplastado2 = false;
       private boolean estaAplastado3 = false;
       private boolean estaAplastado4 = false;
       private boolean estaAplastado5 = false;
        
       

         Termometro termometro = new Termometro();
          Usuario usuario1 = new Usuario("Joseph");
         Usuario usuario2 = new Usuario("Fabian");
         Usuario usuario3 = new Usuario("Paula");
        Usuario usuario4 = new Usuario("Juan");
        Usuario usuario5 = new Usuario("Josefa");
  
        
     
   
        
    
    public Visual() {
                
    JFrame frame = new JFrame();
        frame.setTitle("Deber Temperatura");
        frame.setSize(700, 450);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(233,233,233)); 
        panel1.add(new JLabel("Panel 1"));
        panel1.setLayout(null);

        
        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.setBackground(new Color(240,240,240)); 
        
    
        termometro.setBackground(new Color(150,150,150));
        termometro.setSize(200,300);
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        
        mensaje = new JLabel();
        mensaje.setSize(250,20);
        mensaje.setLocation(150,50);
        mensaje.setText("Mensaje de notificacion");
        
        mensaje1 = new JLabel();
        mensaje1.setSize(250,20);
        mensaje1.setLocation(150,125);
        mensaje1.setText("Mensaje de notificacion");
        
        mensaje2 = new JLabel();
        mensaje2.setSize(250,20);
        mensaje2.setLocation(150,200);
        mensaje2.setText("Mensaje de notificacion");
        
        mensaje3 = new JLabel();
        mensaje3.setSize(250,20);
        mensaje3.setLocation(150,275);
        mensaje3.setText("Mensaje de notificacion");
        
        mensaje4 = new JLabel();
        mensaje4.setSize(250,20);
        mensaje4.setLocation(150,350);
        mensaje4.setText("Mensaje de notificacion");
        
        
        boton = new JRadioButton(); 
        boton.setSize(100,20);
        boton.setLocation(45,50);
        boton.addActionListener(this);
        
        boton1 = new JRadioButton(); 
        boton1.setSize(100,20);
        boton1.setLocation(45,125);
        boton1.addActionListener(this);
        
        
        boton2 = new JRadioButton(); 
        boton2.setSize(100,20);
        boton2.setLocation(45,200);
        boton2.addActionListener(this);
        
        
        boton3 = new JRadioButton(); 
        boton3.setSize(100,20);
        boton3.setLocation(45,275);
        boton3.addActionListener(this);
        
        boton4 = new JRadioButton(); 
        boton4.setSize(100,20);
        boton4.setLocation(45,350);
        boton4.addActionListener(this);
        
        cuadro1 = new JLabel();
        cuadro1.setBackground(Color.pink);
        cuadro1.setOpaque(true);
        cuadro1.setSize(30,30);
        cuadro1.setLocation(10,45);
        
        cuadro2 = new JLabel();
        cuadro2.setBackground(new Color(161,255,158));
        cuadro2.setOpaque(true);
        cuadro2.setSize(30,30);
        cuadro2.setLocation(10,120);
        
        
        cuadro3 = new JLabel();
        cuadro3.setBackground(new Color(22,255,14));
        cuadro3.setOpaque(true);
        cuadro3.setSize(30,30);
        cuadro3.setLocation(10,195);
        
        
        cuadro4 = new JLabel();
        cuadro4.setBackground(Color.red);
        cuadro4.setOpaque(true);
        cuadro4.setSize(30,30);
        cuadro4.setLocation(10,270);
        
        
        cuadro5 = new JLabel();
        cuadro5.setBackground(new Color(149,12,190));
        cuadro5.setOpaque(true);
        cuadro5.setSize(30,30);
        cuadro5.setLocation(10,345);
        
       
        
        panel1.add(mensaje);
        panel1.add(mensaje1);
        panel1.add(mensaje2);
        panel1.add(mensaje3);
        panel1.add(mensaje4);
        panel1.add(boton);
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);
        panel1.add(boton4);
        panel1.add(cuadro1);
        panel1.add(cuadro2);
        panel1.add(cuadro3);
        panel1.add(cuadro4);
        panel1.add(cuadro5);
       

        slider.addChangeListener(e -> termometro.setTemperatura(slider.getValue()));
        
       
        panel2.add(termometro, BorderLayout.CENTER);
        panel2.add(slider, BorderLayout.SOUTH);
        panel2.setPreferredSize(new Dimension(150, panel2.getPreferredSize().height));
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        
        frame.setContentPane(mainPanel);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        


       
        // termometro.addObserver(usuario1);
        //termometro.addObserver(usuario2);
     //   termometro.addObserver(usuario3);
       // termometro.addObserver(usuario4);
        //termometro.addObserver(usuario5);

    }
         //visual.actualizarLabelsPorNombre(nombre, temperatura);
    
                public  void actualizarLabelsPorNombre(String nombre,int temperatura) {
          
                    if(nombre.equalsIgnoreCase("Joseph")){
                        
                        mensaje.setText("Hola: "+nombre+" la temp es: "+temperatura);
                        
                    }
                }
                
        
        
    


    

      

               @Override
                 public void actionPerformed(ActionEvent e) {
                     if (e.getSource() == boton) {
                         cambiarLabelBoton(boton);

                         if (!estaAplastado) {
                             termometro.addObserver(usuario1);
                             estaAplastado = true;
                         } else {
                             termometro.removeObserver(usuario1);
                             estaAplastado = false;  
                         }

                     } else if (e.getSource() == boton1) {
                         cambiarLabelBoton(boton1);

                         if (!estaAplastado2) {
                             termometro.addObserver(usuario2);
                             estaAplastado2 = true;
                         } else {
                             termometro.removeObserver(usuario2);
                             estaAplastado2 = false; 
                         }

                     } else if (e.getSource() == boton2) {
                         cambiarLabelBoton(boton2);

                         if (!estaAplastado3) {
                             termometro.addObserver(usuario3);
                             estaAplastado3 = true;
                         } else {
                             termometro.removeObserver(usuario3);
                             estaAplastado3 = false;  
                         }

                     } else if (e.getSource() == boton3) {
                         cambiarLabelBoton(boton3);

                         if (!estaAplastado4) {
                             termometro.addObserver(usuario4);
                             estaAplastado4 = true;
                         } else {
                             termometro.removeObserver(usuario4);
                             estaAplastado4 = false;  
                         }

                     } else if (e.getSource() == boton4) {
                         cambiarLabelBoton(boton4);

                         if (!estaAplastado5) {
                             termometro.addObserver(usuario5);
                             estaAplastado5 = true;
                         } else {
                             termometro.removeObserver(usuario5);
                             estaAplastado5 = false;  
                         }
                     }
                 }

            
            private void cambiarLabelBoton(JRadioButton botonn){
                
                            if ("Suscrito!".equals(botonn.getText())) {
                                
                                    botonn.setText(""); 
                                    
                                           } 
                            else {
                                
                                      botonn.setText("Suscrito!");
                        }
           }
    
        
    }


    

