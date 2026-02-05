/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import javax.swing.*;
import modelo.Manga;
import vista.MangaData;
/**
 *
 * @author JIAME
 */
 public class RegistroManga extends JFrame {

    public RegistroManga() {

        setTitle("Registrar Manga");
        setSize(350, 350);
        setLayout(null);

        JLabel lblTitulo = new JLabel("Título:");
        JTextField txtTitulo = new JTextField();

        JLabel lblAutor = new JLabel("Autor:");
        JTextField txtAutor = new JTextField();

        JLabel lblGenero = new JLabel("Género:");
        JTextField txtGenero = new JTextField();

        JLabel lblVolumen = new JLabel("Volumen:");
        JTextField txtVolumen = new JTextField();

        JLabel lblPrecio = new JLabel("Precio:");
        JTextField txtPrecio = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        lblTitulo.setBounds(30, 20, 100, 25);
        txtTitulo.setBounds(130, 20, 150, 25);

        lblAutor.setBounds(30, 60, 100, 25);
        txtAutor.setBounds(130, 60, 150, 25);

        lblGenero.setBounds(30, 100, 100, 25);
        txtGenero.setBounds(130, 100, 150, 25);

        lblVolumen.setBounds(30, 140, 100, 25);
        txtVolumen.setBounds(130, 140, 150, 25);

        lblPrecio.setBounds(30, 180, 100, 25);
        txtPrecio.setBounds(130, 180, 150, 25);

        btnGuardar.setBounds(100, 230, 120, 30);

        add(lblTitulo); add(txtTitulo);
        add(lblAutor); add(txtAutor);
        add(lblGenero); add(txtGenero);
        add(lblVolumen); add(txtVolumen);
        add(lblPrecio); add(txtPrecio);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            try {
                if (txtTitulo.getText().isEmpty() || txtAutor.getText().isEmpty()) {
                    throw new Exception("Campos vacíos");
                }

                Manga manga = new Manga(
                        txtTitulo.getText(),
                        txtAutor.getText(),
                        txtGenero.getText(),
                        Integer.parseInt(txtVolumen.getText()),
                        Double.parseDouble(txtPrecio.getText())
                );

                MangaData.agregarManga(manga);
                JOptionPane.showMessageDialog(null, "Manga guardado");
                dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        });
    }
}
