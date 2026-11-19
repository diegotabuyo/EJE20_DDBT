package org.upiiz.modelo;

public class SistemaInfo {

    private String tituloVentana;
    private String tituloAbout;
    private String mensajeAbout;
    private String desarrollador;

    // Constructor sobrecargado por defecto
    public SistemaInfo() {
        this.tituloVentana = "SCI - Sistema de Control de Inventarios";
        this.tituloAbout = "SCI";
        this.mensajeAbout = "Sistema de Control de Inventarios";
        this.desarrollador = "UPIIZ";
    }

    // Constructor sobrecargado con parámetros
    public SistemaInfo(String tituloVentana, String tituloAbout, String mensajeAbout, String desarrollador) {
        this.tituloVentana = tituloVentana;
        this.tituloAbout = tituloAbout;
        this.mensajeAbout = mensajeAbout;
        this.desarrollador = desarrollador;
    }

    // Métodos de atributos (Getters y Setters)
    public String getTituloVentana() {
        return tituloVentana;
    }

    public void setTituloVentana(String tituloVentana) {
        this.tituloVentana = tituloVentana;
    }

    public String getTituloAbout() {
        return tituloAbout;
    }

    public void setTituloAbout(String tituloAbout) {
        this.tituloAbout = tituloAbout;
    }

    public String getMensajeAbout() {
        return mensajeAbout;
    }

    public void setMensajeAbout(String mensajeAbout) {
        this.mensajeAbout = mensajeAbout;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    // Metodo de comportamiento
    public String obtenerDescripcionCompleta() {
        return mensajeAbout + " - Desarrollado por " + desarrollador;
    }
}