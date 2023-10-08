package vista;
import javax.swing.*;
import java.awt.*;
public class AgregarClienteView {
    private JFrame frame;

    public AgregarClienteView() {
        frame = new JFrame("Agregar Cliente");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10)); // Filas, columnas, espacio horizontal, espacio vertical

        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreTextField = new JTextField(20);

        JLabel direccionLabel = new JLabel("Dirección:");
        JTextField direccionTextField = new JTextField(20);

        JLabel telefonoLabel = new JLabel("Teléfono:");
        JTextField telefonoTextField = new JTextField(20);

        JLabel correoLabel = new JLabel("Correo:");
        JTextField correoTextField = new JTextField(20);

        JLabel rutLabel = new JLabel("RUT:");
        JTextField rutTextField = new JTextField(20);

        JButton guardarButton = new JButton("Guardar");
        JButton cancelarButton = new JButton("Cancelar");

        panel.add(nombreLabel);
        panel.add(nombreTextField);
        panel.add(direccionLabel);
        panel.add(direccionTextField);
        panel.add(telefonoLabel);
        panel.add(telefonoTextField);
        panel.add(correoLabel);
        panel.add(correoTextField);
        panel.add(rutLabel);
        panel.add(rutTextField);

        frame.add(panel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(guardarButton);
        buttonPanel.add(cancelarButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}
