/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import modelo.Manga;
/**
 *
 * @author JIAME
 */
public class MangaData {
     public static ArrayList<Manga> listaMangas = new ArrayList<>();

    public static void agregarManga(Manga manga) {
        listaMangas.add(manga);
    }
}
