//Elaborado por Juan Felipe Fajardo y Nicolás Diosa
package ejemplolist;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EjemploList extends JFrame{
    
    public static void main(String[] args)
            {
        JFrame cuadro = new JFrame("Ejemplo JList");
        cuadro.setBounds(50, 50,300, 200);
        String[] Elementos = new String[4];
        Elementos[0] = "Rojo";
        Elementos[1] = "Verde";
        Elementos[2] = "Amarillo";
        Elementos[3] = "Azul";

        JList<String> lista = new JList<>(Elementos);

        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(lista);//Es un contenedor para redimensionar con barras deslizables según el tamaño
        cuadro.add(scrollPane);
        EjemploList e = new EjemploList();
        lista.addListSelectionListener(new ListSelectionListener(){//Se crea un captador del evento de seleccion
            @Override
            public void valueChanged(ListSelectionEvent e) {//Se confirma si es verdad que hubo un evento de seleccion
                
                String seleccion = (String) lista.getSelectedValue();
                switch (seleccion){
                    case "Rojo" -> lista.setBackground(Color.red);
                    case "Verde" -> lista.setBackground(Color.GREEN);
                    case "Azul" -> lista.setBackground(Color.BLUE);
                    case "Amarillo" -> lista.setBackground(Color.YELLOW);
                }
                
            }
        });

        cuadro.setVisible(true);
        cuadro.setDefaultCloseOperation(3);
    }
}