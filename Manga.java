/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package modelo;
/**
 *
 * @author JIAME
 */
public class Manga {
     private final String titulo;
    private final String autor;
    private final String genero;
    private int volumen;
    private double precio;

    public Manga(String titulo, String autor, String genero, int volumen, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.volumen = volumen;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getVolumen() {
        return volumen;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return titulo + " | Vol." + volumen + " | $" + precio;
    }
}
