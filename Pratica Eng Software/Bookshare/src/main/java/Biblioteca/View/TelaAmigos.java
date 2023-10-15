import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class TelaAmigos extends JFrame {
    private DefaultTableModel modelo;
    private JTable tabela;

    public TelaAmigos() {
        setTitle("Tela de Amigos");
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
                // Feche a tela atual de "Amigos"
                dispose();

                // Exiba a tela inicial (você precisa criar a tela inicial e chamá-la aqui)
                MenuInicial menuInicial = new MenuInicial();
                menuInicial.setVisible(true);
            }
        });

        painel.add(toolbar, BorderLayout.NORTH);

        // Tabela de Amigos com checkbox
        Vector<String> colunas = new Vector<>();
        colunas.add(""); // Coluna para o checkbox
        colunas.add("Nome");
        colunas.add("Telefone");
        colunas.add("Documento");
        colunas.add("Limite");
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
        List<Amigo> amigos = buscarAmigosNoBanco();

        // Limpa os dados da tabela
        modelo.setRowCount(0);

        // Adiciona os dados dos amigos à tabela
        for (Amigo amigo : amigos) {
            Vector<Object> rowData = new Vector<>();
            rowData.add(false); // Inicialmente não selecionado
            rowData.add(amigo.getNome());
            rowData.add(amigo.getTelefone());
            rowData.add(amigo.getDocumento());
            rowData.add(amigo.getLimite());
            rowData.add(amigo.getStatus());
            modelo.addRow(rowData);
        }
    }

    // Método fictício para buscar amigos no banco (substitua com a lógica real)
    private List<Amigo> buscarAmigosNoBanco() {
        // Simulação de busca no banco
        List<Amigo> amigos = new Vector<>();
        amigos.add(new Amigo("Amigo 1", "123-456-789", "Documento1", "100", "At
