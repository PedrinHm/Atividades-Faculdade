import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroEditora extends JFrame {
    private JTextField razaoSocialField;
    private JTextField enderecoField;
    private JComboBox<String> statusComboBox;

    public CadastroEditora() {
        setTitle("Cadastro de Editora");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new GridLayout(4, 2));
        getContentPane().add(painel);

        JLabel razaoSocialLabel = new JLabel("Razão Social:");
        razaoSocialField = new JTextField();

        JLabel enderecoLabel = new JLabel("Endereço:");
        enderecoField = new JTextField();

        JLabel statusLabel = new JLabel("Status:");
        String[] statusOpcoes = {"Ativa", "Inativa"};
        statusComboBox = new JComboBox<>(statusOpcoes);

        JButton cadastrarButton = new JButton("Cadastrar");

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String razaoSocial = razaoSocialField.getText();
                String endereco = enderecoField.getText();
                String status = (String) statusComboBox.getSelectedItem();

                // Aqui você pode adicionar a lógica para salvar os dados no banco de dados

                JOptionPane.showMessageDialog(null, "Editora cadastrada:\nRazão Social: " + razaoSocial + "\nEndereço: " + endereco + "\nStatus: " + status);
            }
        });

        painel.add(razaoSocialLabel);
        painel.add(razaoSocialField);
        painel.add(enderecoLabel);
        painel.add(enderecoField);
        painel.add(statusLabel);
        painel.add(statusComboBox);
        painel.add(new JLabel()); // Espaço em branco
        painel.add(cadastrarButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CadastroEditora cadastro = new CadastroEditora();
            cadastro.setVisible(true);
        });
    }
}
