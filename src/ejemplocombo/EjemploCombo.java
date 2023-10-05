//Elaborado por Juan Felipe Fajardo y Nicolás Diosa
package ejemplocombo;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class EjemploCombo implements ItemListener{
    static JComboBox<String> combo =new JComboBox<String>();
    static JFrame cuadro = new JFrame("Ejemplo ComboBox");

    public void itemStateChanged(ItemEvent evento) {
        if (evento.getSource()==combo) {
            String seleccionado=(String)combo.getSelectedItem();
            switch(seleccionado){
                case "Rojo":
                    cuadro.getContentPane().setBackground(Color.RED);
                    break;
                case "Verde":
                    cuadro.getContentPane().setBackground(Color.GREEN);
                    break;
                case "Azul":
                    cuadro.getContentPane().setBackground(Color.BLUE);
                    break;
            }
            
        }
    } 
    public static void main(String[] ar) {
        
        combo.setBounds(60, 40, 80, 20);
        combo.addItem("Rojo");
        combo.addItem("Verde");
        combo.addItem("Azul");
        combo.addItemListener(new EjemploCombo());
        cuadro.add(combo);
        
        cuadro.setLocationRelativeTo(null);
        cuadro.setLayout(null);

        cuadro.setBounds(500,100,200,150);
        cuadro.setVisible(true);
        cuadro.setDefaultCloseOperation(3);
    } 
    
}