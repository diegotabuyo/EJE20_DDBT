package org.upiiz.controlador;

import org.upiiz.modelo.SistemaInfo;
import org.upiiz.vista.VentanaCreditos;
import org.upiiz.vista.VentanaMenuEditor;

import javax.swing.*;

public class ControladorMenu {

    private VentanaMenuEditor vista;
    private SistemaInfo modelo;

    // Constructor sobrecargado completo
    public ControladorMenu(VentanaMenuEditor vista, SistemaInfo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        iniciarEventos();
    }

    // Constructor sobrecargado con modelo por defecto
    public ControladorMenu(VentanaMenuEditor vista) {
        this(vista, new SistemaInfo());
    }

    // Métodos de atributos
    public VentanaMenuEditor getVista() {
        return vista;
    }

    public void setVista(VentanaMenuEditor vista) {
        this.vista = vista;
    }

    public SistemaInfo getModelo() {
        return modelo;
    }

    public void setModelo(SistemaInfo modelo) {
        this.modelo = modelo;
    }

    // Métodos de comportamiento
    public void iniciarEventos() {
        vista.getItemFileFirst().addActionListener(e ->
                mostrarMensaje("Seleccionaste First action en File", "File"));

        vista.getItemFileSecond().addActionListener(e ->
                mostrarMensaje("Seleccionaste Second action en File", "File"));

        vista.getItemFileThird().addActionListener(e ->
                abrirCreditos());

        vista.getItemSalir().addActionListener(e ->
                salirAplicacion());

        vista.getItemHelpFirst().addActionListener(e ->
                mostrarMensaje("Seleccionaste First action en Help", "Help"));

        vista.getItemHelpSecond().addActionListener(e ->
                mostrarMensaje("Seleccionaste Second action en Help", "Help"));

        vista.getItemHelpThird().addActionListener(e ->
                mostrarMensaje("Seleccionaste Third action en Help", "Help"));

        vista.getItemAbout().addActionListener(e ->
                mostrarAbout());
    }

    public void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(vista, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarAbout() {
        JOptionPane.showMessageDialog(vista, modelo.getMensajeAbout(), modelo.getTituloAbout(), JOptionPane.INFORMATION_MESSAGE);
    }

    public void abrirCreditos() {
        new VentanaCreditos("Creditos");
    }

    public void salirAplicacion() {
        System.exit(0);
    }
}