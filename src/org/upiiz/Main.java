package org.upiiz;

import org.upiiz.controlador.ControladorMenu;
import org.upiiz.modelo.SistemaInfo;
import org.upiiz.vista.VentanaMenuEditor;

//Diego Daniel Becerra Tabuyo 3IM1

public class Main {
    public static void main(String[] args) {
        SistemaInfo modelo = new SistemaInfo();
        VentanaMenuEditor vista = new VentanaMenuEditor(modelo.getTituloVentana());
        new ControladorMenu(vista, modelo);
    }
}