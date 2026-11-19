package org.upiiz.vista;

import javax.swing.*;

public class VentanaMenuEditor extends JFrame {

    private JMenuItem itemFileFirst;
    private JMenuItem itemFileSecond;
    private JMenuItem itemFileThird;
    private JMenuItem itemSalir;
    private JMenuItem itemHelpFirst;
    private JMenuItem itemHelpSecond;
    private JMenuItem itemHelpThird;
    private JMenuItem itemAbout;

    // Constructor sobrecargado (por defecto)
    public VentanaMenuEditor() {
        this("SCI - Sistema de Control de Inventarios");
    }

    // Constructor original
    public VentanaMenuEditor(String titulo) {
        setTitle(titulo);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        crearMenus();
        setVisible(true);
    }

    private void crearMenus() {
        JMenuBar barraMenus = new JMenuBar();

        // Inicia Menu - File
        JMenu menuFile = new JMenu("File");
        itemFileFirst = new JMenuItem("First action");
        itemFileSecond = new JMenuItem("Second action");
        itemFileThird = new JMenuItem("Third action");
        itemSalir = new JMenuItem("Salir");

        menuFile.add(itemFileFirst);
        menuFile.add(itemFileSecond);
        menuFile.add(itemFileThird);
        menuFile.addSeparator();
        menuFile.add(itemSalir);
        // Termina Menu - File

        // Resto de menús superiores
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuView = new JMenu("View");
        JMenu menuNavigate = new JMenu("Navigate");
        JMenu menuSource = new JMenu("Source");
        JMenu menuRun = new JMenu("Run");

        // Inicia Menu - Help
        JMenu menuHelp = new JMenu("Help");
        itemHelpFirst = new JMenuItem("First action");
        itemHelpSecond = new JMenuItem("Second action");
        itemHelpThird = new JMenuItem("Third action");
        itemAbout = new JMenuItem("About");

        menuHelp.add(itemHelpFirst);
        menuHelp.add(itemHelpSecond);
        menuHelp.add(itemHelpThird);
        menuHelp.addSeparator();
        menuHelp.add(itemAbout);
        // Termina Menu - Help

        barraMenus.add(menuFile);
        barraMenus.add(menuEdit);
        barraMenus.add(menuView);
        barraMenus.add(menuNavigate);
        barraMenus.add(menuSource);
        barraMenus.add(menuRun);
        barraMenus.add(menuHelp);

        setJMenuBar(barraMenus);
    }

    // Métodos de atributos (Getters para que el controlador asigne los eventos)
    public JMenuItem getItemFileFirst() { return itemFileFirst; }
    public JMenuItem getItemFileSecond() { return itemFileSecond; }
    public JMenuItem getItemFileThird() { return itemFileThird; }
    public JMenuItem getItemSalir() { return itemSalir; }
    public JMenuItem getItemHelpFirst() { return itemHelpFirst; }
    public JMenuItem getItemHelpSecond() { return itemHelpSecond; }
    public JMenuItem getItemHelpThird() { return itemHelpThird; }
    public JMenuItem getItemAbout() { return itemAbout; }
}