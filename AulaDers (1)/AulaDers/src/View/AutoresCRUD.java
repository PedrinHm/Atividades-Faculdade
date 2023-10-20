package View;

import Controller.Controle;
import Model.AutoresBEAN;
import Model.AutoresDAO;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AutoresCRUD extends javax.swing.JFrame {

    public AutoresCRUD() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(245,245,245)); 
        List<AutoresBEAN> listaAutores = Controle.getListaAutores();
        listarAutores(listaAutores);
        
        idAutores.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Editar = new javax.swing.JButton();
        Criar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        idAutores = new javax.swing.JTextField();
        AutoresTxt = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        inativa = new javax.swing.JCheckBox();
        excluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAutores = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        contato = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();
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

        Criar.setBackground(new java.awt.Color(245, 245, 245));
        Criar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Criar.setText("Criar");
        Criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel3.setText("Status");

        status.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ativa", "inativa" }));

        idAutores.setEnabled(false);
        idAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAutoresActionPerformed(evt);
            }
        });

        AutoresTxt.setBackground(new java.awt.Color(0, 0, 0));
        AutoresTxt.setFont(new java.awt.Font("Vladimir Script", 1, 30)); // NOI18N
        AutoresTxt.setText("Autores");

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

        excluir.setBackground(new java.awt.Color(245, 245, 245));
        excluir.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        tabelaAutores.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        tabelaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Contato"
            }
        ));
        tabelaAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAutoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaAutores);

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jLabel4.setText("Contato");

        contato.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N

        voltar.setBackground(new java.awt.Color(245, 245, 245));
        voltar.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        pesquisa.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });
        pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesquisaKeyTyped(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addComponent(Criar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Editar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(inativa)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(contato, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(AutoresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AutoresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criar)
                    .addComponent(Editar)
                    .addComponent(excluir)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sair)
                    .addComponent(voltar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        AutoresBEAN autores;
        AutoresDAO dao = new AutoresDAO();

        String idaut = "";
        idaut = idAutores.getText().toString();
        int idautint = Integer.parseInt(idaut);
        autores = new AutoresBEAN(idautint, nome.getText(), contato.getText(), status.getSelectedItem().toString());

        dao.updateAutores(autores);

        List<AutoresBEAN> listaAutores = Controle.getListaAutores();
        listarAutores(listaAutores);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Alterado com sucesso!");
    }//GEN-LAST:event_EditarActionPerformed

    private void CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarActionPerformed
        AutoresBEAN autores;
        AutoresDAO dao = new AutoresDAO();

        autores = new AutoresBEAN(0, nome.getText(), contato.getText(), "Ativo");
        dao.createAutores(autores);

        List<AutoresBEAN> listaAutores = Controle.getListaAutores();
        listarAutores(listaAutores);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Criado com sucesso!");
    }//GEN-LAST:event_CriarActionPerformed

    private void idAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAutoresActionPerformed
       
    }//GEN-LAST:event_idAutoresActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void inativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativaActionPerformed
      List<AutoresBEAN> listaAutores = Controle.pesquisarAutores(pesquisa.getText(), inativa.isSelected());
     listarAutores(listaAutores);
    }//GEN-LAST:event_inativaActionPerformed
     public void listarAutores(List<AutoresBEAN> listaAutores) {
         DefaultTableModel modelo = (DefaultTableModel) tabelaAutores.getModel();

            
            tabelaAutores.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaAutores.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabelaAutores.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaAutores.getColumnModel().getColumn(0).setMaxWidth(0);
            modelo.setNumRows(0);
            try {
            for (AutoresBEAN autores : listaAutores) {
                modelo.addRow(new Object[]{autores.getIdAutores(), autores.getNome(), autores.getContato()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }   
        }
    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        AutoresBEAN autores;
        AutoresDAO dao = new AutoresDAO();

        int index = tabelaAutores.getSelectedRow();

        String id = tabelaAutores.getValueAt(index, 0).toString();
        int idInt = Integer.parseInt(id);
        
        autores = dao.findAutores(idInt);

        dao.deleteAutores(autores);
        List<AutoresBEAN> listaAutores = Controle.getListaAutores();
        listarAutores(listaAutores);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Inativado com sucesso!");
    }//GEN-LAST:event_excluirActionPerformed

    private void tabelaAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAutoresMouseClicked
        int index = tabelaAutores.getSelectedRow();

        idAutores.setText(tabelaAutores.getValueAt(index, 0).toString());
        nome.setText(tabelaAutores.getValueAt(index, 1).toString());
        contato.setText(tabelaAutores.getValueAt(index, 2).toString());
        
    }//GEN-LAST:event_tabelaAutoresMouseClicked

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
       new InicialCRUD().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void pesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaKeyTyped
     List<AutoresBEAN> listaAutores = Controle.pesquisarAutores(pesquisa.getText(), inativa.isSelected());
     listarAutores(listaAutores);
    }//GEN-LAST:event_pesquisaKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoresCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutoresTxt;
    private javax.swing.JButton Criar;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField contato;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField idAutores;
    private javax.swing.JCheckBox inativa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabelaAutores;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
