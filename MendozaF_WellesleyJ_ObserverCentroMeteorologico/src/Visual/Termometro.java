package Visual;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import Models.Observer;

public class Termometro extends JPanel {
    private int temperatura;
    private Color color;
    private List<Observer> observadores;

    public Termometro() {
        temperatura = 0;
        color = Color.GREEN;
        observadores = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    private void notifyObservers(int temperatura) {
        for (Observer observer : observadores) {
            observer.actualizar(temperatura);
        }
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;

        if (temperatura <= 50) {
            color = Color.GREEN;
        } else if (temperatura <= 80) {
            color = Color.ORANGE;
        } else {
            color = Color.RED;
        }

        notifyObservers(temperatura);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) 
    {
       super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Dibuja el cuerpo del termómetro
        g.setColor(Color.BLACK);
        g.fillRect(20, 20, 20, height - 40);

        // Calcula la altura de la barra de temperatura según el valor actual
        int barHeight = (int) ((height - 40) * (temperatura / 100.0));

        // Dibuja la barra de temperatura con el color correspondiente
        g.setColor(color);
        g.fillRect(20, height - 20 - barHeight, 20, barHeight);
    }

    public int getTemperatura() {
        return temperatura;
    }
}

