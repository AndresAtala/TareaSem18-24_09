package controlador;
import vista.MenuPrincipalView;
import javax.swing.*;

public class MainController {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipalView menuView = new MenuPrincipalView();
            }
        });
    }
}
