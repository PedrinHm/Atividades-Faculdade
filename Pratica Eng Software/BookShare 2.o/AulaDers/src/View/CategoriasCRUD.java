package View;

import Controller.Controle;
import Model.CategoriaBEAN;
import Model.CategoriaDAO;
import Model.EditoraBEAN;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CategoriasCRUD extends javax.swing.JFrame {

    public CategoriasCRUD() {
        initComponents();
       getContentPane().setBackground(new java.awt.Color(245,245,245)); 
        List<CategoriaBEAN> listaCategoria = Controle.getListaCategoria();
        listarCategorias(listaCategoria);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Editar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idCategoria = new javax.swing.JTextField();
        descricao = new javax.swing.JTextField();
        excluir = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCategoria = new javax.swing.JTable();
        pesquisa = new javax.swing.JTextField();
        Criar = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        inativa = new javax.swing.JCheckBox();
        editoraTxt = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Editar.setBackground(new java.awt.Color(255, 255, 255));
        Editar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel3.setText("Status");

        idCategoria.setEnabled(false);
        idCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCategoriaActionPerformed(evt);
            }
        });

        descricao.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });

        excluir.setBackground(new java.awt.Color(255, 255, 255));
        excluir.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        pesquisar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        tabelaCategoria.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        tabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Status"
            }
        ));
        tabelaCategoria.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCategoriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCategoria);

        pesquisa.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        Criar.setBackground(new java.awt.Color(255, 255, 255));
        Criar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Criar.setText("Criar");
        Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ativa", "inativa" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        inativa.setBackground(new java.awt.Color(245, 245, 245));
        inativa.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        inativa.setText("Inativas");
        inativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inativaActionPerformed(evt);
            }
        });

        editoraTxt.setBackground(new java.awt.Color(255, 255, 255));
        editoraTxt.setFont(new java.awt.Font("Vladimir Script", 1, 30)); // NOI18N
        editoraTxt.setText("Categorias");

        voltar.setBackground(new java.awt.Color(255, 255, 255));
        voltar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(descricao)
                            .addComponent(idCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editoraTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(Criar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Editar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(excluir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(voltar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(editoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criar)
                    .addComponent(Editar)
                    .addComponent(excluir))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisar)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltar)
                    .addComponent(inativa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCategoriaActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        CategoriaBEAN categoria;
        CategoriaDAO dao = new CategoriaDAO();
        
        int index = tabelaCategoria.getSelectedRow();

            String id = tabelaCategoria.getValueAt(index, 0).toString();
            int idInt = Integer.parseInt(id);
            
            categoria = dao.findCategoria(idInt);
            
            dao.deleteCategoria(categoria);
            List<CategoriaBEAN> listaCategoria = Controle.getListaCategoria();
            listarCategorias(listaCategoria);
        
    }//GEN-LAST:event_excluirActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarActionPerformed
        CategoriaBEAN categoria;
        CategoriaDAO dao = new CategoriaDAO();

        categoria = new CategoriaBEAN(0, descricao.getText(), status.getSelectedItem().toString());
        dao.createCategoria(categoria);
        
        List<CategoriaBEAN> listaCategoria = Controle.getListaCategoria();
        listarCategorias(listaCategoria);
    }//GEN-LAST:event_CriarActionPerformed
     public void listarCategorias(List<CategoriaBEAN> listaCategoria) {
         DefaultTableModel modelo = (DefaultTableModel) tabelaCategoria.getModel();
            tabelaCategoria.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaCategoria.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaCategoria.getColumnModel().getColumn(2).setPreferredWidth(80);
            modelo.setNumRows(0);
            try {
            for (CategoriaBEAN categoria : listaCategoria) {
                modelo.addRow(new Object[]{categoria.getIdCategoriaLivro(), categoria.getDescricaoCategoria(), categoria.getStatusCategoria()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }
            
        }
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
       CategoriaBEAN categoria;
        CategoriaDAO dao = new CategoriaDAO();

        String idcat = "";
        idcat = idCategoria.getText().toString();
        int idcatint = Integer.parseInt(idcat); 
        categoria = new CategoriaBEAN(idcatint,descricao.getText(), status.getSelectedItem().toString());
        
        dao.updateCategoria(categoria);
 
        List<CategoriaBEAN> listaCategoria = Controle.getListaCategoria();
        listarCategorias(listaCategoria);
    }//GEN-LAST:event_EditarActionPerformed

    private void tabelaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCategoriaMouseClicked
        int index = tabelaCategoria.getSelectedRow();
        
        idCategoria.setText(tabelaCategoria.getValueAt(index, 0).toString());
        descricao.setText(tabelaCategoria.getValueAt(index, 1).toString());
        String statusCategoria = tabelaCategoria.getValueAt(index, 2).toString();
        if ("ativa".equals(statusCategoria)) {
            status.setSelectedIndex(0);
        } else {
            status.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tabelaCategoriaMouseClicked

    private void inativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inativaActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        List<CategoriaBEAN> listaCategorias = Controle.pesquisarCategoria(pesquisa.getText(), inativa.isSelected());
        listarCategorias(listaCategorias);
    }//GEN-LAST:event_pesquisarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
       new InicialCRUD().setVisible(true);
       this.dispose();    
    }//GEN-LAST:event_voltarActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriasCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Criar;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel editoraTxt;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField idCategoria;
    private javax.swing.JCheckBox inativa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabelaCategoria;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
