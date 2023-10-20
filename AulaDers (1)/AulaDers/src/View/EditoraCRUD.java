package View;

import Controller.Controle;
import Model.EditoraBEAN;
import Model.EditoraDAO;
import Model.LivrosBEAN;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditoraCRUD extends javax.swing.JFrame {

    public EditoraCRUD() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(245,245,245)); 
        List<EditoraBEAN> listaEditora = Controle.getListaEditora();
        listarEditora(listaEditora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Editar = new javax.swing.JButton();
        IdEditora = new javax.swing.JLabel();
        Criar = new javax.swing.JButton();
        NomeEditora = new javax.swing.JLabel();
        StatusEditora = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        idEditora = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        inativa = new javax.swing.JCheckBox();
        Excluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEditora = new javax.swing.JTable();
        EnderecoEditora = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        editoraTxt = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        NomeEditora.setText("Nome");

        StatusEditora.setBackground(new java.awt.Color(255, 255, 255));
        StatusEditora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        StatusEditora.setText("Status");

        status.setBackground(new java.awt.Color(245, 245, 245));
        status.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ativa", "inativa" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        idEditora.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        idEditora.setEnabled(false);
        idEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEditoraActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
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

        Excluir.setBackground(new java.awt.Color(245, 245, 245));
        Excluir.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        tabelaEditora.setBackground(new java.awt.Color(245, 245, 245));
        tabelaEditora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaEditora.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        tabelaEditora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Endereço", "Status"
            }
        ));
        tabelaEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEditoraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaEditora);

        EnderecoEditora.setBackground(new java.awt.Color(255, 255, 255));
        EnderecoEditora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        EnderecoEditora.setText("Endereco");

        endereco.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N

        editoraTxt.setBackground(new java.awt.Color(255, 255, 255));
        editoraTxt.setFont(new java.awt.Font("Vladimir Script", 1, 30)); // NOI18N
        editoraTxt.setText("Editoras");

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

        pesquisa.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StatusEditora)
                            .addComponent(NomeEditora)
                            .addComponent(IdEditora)
                            .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(idEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endereco)
                            .addComponent(EnderecoEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(voltar)
                                    .addGap(315, 315, 315))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(128, 128, 128)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Criar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Excluir))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 382, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(inativa))
                            .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdEditora)
                    .addComponent(editoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(NomeEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EnderecoEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StatusEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criar)
                    .addComponent(Editar)
                    .addComponent(Excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(inativa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(sair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void listarEditora(List<EditoraBEAN> listaEditora) {
         DefaultTableModel modelo = (DefaultTableModel) tabelaEditora.getModel();
            tabelaEditora.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaEditora.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaEditora.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabelaEditora.getColumnModel().getColumn(3).setPreferredWidth(80);
            modelo.setNumRows(0);
            try {
            for (EditoraBEAN editora : listaEditora) {
                modelo.addRow(new Object[]{editora.getIdEditora(), editora.getNome(), editora.getEndereco(), editora.getStatus()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }    
     }
    
    
    
    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        EditoraBEAN editora;
        EditoraDAO dao = new EditoraDAO();

        String idedit = "";
        idedit = idEditora.getText().toString();
        int ideditint = Integer.parseInt(idedit);
        editora = new EditoraBEAN(ideditint, nome.getText(), endereco.getText(), status.getSelectedItem().toString());

        dao.updateEditora(editora);

        List<EditoraBEAN> listaEditora = Controle.getListaEditora();
        listarEditora(listaEditora);
    }//GEN-LAST:event_EditarActionPerformed

    private void CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarActionPerformed
        EditoraBEAN editora;
        EditoraDAO dao = new EditoraDAO();

        editora = new EditoraBEAN(0, nome.getText(), endereco.getText(), status.getSelectedItem().toString());
        dao.createEditora(editora);

        List<EditoraBEAN> listaEditora = Controle.getListaEditora();
        listarEditora(listaEditora);
    }//GEN-LAST:event_CriarActionPerformed

    private void idEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEditoraActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void inativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inativaActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        EditoraBEAN editora;
        EditoraDAO dao = new EditoraDAO();

        int index = tabelaEditora.getSelectedRow();

        String id = tabelaEditora.getValueAt(index, 0).toString();
        int idInt = Integer.parseInt(id);

        editora = dao.findEditora(idInt);

        dao.deleteEditora(editora);
        List<EditoraBEAN> listaEditora = Controle.getListaEditora();
        listarEditora(listaEditora);

    }//GEN-LAST:event_ExcluirActionPerformed

    private void tabelaEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEditoraMouseClicked
        int index = tabelaEditora.getSelectedRow();

        idEditora.setText(tabelaEditora.getValueAt(index, 0).toString());
        nome.setText(tabelaEditora.getValueAt(index, 1).toString());
        endereco.setText(tabelaEditora.getValueAt(index, 2).toString());
        String statusEditora = tabelaEditora.getValueAt(index, 3).toString();
        if ("ativa".equals(statusEditora)) {
            status.setSelectedIndex(0);
        } else {
            status.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tabelaEditoraMouseClicked

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
       new InicialCRUD().setVisible(true);
       this.dispose();         
    }//GEN-LAST:event_voltarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        List<EditoraBEAN> listaEditora = Controle.pesquisarEditora(pesquisa.getText(), inativa.isSelected());
        listarEditora(listaEditora);
    }//GEN-LAST:event_pesquisarActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditoraCRUD().setVisible(true);
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
    private javax.swing.JLabel editoraTxt;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField idEditora;
    private javax.swing.JCheckBox inativa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabelaEditora;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
