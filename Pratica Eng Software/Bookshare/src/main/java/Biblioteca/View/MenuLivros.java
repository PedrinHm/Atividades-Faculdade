import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MenuLivros extends JFrame {
    public MenuLivros() {
        setTitle("Menu de Livros");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Resto do código permanece o mesmo
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuLivros menu = new MenuLivros();
            menu.setVisible(true);
        });
    }
}
