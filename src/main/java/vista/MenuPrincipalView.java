package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class MenuPrincipalView {
        private JFrame frame;

        public MenuPrincipalView() {
            frame = new JFrame("Menú Principal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JButton agregarClienteButton = new JButton("Agregar Cliente");
            JButton agregarVehiculoButton = new JButton("Agregar Vehículo");

            agregarClienteButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AgregarClienteView clienteView = new AgregarClienteView();
                    clienteView.mostrarVentana();
                }
            });

            agregarVehiculoButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AgregarVehiculoView vehiculoView = new AgregarVehiculoView();
                    vehiculoView.mostrarVentana();
                }
            });

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            panel.add(agregarClienteButton);
            panel.add(agregarVehiculoButton);

            frame.add(panel);
            frame.setVisible(true);
        }
    }
