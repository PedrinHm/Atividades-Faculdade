import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class TelaAutor extends JFrame {
    private DefaultTableModel modelo;
    private JTable tabela;

    public TelaAutor() {
        setTitle("Tela de Autor");
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
        // Abra a tela de cadastro de autor
                CadastroAutor cadastroAutor = new CadastroAutor();
                cadastroAutor.setVisible(true);
            }
        });


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Feche a tela atual de "Autor"
                dispose();

                // Exiba a tela inicial (você precisa criar a tela inicial e chamá-la aqui)
                MenuInicial menuInicial = new MenuInicial();
                menuInicial.setVisible(true);
            }
        });

        painel.add(toolbar, BorderLayout.NORTH);

        // Tabela de Autores com checkbox
        Vector<String> colunas = new Vector<>();
        colunas.add(""); // Coluna para o checkbox
        colunas.add("Nome");
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
        // Substitua este bloco de código pelo código real para buscar dados do banco de dados
        List<Autor> autores = buscarAutoresNoBanco();

        // Limpa os dados da tabela
        modelo.setRowCount(0);

        // Adiciona os dados dos autores à tabela
        for (Autor autor : autores) {
            Vector<Object> rowData = new Vector<>();
            rowData.add(false); // Inicialmente não selecionado
            rowData.add(autor.getNome());
            rowData.add(autor.getStatus());
            modelo.addRow(rowData);
        }
    }

    // Método fictício para buscar autores no banco (substitua com a lógica real)
    private List<Autor> buscarAutoresNoBanco() {
        // Simulação de busca no banco
        List<Autor> autores = new Vector<>();
        autores.add(new Autor("Autor 1", "Ativo"));
        autores.add(new Autor("Autor 2", "Inativo"));
        return autores;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaAutor tela = new TelaAutor();
            tela.setVisible(true);
        });
    }
}
