import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class TelaEditora extends JFrame {
    private DefaultTableModel modelo;
    private JTable tabela;

    public TelaEditora() {
        setTitle("Tela de Editora");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());
        getContentPane().add(painel);

        JToolBar toolbar = new JToolBar();
        JButton consultarButton = new JButton("Consultar");
        JButton alterarButton = new JButton("Alterar");
        JButton cadastrarButton = new JButton("Cadastrar");
        JButton voltarButton = new JButton("Voltar");

        toolbar.add(consultarButton);
        toolbar.add(alterarButton);
        toolbar.add(cadastrarButton);
        toolbar.add(voltarButton);

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para consulta
                carregarDadosDoBanco(); // Carrega os dados do banco de dados
            }
        });

        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para alteração
            }
        });

    cadastrarButton.addActionListener(new ActionListener() {
    @Override
        public void actionPerformed(ActionEvent e) {
        // Crie a tela de cadastro de editora e passe uma referência da tela de editora atual
            CadastroEditora cadastroEditora = new CadastroEditora(this);
            cadastroEditora.setVisible(true);
            setVisible(false); // Oculta a tela atual de "Editora"
        }
    });


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Feche a tela atual de "Editora"
                dispose();

                // Exiba a tela inicial (você precisa criar a tela inicial e chamá-la aqui)
                MenuInicial menuInicial = new MenuInicial();
                menuInicial.setVisible(true);
            }
        });

        painel.add(toolbar, BorderLayout.NORTH);

        // Tabela de Editoras com checkbox
        Vector<String> colunas = new Vector<>();
        colunas.add(""); // Coluna para o checkbox
        colunas.add("Razão Social");
        colunas.add("Endereço");
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
        List<Editora> editoras = buscarEditorasNoBanco();

        // Limpa os dados da tabela
        modelo.setRowCount(0);

        // Adiciona os dados das editoras à tabela
        for (Editora editora : editoras) {
            Vector<Object> rowData = new Vector<>();
            rowData.add(false); // Inicialmente não selecionado
            rowData.add(editora.getRazaoSocial());
            rowData.add(editora.getEndereco());
            rowData.add(editora.getStatus());
            modelo.addRow(rowData);
        }
    }

    // Método fictício para buscar editoras no banco (substitua com a lógica real)
    private List<Editora> buscarEditorasNoBanco() {
        // Simulação de busca no banco
        List<Editora> editoras = new Vector<>();
        editoras.add(new Editora("Editora A", "Endereço A", "Ativa"));
        editoras.add(new Editora("Editora B", "Endereço B", "Inativa"));
        return editoras;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaEditora tela = new TelaEditora();
            tela.setVisible(true);
        });
    }
}
