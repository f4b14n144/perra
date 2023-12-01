/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author jellz
 */
public class Reader {
    public void leerArchivo() {
   
    String filePath = "src/reader/Empleados.txt";

        try {
            Scanner scanner = new Scanner(new File(filePath));

            int lineNumber = 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Assuming the variables are in order: Nombre, Tipo empleado, minutos, minutos extras, seguro médico, bonificaciones
                if (lineNumber == 2) {
                    String[] words = line.split(",");

                    // Define variable names
                    String[] variableNames = {"Nombre", "Tipo empleado", "minutos", "minutos extras", "seguro médico", "bonificaciones"};

                    // Print each variable with its name
                    for (int i = 0; i < words.length; i++) {
                        System.out.println(variableNames[i] + ": " + words[i].trim());
                    }

                    break;
                }

                lineNumber++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


    

