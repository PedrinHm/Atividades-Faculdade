import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Control.AutorController;

public class CadastroAutor extends JFrame {
    private JTextField IDAutorField;
    private JTextField nomeAutorField;
    private JComboBox<String> statusComboBox;

    public CadastroAutor() {
        setTitle("Cadastro de Autor");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2
        ));
        getContentPane().add(panel);

        JLabel IDAutorLabel = new JLabel("ID do Autor:");
        IDAutorField = new JTextField();
        
        JLabel nomeAutorLabel = new JLabel("Nome do Autor:");
        nomeAutorField = new JTextField();

        JLabel statusLabel = new JLabel("Status:");
        String[] statusOpcoes = {"Ativo", "Inativo"};
        statusComboBox = new JComboBox<>(statusOpcoes);

        JButton cadastrarButton = new JButton("Cadastrar");

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ID = IDAutorField.getText();
                String nomeAutor = nomeAutorField.getText();
                String status = (String) statusComboBox.getSelectedItem();

                AutorController.cadastrarAutor(IDAutorField.getText(), nomeAutorField.getText(), statusComboBox.getSelectedItem());

                JOptionPane.showMessageDialog(null, "Autor cadastrado:\nNome: " + nomeAutor + "\nStatus: " + status);
            }
        });
        
        panel.add(IDAutorLabel);
        panel.add(IDAutorField);
        panel.add(nomeAutorLabel);
        panel.add(nomeAutorField);
        panel.add(statusLabel);
        panel.add(statusComboBox);
        panel.add(new JLabel()); // Espaço em branco
        panel.add(cadastrarButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CadastroAutor cadastro = new CadastroAutor();
            cadastro.setVisible(true);
        });
    }
}
