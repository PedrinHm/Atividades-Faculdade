import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class TelaUsuario extends JFrame {
    private DefaultTableModel modelo;
    private JTable tabela;

    public TelaUsuario() {
        setTitle("Tela de Usuário");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());
        getContentPane().add(painel);

        JToolBar toolbar = new JToolBar();
        JButton consultarButton = new JButton("Consultar");
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton voltarButton = new JButton("Voltar");

        toolbar.add(consultarButton);
        toolbar.add(cadastrarButton);
        toolbar.add(voltarButton);

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para consulta
                carregarDadosDoBanco(); // Carrega os dados do banco de dados
            }
        });

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cadastro
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Feche a tela atual de "Usuário"
                dispose();

                // Exiba a tela inicial (você precisa criar a tela inicial e chamá-la aqui)
                MenuInicial menuInicial = new MenuInicial();
                menuInicial.setVisible(true);
            }
        });

        painel.add(toolbar, BorderLayout.NORTH);

        // Tabela de Usuários com checkbox
        Vector<String> colunas = new Vector<>();
        colunas.add(""); // Coluna para o checkbox
        colunas.add("Nome");
        colunas.add("ID");

        Vector<Vector<Object>> dados = new Vector<>();
        
        // Inicialmente, a tabela está vazia

        modelo = new DefaultTableModel(dados, colunas);

        tabela = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabela);
        painel.add(scrollPane, BorderLayout.CENTER);
    }

    // Método para carregar os dados do banco (exemplo com dados fictícios)
    private void carregarDadosDoBanco() {
        // Substitua este bloco de código pelo código real para buscar dados do banco de dados
        List<Usuario> usuarios = buscarUsuariosNoBanco();

        // Limpa os dados da tabela
        modelo.setRowCount(0);

        // Adiciona os dados dos usuários à tabela
        for (Usuario usuario : usuarios) {
            Vector<Object> rowData = new Vector<>();
            rowData.add(false); // Inicialmente não selecionado
            rowData.add(usuario.getNome());
            rowData.add(usuario.getID());
            modelo.addRow(rowData);
        }
    }

    // Método fictício para buscar usuários no banco (substitua com a lógica real)
    private List<Usuario> buscarUsuariosNoBanco() {
        // Simulação de busca no banco
        List<Usuario> usuarios = new Vector<>();
        usuarios.add(new Usuario("Usuário 1", 1));
        usuarios.add(new Usuario("Usuário 2", 2));
        return usuarios;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaUsuario tela = new TelaUsuario();
            tela.setVisible(true);
        });
    }
}
