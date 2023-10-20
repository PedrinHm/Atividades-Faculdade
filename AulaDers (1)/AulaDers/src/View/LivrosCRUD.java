package View;

import Controller.Controle;
import Model.AutoresBEAN;
import Model.CategoriaBEAN;
import Model.CategoriaDAO;
import Model.EditoraBEAN;
import Model.EditoraDAO;
import Model.LivrosBEAN;
import Model.LivrosDAO;
import Model.Livros_has_autoresBEAN;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LivrosCRUD extends javax.swing.JFrame {
    
    static Controle controle = new Controle();
        
    public LivrosCRUD() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(245,245,245)); 
        
        List<AutoresBEAN> listaAutores = Controle.getListaAutores();
        listarAutores(listaAutores);
        
        List<LivrosBEAN> listaLivros = Controle.getListaLivros();
        listarLivros(listaLivros);
        
        List<CategoriaBEAN> listaCategoria = new ArrayList<>();
        CategoriaDAO cdao = new CategoriaDAO();
        listaCategoria = cdao.getAllCategorias();
        for (CategoriaBEAN c : listaCategoria) {
            comboboxCategoria.addItem(c);
        }
        
        List<EditoraBEAN> listaEditora = new ArrayList<>();
        EditoraDAO edao = new EditoraDAO();
        listaEditora = edao.getAllEditora();
        for (EditoraBEAN e : listaEditora) {
            comboboxEditora.addItem(e);
        }
        
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inativa = new javax.swing.JCheckBox();
        Excluir = new javax.swing.JButton();
        EnderecoEditora = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        editoraTxt = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        IdEditora = new javax.swing.JLabel();
        Criar = new javax.swing.JButton();
        NomeEditora = new javax.swing.JLabel();
        StatusEditora = new javax.swing.JLabel();
        statuslivros = new javax.swing.JComboBox<>();
        idlivros = new javax.swing.JTextField();
        pesquisa = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        editora = new javax.swing.JLabel();
        comboboxEditora = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAutores = new javax.swing.JTable();
        categoria = new javax.swing.JLabel();
        comboboxCategoria = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inativa.setBackground(new java.awt.Color(245, 245, 245));
        inativa.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        inativa.setText("Inativas");
        inativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inativaActionPerformed(evt);
            }
        });

        Excluir.setBackground(new java.awt.Color(245, 245, 245));
        Excluir.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        EnderecoEditora.setBackground(new java.awt.Color(255, 255, 255));
        EnderecoEditora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        EnderecoEditora.setText("ISBN");

        isbn.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnActionPerformed(evt);
            }
        });

        editoraTxt.setBackground(new java.awt.Color(255, 255, 255));
        editoraTxt.setFont(new java.awt.Font("Vladimir Script", 1, 30)); // NOI18N
        editoraTxt.setText("Livros");

        voltar.setBackground(new java.awt.Color(245, 245, 245));
        voltar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        pesquisar.setBackground(new java.awt.Color(245, 245, 245));
        pesquisar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        Editar.setBackground(new java.awt.Color(245, 245, 245));
        Editar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        IdEditora.setBackground(new java.awt.Color(255, 255, 255));
        IdEditora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        IdEditora.setText("Id");

        Criar.setBackground(new java.awt.Color(245, 245, 245));
        Criar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Criar.setText("Criar");
        Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarActionPerformed(evt);
            }
        });

        NomeEditora.setBackground(new java.awt.Color(255, 255, 255));
        NomeEditora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        NomeEditora.setText("Titulo");

        StatusEditora.setBackground(new java.awt.Color(255, 255, 255));
        StatusEditora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        StatusEditora.setText("Status");

        statuslivros.setBackground(new java.awt.Color(245, 245, 245));
        statuslivros.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        statuslivros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ativa", "inativa" }));
        statuslivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statuslivrosActionPerformed(evt);
            }
        });

        idlivros.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        idlivros.setEnabled(false);
        idlivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idlivrosActionPerformed(evt);
            }
        });

        pesquisa.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        editora.setBackground(new java.awt.Color(255, 255, 255));
        editora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        editora.setText("Editora");

        comboboxEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboboxEditoraMouseClicked(evt);
            }
        });
        comboboxEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxEditoraActionPerformed(evt);
            }
        });

        tabelaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Autores", "Selecione"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaAutores);
        if (tabelaAutores.getColumnModel().getColumnCount() > 0) {
            tabelaAutores.getColumnModel().getColumn(0).setResizable(false);
            tabelaAutores.getColumnModel().getColumn(1).setResizable(false);
            tabelaAutores.getColumnModel().getColumn(2).setResizable(false);
        }

        categoria.setBackground(new java.awt.Color(255, 255, 255));
        categoria.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        categoria.setText("Categoria");

        comboboxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCategoriaActionPerformed(evt);
            }
        });

        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "ISBN", "Status", "Categorias", "Editoras", "Autores"
            }
        ));
        tabelaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLivrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaLivros);

        sair.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(voltar)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(pesquisa))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                            .addComponent(inativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editora)
                                    .addComponent(comboboxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StatusEditora)
                                    .addComponent(statuslivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(titulo)
                                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EnderecoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(IdEditora)
                                                .addComponent(idlivros, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(NomeEditora))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoria)
                                    .addComponent(comboboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Criar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Editar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Excluir))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(IdEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idlivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnderecoEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statuslivros, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criar)
                    .addComponent(Editar)
                    .addComponent(Excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(voltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pesquisar)
                        .addGap(5, 5, 5)
                        .addComponent(inativa)))
                .addGap(16, 16, 16)
                .addComponent(sair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void listarAutores(List<AutoresBEAN> listaAutores) {
         DefaultTableModel modelo = (DefaultTableModel) tabelaAutores.getModel();
            tabelaAutores.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaAutores.getColumnModel().getColumn(1).setPreferredWidth(80);
            
            modelo.setNumRows(0);
            try {
            for (AutoresBEAN autores : listaAutores) {
                modelo.addRow(new Object[]{autores.getIdAutores(), autores.getNome(), false});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }   
    }
     
     public void listarLivros(List<LivrosBEAN> listaLivros) {
         DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
            tabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaLivros.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaLivros.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelaLivros.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaLivros.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabelaLivros.getColumnModel().getColumn(5).setPreferredWidth(80);
            tabelaLivros.getColumnModel().getColumn(6).setPreferredWidth(150);
            modelo.setNumRows(0);
            try {
            for (LivrosBEAN livros : listaLivros) {
                EditoraBEAN edit = controle.findEditora(livros.getLivros_idEditora());
                CategoriaBEAN cat = controle.findCategoria(livros.getLivros_idCategoria());
                
                String livros_nomeAutores = "";

                List<Livros_has_autoresBEAN> listaAutoresSelecionados = controle.findAutores(livros.getId());
                   
                for (Livros_has_autoresBEAN autorSelecionado : listaAutoresSelecionados) {
                    livros_nomeAutores = livros_nomeAutores + controle.findAutoresNome(autorSelecionado.getIdAutores()).getNome()+ ", ";
                }
                
                modelo.addRow(new Object[]{livros.getId(), livros.getTitulo(), livros.getIsbn(), livros.getStatus(), cat.getDescricaoCategoria() , edit.getNome() , livros_nomeAutores.substring(0,livros_nomeAutores.length())});
            
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }    
    }
  
    private void inativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inativaActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        LivrosBEAN livros;
        LivrosDAO dao = new LivrosDAO();

        int index = tabelaLivros.getSelectedRow();

        String id = tabelaLivros.getValueAt(index, 0).toString();
        int idInt = Integer.parseInt(id);

        livros = dao.findLivros(idInt);

        dao.deleteLivros(livros);
        List<LivrosBEAN> listaLivros = Controle.getListaLivros();
        listarLivros(listaLivros);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Livro inativado com sucesso!");
    }//GEN-LAST:event_ExcluirActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new InicialCRUD().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        List<LivrosBEAN> listaLivros = Controle.pesquisarLivros(pesquisa.getText(), inativa.isSelected());
        listarLivros(listaLivros);
    }//GEN-LAST:event_pesquisarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        LivrosBEAN livros;
        LivrosDAO dao = new LivrosDAO();

        EditoraBEAN edit = comboboxEditora.getItemAt(comboboxEditora.getSelectedIndex());
        CategoriaBEAN cat = comboboxCategoria.getItemAt(comboboxCategoria.getSelectedIndex());
        
        String id = "";
        id = idlivros.getText().toString();
        int idint = Integer.parseInt(id);
        livros = new LivrosBEAN(idint, cat.getIdCategoriaLivro(), edit.getIdEditora(), titulo.getText(), isbn.getText(), statuslivros.getSelectedItem().toString());
       
        ArrayList<Integer> contaAutores = new ArrayList<Integer>();
        
        for(int i=0;i<tabelaAutores.getRowCount();i++){
            if("true".equals(tabelaAutores.getValueAt(i, 2).toString())){
                int idAutores = Integer.parseInt(tabelaAutores.getValueAt(i, 0).toString());
                contaAutores.add(idAutores);
            }
        }
        try {
            dao.updateLivros(livros, contaAutores);
        } catch (SQLException ex) {
            Logger.getLogger(LivrosCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Livro editado com sucesso!");
    }//GEN-LAST:event_EditarActionPerformed

        
    private void CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarActionPerformed
        LivrosBEAN livros;
        LivrosDAO dao = new LivrosDAO();

        EditoraBEAN edit = comboboxEditora.getItemAt(comboboxEditora.getSelectedIndex());
        CategoriaBEAN cat = comboboxCategoria.getItemAt(comboboxCategoria.getSelectedIndex());
        
        livros = new LivrosBEAN(0, cat.getIdCategoriaLivro(), edit.getIdEditora(), titulo.getText(), isbn.getText(), statuslivros.getSelectedItem().toString());
        ArrayList<Integer> contaAutores = new ArrayList<Integer>();

        for(int i=0;i<tabelaAutores.getRowCount();i++){
            if("true".equals(tabelaAutores.getValueAt(i, 2).toString())){
                int cont = Integer.parseInt(tabelaAutores.getValueAt(i, 0).toString());
                contaAutores.add(cont);
            }
        }
        try {
            dao.createLivros(livros, contaAutores);
        } catch (SQLException ex) {
            Logger.getLogger(LivrosCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Livro criado com sucesso!");
    }//GEN-LAST:event_CriarActionPerformed

    private void idlivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idlivrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idlivrosActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void comboboxEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxEditoraActionPerformed
        
    }//GEN-LAST:event_comboboxEditoraActionPerformed

    private void statuslivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statuslivrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statuslivrosActionPerformed

    private void comboboxEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxEditoraMouseClicked
      
    }//GEN-LAST:event_comboboxEditoraMouseClicked

    private void comboboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCategoriaActionPerformed
       
    }//GEN-LAST:event_comboboxCategoriaActionPerformed

    private void tabelaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaLivrosMouseClicked
        int index = tabelaLivros.getSelectedRow();

        idlivros.setText(tabelaLivros.getValueAt(index, 0).toString());
        titulo.setText(tabelaLivros.getValueAt(index, 1).toString());
        isbn.setText(tabelaLivros.getValueAt(index, 2).toString());
        String st = tabelaLivros.getValueAt(index, 3).toString();
        if ("ativa".equals(st)) {
            statuslivros.setSelectedIndex(0);
        } else {
            statuslivros.setSelectedIndex(1);
        }
        
        
    }//GEN-LAST:event_tabelaLivrosMouseClicked

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivrosCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Criar;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel EnderecoEditora;
    private javax.swing.JButton Excluir;
    private javax.swing.JLabel IdEditora;
    private javax.swing.JLabel NomeEditora;
    private javax.swing.JLabel StatusEditora;
    private javax.swing.JLabel categoria;
    private javax.swing.JComboBox<CategoriaBEAN> comboboxCategoria;
    private javax.swing.JComboBox<EditoraBEAN> comboboxEditora;
    private javax.swing.JLabel editora;
    private javax.swing.JLabel editoraTxt;
    private javax.swing.JTextField idlivros;
    private javax.swing.JCheckBox inativa;
    private javax.swing.JTextField isbn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> statuslivros;
    private javax.swing.JTable tabelaAutores;
    private javax.swing.JTable tabelaLivros;
    private javax.swing.JTextField titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
