package View;

import Controller.Controle;
import Model.AmigosBEAN;
import Model.AmigosDAO;
import Model.AutoresBEAN;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AmigosCRUD extends javax.swing.JFrame {

    public AmigosCRUD() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(245,245,245)); 
        List<AmigosBEAN> listaAmigos = Controle.getListaAmigos();
        listarAmigos(listaAmigos);
    }
    
    public void listarAmigos(List<AmigosBEAN> listaAmigos) {
         DefaultTableModel modelo = (DefaultTableModel) tabelaAmigos.getModel();
            tabelaAmigos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaAmigos.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaAmigos.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabelaAmigos.getColumnModel().getColumn(3).setPreferredWidth(80);
            modelo.setNumRows(0);
            try {
            for (AmigosBEAN amigos : listaAmigos) {
                modelo.addRow(new Object[]{amigos.getIdAmigos(), amigos.getNome(), amigos.getContato(), amigos.getStatus()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AutoresTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idAmigos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAmigos = new javax.swing.JTable();
        Criar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        pesquisa = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        inativa = new javax.swing.JCheckBox();
        sair = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AutoresTxt.setBackground(new java.awt.Color(0, 0, 0));
        AutoresTxt.setFont(new java.awt.Font("Vladimir Script", 1, 30)); // NOI18N
        AutoresTxt.setText("Amigos");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel1.setText("Id");

        idAmigos.setEnabled(false);
        idAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAmigosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel2.setText("Nome");

        nome.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel4.setText("Contato");

        contato.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel3.setText("Status");

        status.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ativa", "inativa" }));

        tabelaAmigos.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        tabelaAmigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Contato", "Status"
            }
        ));
        tabelaAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAmigosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaAmigos);

        Criar.setBackground(new java.awt.Color(245, 245, 245));
        Criar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Criar.setText("Criar");
        Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarActionPerformed(evt);
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

        excluir.setBackground(new java.awt.Color(245, 245, 245));
        excluir.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        pesquisa.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
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

        inativa.setBackground(new java.awt.Color(245, 245, 245));
        inativa.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        inativa.setText("Inativas");
        inativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inativaActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        voltar.setBackground(new java.awt.Color(245, 245, 245));
        voltar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(236, 236, 236)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Criar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(idAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(560, 560, 560)))
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inativa)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesquisar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(AutoresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contato, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AutoresTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criar)
                    .addComponent(Editar)
                    .addComponent(excluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inativa)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sair)
                    .addComponent(voltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAmigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAmigosActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void tabelaAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAmigosMouseClicked
        int index = tabelaAmigos.getSelectedRow();

        idAmigos.setText(tabelaAmigos.getValueAt(index, 0).toString());
        nome.setText(tabelaAmigos.getValueAt(index, 1).toString());
        contato.setText(tabelaAmigos.getValueAt(index, 2).toString());
        String statusAutores = tabelaAmigos.getValueAt(index, 3).toString();
        if ("ativa".equals(statusAutores)) {
            status.setSelectedIndex(0);
        } else {
            status.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tabelaAmigosMouseClicked

    private void CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarActionPerformed
        AmigosBEAN amigos;
        AmigosDAO dao = new AmigosDAO();

        amigos = new AmigosBEAN(0, nome.getText(), contato.getText(), status.getSelectedItem().toString());
        dao.createAmigos(amigos);

        List<AmigosBEAN> listaAmigos = Controle.getListaAmigos();
        listarAmigos(listaAmigos);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Criado com sucesso!");
    }//GEN-LAST:event_CriarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        AmigosBEAN amigos;
        AmigosDAO dao = new AmigosDAO();

        String idamigo = "";
        idamigo = idAmigos.getText().toString();
        int idamigoint = Integer.parseInt(idamigo);
        amigos = new AmigosBEAN(idamigoint, nome.getText(), contato.getText(), status.getSelectedItem().toString());

        dao.updateAmigos(amigos);

        List<AmigosBEAN> listaAmigos = Controle.getListaAmigos();
        listarAmigos(listaAmigos);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Editado com sucesso!");
    }//GEN-LAST:event_EditarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        AmigosBEAN amigos;
        AmigosDAO dao = new AmigosDAO();

        int index = tabelaAmigos.getSelectedRow();

        String id = tabelaAmigos.getValueAt(index, 0).toString();
        int idInt = Integer.parseInt(id);

        amigos = dao.findAmigos(idInt);

        dao.deleteAmigos(amigos);
        List<AmigosBEAN> listaAmigos = Controle.getListaAmigos();
        listarAmigos(listaAmigos);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Excluido com sucesso!");
    }//GEN-LAST:event_excluirActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        List<AmigosBEAN> listaAmigos = Controle.pesquisarAmigos(pesquisa.getText(), inativa.isSelected());
        listarAmigos(listaAmigos);
    }//GEN-LAST:event_pesquisarActionPerformed

    private void inativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inativaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new InicialCRUD().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmigosCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutoresTxt;
    private javax.swing.JButton Criar;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField contato;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField idAmigos;
    private javax.swing.JCheckBox inativa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabelaAmigos;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
