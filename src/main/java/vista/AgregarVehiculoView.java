package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Vehiculo;

public class AgregarVehiculoView {
    private JFrame frame;
    private JTextField nombreTextField;
    private JTextField añoTextField;
    private JTextField precioTextField;
    private JTextField kilometrosTextField;
    private JTextField colorTextField;
    private JTextField marcaTextField;
    private JButton agregarButton;

    public AgregarVehiculoView() {
        frame = new JFrame("Agregar Vehículo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear componentes Swing
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField(20);
        JLabel añoLabel = new JLabel("Año:");
        añoTextField = new JTextField(4);
        JLabel precioLabel = new JLabel("Precio:");
        precioTextField = new JTextField(10);
        JLabel kilometrosLabel = new JLabel("Kilómetros:");
        kilometrosTextField = new JTextField(10);
        JLabel colorLabel = new JLabel("Color:");
        colorTextField = new JTextField(15);
        JLabel marcaLabel = new JLabel("Marca:");
        marcaTextField = new JTextField(15);

        agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                int año = Integer.parseInt(añoTextField.getText());
                double precio = Double.parseDouble(precioTextField.getText());
                double kilometros = Double.parseDouble(kilometrosTextField.getText());
                String color = colorTextField.getText();
                String marca = marcaTextField.getText();
                Vehiculo vehiculo = new Vehiculo(nombre, año, precio, kilometros, color, marca);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10)); // Filas, columnas, espacio horizontal, espacio vertical
        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(añoLabel);
        panel.add(añoTextField);
        panel.add(precioLabel);
        panel.add(precioTextField);
        panel.add(kilometrosLabel);
        panel.add(kilometrosTextField);
        panel.add(colorLabel);
        panel.add(colorTextField);
        panel.add(marcaLabel);
        panel.add(marcaTextField);
        panel.add(agregarButton);

        frame.add(panel);

        frame.setVisible(false);
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}
