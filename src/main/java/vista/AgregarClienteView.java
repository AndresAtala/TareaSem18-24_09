package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;

public class AgregarClienteView {
    private JFrame frame;
    private JTextField nombreField;
    private JTextField direccionField;
    private JTextField telefonoField;
    private JTextField correoField;
    private JTextField rutField;

    public AgregarClienteView() {
        frame = new JFrame("Agregar Cliente");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();
        JLabel direccionLabel = new JLabel("Dirección:");
        direccionField = new JTextField();
        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoField = new JTextField();
        JLabel correoLabel = new JLabel("Correo:");
        correoField = new JTextField();
        JLabel rutLabel = new JLabel("RUT:");
        rutField = new JTextField();

        JButton agregarButton = new JButton("Agregar Cliente");

        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(direccionLabel);
        panel.add(direccionField);
        panel.add(telefonoLabel);
        panel.add(telefonoField);
        panel.add(correoLabel);
        panel.add(correoField);
        panel.add(rutLabel);
        panel.add(rutField);

        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener datos de los campos
                String nombre = nombreField.getText();
                String direccion = direccionField.getText();
                String telefono = telefonoField.getText();
                String correo = correoField.getText();
                String rut = rutField.getText();
                Cliente nuevoCliente = new Cliente(nombre, direccion, telefono, correo, rut);
                nombreField.setText("");
                direccionField.setText("");
                telefonoField.setText("");
                correoField.setText("");
                rutField.setText("");
            }
        });

        panel.add(agregarButton);

        frame.add(panel);
        frame.setVisible(false);
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}
