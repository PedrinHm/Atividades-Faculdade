import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class TelaEmprestimo extends JFrame {
    private DefaultTableModel modelo;
    private JTable tabela;

    public TelaEmprestimo() {
        setTitle("Tela de Empréstimo");
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
                // Feche a tela atual de "Empréstimo"
                dispose();

                // Exiba a tela inicial (você precisa criar a tela inicial e chamá-la aqui)
                MenuInicial menuInicial = new MenuInicial();
                menuInicial.setVisible(true);
            }
        });

        painel.add(toolbar, BorderLayout.NORTH);

        // Tabela de Empréstimos com checkbox
        Vector<String> colunas = new Vector<>();
        colunas.add(""); // Coluna para o checkbox
        colunas.add("Data");
        colunas.add("Livros");
        colunas.add("Amigo");

        Vector<Vector<Object>> dados = new Vector<>();

        // Inicialmente, a tabela está vazia

        modelo = new DefaultTableModel(dados, colunas) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) {
                    return Boolean.class; // Define a primeira coluna como checkbox
                } else {
                    return super.getColumnClass(columnIndex);
                }
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0; // Tornar apenas a coluna de checkboxes editável
            }
        };

        tabela = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabela);
        painel.add(scrollPane, BorderLayout.CENTER);
    }

    // Método para carregar os dados do banco (exemplo com dados fictícios)
    private void carregarDadosDoBanco() {
        // Substitua este bloco de código pelo código real para buscar dados do banco de dados
        List<Emprestimo> emprestimos = buscarEmprestimosNoBanco();

        // Limpa os dados da tabela
        modelo.setRowCount(0);

        // Adiciona os dados dos empréstimos à tabela
        for (Emprestimo emprestimo : emprestimos) {
            Vector<Object> rowData = new Vector<>();
            rowData.add(false); // Inicialmente não selecionado
            rowData.add(emprestimo.getData());
            rowData.add(emprestimo.getLivros());
            rowData.add(emprestimo.getAmigo());
            modelo.addRow(rowData);
        }
    }

    // Método fictício para buscar empréstimos no banco (substitua com a lógica real)
    private List<Emprestimo> buscarEmprestimosNoBanco() {
        // Simulação de busca no banco
        List<Emprestimo> emprestimos = new Vector<>();
        emprestimos.add(new Emprestimo("2023-10-15", "Livro 1, Livro 2", "Amigo 1"));
        emprestimos.add(new Emprestimo("2023-10-16", "Livro 3", "Amigo 2"));
        return emprestimos;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaEmprestimo tela = new TelaEmprestimo();
            tela.setVisible(true);
        });
    }
}
