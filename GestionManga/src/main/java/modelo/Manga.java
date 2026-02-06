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
    private String nombre;
    private double precio;

    public Manga(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Manga(String text, String text0, String text1, int parseInt, double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

