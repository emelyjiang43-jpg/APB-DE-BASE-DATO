/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import javax.swing.*;
/**
 *
 * @author JIAME
 */
public class ListaManga extends JFrame {

    public ListaManga() {

        setTitle("Lista de Mangas");
        setSize(300, 300);

        DefaultListModel modelo = new DefaultListModel();

        for (var m : MangaData.listaMangas) {
            modelo.addElement(m.toString());
        }

        JList lista = new JList(modelo);
        add(new JScrollPane(lista));
    }
}
