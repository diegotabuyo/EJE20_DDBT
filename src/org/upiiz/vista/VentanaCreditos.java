package org.upiiz.vista;

import javax.swing.*;

public class VentanaCreditos extends JFrame {

    //Es solo el diseño de la ventana - Contenido de la ventana
    private Creditos creditos;

    //Constructor
    public VentanaCreditos(String titulo) {
        //Le creamos su contenido
        creditos = new Creditos();
        setContentPane(creditos.getPanel());

        setTitle(titulo);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
