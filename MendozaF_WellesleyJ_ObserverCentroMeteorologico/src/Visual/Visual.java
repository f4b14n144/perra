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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
        int latestSliderValue = 0;
         private Usuario usuario1;
        private Usuario usuario2;
         private Usuario usuario3;
        private Usuario usuario4;
         private Usuario usuario5;


                   
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

  
         Termometro termometro = new Termometro();
   
        
    
    public Visual() {
        

              

    }
        
        
        public void Menu(Visual visual){
            
        
          Usuario usuario1 = new Usuario("Joseph", visual);
          this.usuario1=usuario1;
       Usuario usuario2 = new Usuario("Fabian",visual);
       this.usuario2=usuario2;
        Usuario usuario3 = new Usuario("Paula",visual);
        this.usuario3=usuario3;
      Usuario usuario4 = new Usuario("Juan",visual);
      this.usuario4=usuario4;
       Usuario usuario5 = new Usuario("Josefa",visual);
       this.usuario5 =usuario5;
        
                
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
      //  JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider) e.getSource();
                int sliderValue = source.getValue();
                
                
                //System.out.println("Slider value: " + sliderValue);
                // Add your code here for handling the slider value change
            }
        });

            slider.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    // This is called when the mouse is released after moving the slider
                                int sliderValue = slider.getValue();
                     termometro.setTemperatura(sliderValue);

                     // Store the latest slider value
                     latestSliderValue = sliderValue;;
                   
                    

                    // Add your code to send the slider value or perform any other action related to temperature
                    // e.g., sendSliderValueAsTemperature(sliderValue);
                }
            });
        mensaje = new JLabel();
        mensaje.setSize(250,20);
        mensaje.setLocation(150,50);
        mensaje.setText(" ");
        
        mensaje1 = new JLabel();
        mensaje1.setSize(250,20);
        mensaje1.setLocation(150,125);
        mensaje1.setText(" ");
        
        mensaje2 = new JLabel();
        mensaje2.setSize(250,20);
        mensaje2.setLocation(150,200);
        mensaje2.setText(" ");
        
        mensaje3 = new JLabel();
        mensaje3.setSize(250,20);
        mensaje3.setLocation(150,275);
        mensaje3.setText(" ");
        
        mensaje4 = new JLabel();
        mensaje4.setSize(250,20);
        mensaje4.setLocation(150,350);
        mensaje4.setText(" ");
        
        
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
       

      //  slider.addChangeListener(e -> termometro.setTemperatura(slider.getValue()));
        
       
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
    
                public  void actualizarLabelsPorNombre(String Nombre, int temperatura) {
                    
                    if(Nombre.equalsIgnoreCase("Joseph")){
                        
                        mensaje.setText(usuario1.getNombre()+ " temperatura es: "+usuario1.getTemperatura());
                        
                    }
                    else if(Nombre.equalsIgnoreCase("Fabian")){
                        
                        mensaje1.setText(usuario2.getNombre()+ " temperatura es: "+usuario2.getTemperatura());
                    }
                    else if(Nombre.equalsIgnoreCase("Paula")){
                        
                        mensaje2.setText(usuario3.getNombre()+ " temperatura es: "+usuario3.getTemperatura());
                    }
                    else if(Nombre.equalsIgnoreCase("Juan")){
                        
                        mensaje3.setText(usuario4.getNombre()+ " temperatura es: "+usuario4.getTemperatura());
                        
                    }
                    else if(Nombre.equalsIgnoreCase("Josefa")){
                        
                        mensaje4.setText(usuario5.getNombre()+ " temperatura es: "+usuario5.getTemperatura());
                    }
                    
                    
          
                  

                        
                    
                }
                
        
        
   
    
      

               @Override
                 public void actionPerformed(ActionEvent e) {
                      if (e.getSource() == boton) {
            cambiarLabelBoton(boton);

            if (!estaAplastado) {
                termometro.addObserver(usuario1);

                // Use the latest slider value when the button is pressed
                actualizarLabelsPorNombre("Joseph", usuario1.getTemperatura());

                estaAplastado = true;
            } else {
                termometro.removeObserver(usuario1);
                mensaje.setText(" ");
                estaAplastado = false;
            }

                     } else if (e.getSource() == boton1) {
                         cambiarLabelBoton(boton1);
                         

                         if (!estaAplastado2) {
                             termometro.addObserver(usuario2);
                             int sliderValue = slider.getValue();
                            actualizarLabelsPorNombre("Fabian",usuario2.getTemperatura());
                             estaAplastado2 = true;
                         } else {
                             termometro.removeObserver(usuario2);
                             mensaje1.setText(" ");
                             estaAplastado2 = false; 
                         }

                     } else if (e.getSource() == boton2) {
                         cambiarLabelBoton(boton2);
                        
                         if (!estaAplastado3) {
                             termometro.addObserver(usuario3);
                             int sliderValue = slider.getValue();
                              actualizarLabelsPorNombre("Paula",usuario3.getTemperatura());

                             estaAplastado3 = true;
                         } else {
                             termometro.removeObserver(usuario3);
                             mensaje2.setText(" ");
                             estaAplastado3 = false;  
                         }

                     } else if (e.getSource() == boton3) {
                         cambiarLabelBoton(boton3);
                        
                         if (!estaAplastado4) {
                             termometro.addObserver(usuario4);
                             int sliderValue = slider.getValue();
                              actualizarLabelsPorNombre("Juan",usuario4.getTemperatura());
                             estaAplastado4 = true;
                         } else {
                             termometro.removeObserver(usuario4);
                             mensaje3.setText(" ");
                             estaAplastado4 = false;  
                         }

                     } else if (e.getSource() == boton4) {
                         cambiarLabelBoton(boton4);

                         if (!estaAplastado5) {
                             termometro.addObserver(usuario5);
                             int sliderValue = slider.getValue();
                            actualizarLabelsPorNombre("Josefa",usuario5.getTemperatura());
                             estaAplastado5 = true;
                         } else {
                             termometro.removeObserver(usuario5);
                             mensaje4.setText(" ");
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


    

