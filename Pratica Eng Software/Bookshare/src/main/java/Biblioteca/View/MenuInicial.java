import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicial extends JFrame {
    public MenuInicial() {
        setTitle("Menu Inicial");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Criar um BoxLayout com eixo X (horizontal)
        BoxLayout boxLayout = new BoxLayout(menuBar, BoxLayout.X_AXIS);
        menuBar.setLayout(boxLayout);

        // Adicionar um Box.Filler à esquerda para alinhar ao centro
        menuBar.add(Box.createHorizontalGlue());

        JButton livrosButton = new JButton("Livros");
        JButton amigosButton = new JButton("Amigos");
        JButton editoraButton = new JButton("Editora");
        JButton emprestimoButton = new JButton("Empréstimo");
        JButton usuarioButton = new JButton("Usuário");
        JButton autorButton = new JButton("Autor"); // Botão para a tela Autor

        livrosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Oculta a tela inicial
                new TelaLivros().setVisible(true);
            }
        });

        amigosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Oculta a tela inicial
                new TelaAmigos().setVisible(true);
            }
        });

        editoraButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Oculta a tela inicial
                new TelaEditora().setVisible(true);
            }
        });

        emprestimoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Oculta a tela inicial
                new TelaEmprestimo().setVisible(true);
            }
        });

        usuarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Oculta a tela inicial
                new TelaUsuario().setVisible(true);
            }
        });

        autorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false); // Oculta a tela inicial
                new TelaAutor().setVisible(true); // Abre a tela do Autor
            }
        });

        menuBar.add(livrosButton);
        menuBar.add(amigosButton);
        menuBar.add(editoraButton);
        menuBar.add(emprestimoButton);
        menuBar.add(usuarioButton);
        menuBar.add(autorButton); // Adiciona o botão "Autor"

        // Adicionar um Box.Filler à direita para alinhar ao centro
        menuBar.add(Box.createHorizontalGlue());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuInicial menu = new MenuInicial();
            menu.setVisible(true);
        });
    }
}
