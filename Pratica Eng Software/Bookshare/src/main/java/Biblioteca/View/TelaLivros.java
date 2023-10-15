import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class TelaLivros extends JFrame {
    private DefaultTableModel modelo;
    private JTable tabela;

    public TelaLivros() {
        setTitle("Tela de Livros");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());
        getContentPane().add(painel);

        JToolBar toolbar = new JToolBar();
        JButton consultarButton = new JButton("Consultar");
        JButton emprestarButton = new JButton("Empréstimo");
        JButton alterarButton = new JButton("Alterar");
        JButton darBaixaButton = new JButton("Dar Baixa");
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton voltarButton = new JButton("Voltar");

        toolbar.add(consultarButton);
        toolbar.add(emprestarButton);
        toolbar.add(alterarButton);
        toolbar.add(darBaixaButton);
        toolbar.add(cadastrarButton);
        toolbar.add(voltarButton);

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para consulta
                carregarDadosDoBanco(); // Carrega os dados do banco de dados
            }
        });

        emprestarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para empréstimo
            }
        });

        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para alteração
            }
        });

        darBaixaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para dar baixa
            }
        });

       cadastrarButton.addActionListener(new ActionListener() {
       @Override
            public void actionPerformed(ActionEvent e) {
        // Lógica para abrir a tela de cadastro de Livro
                CadastroLivro cadastroLivro = new CadastroLivro();
                cadastroLivro.setVisible(true);
            }
        });


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Feche a tela atual de "Livros"
                dispose();

                // Exiba a tela inicial (você precisa criar a tela inicial e chamá-la aqui)
                MenuInicial menuInicial = new MenuInicial();
                menuInicial.setVisible(true);
            }
        });

        painel.add(toolbar, BorderLayout.NORTH);

        // Tabela de livros com checkbox
        Vector<String> colunas = new Vector<>();
        colunas.add(""); // Coluna para o checkbox
        colunas.add("Nome do Livro");
        colunas.add("Editora");
        colunas.add("Autor");
        colunas.add("Status");

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
        // Substitua este bloco de código pelo código real para buscar dados do banco
        List<Livro> livros = buscarLivrosNoBanco();

        // Limpa os dados da tabela
        modelo.setRowCount(0);

        // Adiciona os dados dos livros à tabela
        for (Livro livro : livros) {
            Vector<Object> rowData = new Vector<>();
            rowData.add(false); // Inicialmente não selecionado
            rowData.add(livro.getNome());
            rowData.add(livro.getEditora());
            rowData.add(livro.getAutor());
            rowData.add(livro.getStatus());
            modelo.addRow(rowData);
        }
    }

    // Método fictício para buscar livros no banco (substitua com a lógica real)
    private List<Livro> buscarLivrosNoBanco() {
        // Simulação de busca no banco
        List<Livro> livros = new Vector<>();
        livros.add(new Livro("Livro 1", "Editora A", "Autor 1", "Disponível"));
        livros.add(new Livro("Livro 2", "Editora B", "Autor 2", "Emprestado"));
        return livros;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaLivros tela = new TelaLivros();
            tela.setVisible(true);
        });
    }
}
