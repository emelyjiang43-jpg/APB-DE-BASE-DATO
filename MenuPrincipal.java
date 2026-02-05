/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import datos.RegistroManga;
import javax.swing.*;


/**
 *
 * @author JIAME
 */
public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {

        setTitle("Gestión de Libros Manga");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnRegistrar = new JButton("Registrar Manga");
        btnRegistrar.setBounds(100, 60, 200, 30);

        JButton btnListar = new JButton("Listar Mangas");
        btnListar.setBounds(100, 110, 200, 30);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(100, 160, 200, 30);

        add(btnRegistrar);
        add(btnListar);
        add(btnSalir);

        btnRegistrar.addActionListener(e -> {
            new RegistroManga().setVisible(true);
        });

        btnListar.addActionListener(e -> {
            new ListaManga().setVisible(true);
        });

        btnSalir.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        new MenuPrincipal().setVisible(true);
    }
}
