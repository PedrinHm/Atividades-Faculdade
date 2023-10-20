package View;

import Controller.Controle;
import Model.AmigosBEAN;
import Model.AmigosDAO;
import java.sql.SQLException;
import Model.EmprestimosBEAN;
import Model.EmprestimosDAO;
import Model.LivrosBEAN;
import Model.LivrosDAO;
import Model.Emprestimos_has_livrosBEAN;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmprestimosCRUD extends javax.swing.JFrame {

    static Controle controle = new Controle();
    
    public EmprestimosCRUD() {
        initComponents();
        
        List<LivrosBEAN> listaLivros = Controle.getListaLivros();
        listarLivros(listaLivros);
        
        List<AmigosBEAN> listaAmigos = new ArrayList<>();
        AmigosDAO adao = new AmigosDAO();
        listaAmigos = adao.getAllAmigos();
        for (AmigosBEAN a : listaAmigos) {
            comboboxAmigos.addItem(a);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inativa = new javax.swing.JCheckBox();
        StatusEditora = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEmprestimos = new javax.swing.JTable();
        Excluir = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        idEmprestimos = new javax.swing.JTextField();
        pesquisa = new javax.swing.JTextField();
        editoraTxt = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        IdEditora = new javax.swing.JLabel();
        Criar = new javax.swing.JButton();
        categoria = new javax.swing.JLabel();
        NomeEditora = new javax.swing.JLabel();
        comboboxAmigos = new javax.swing.JComboBox<>();
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

        StatusEditora.setBackground(new java.awt.Color(255, 255, 255));
        StatusEditora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        StatusEditora.setText("Status");

        tabelaEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data", "Status", "Amigos", "Livros"
            }
        ));
        tabelaEmprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEmprestimosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaEmprestimos);

        Excluir.setBackground(new java.awt.Color(245, 245, 245));
        Excluir.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        status.setBackground(new java.awt.Color(245, 245, 245));
        status.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ativa", "inativa" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        idEmprestimos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        idEmprestimos.setEnabled(false);
        idEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEmprestimosActionPerformed(evt);
            }
        });

        pesquisa.setFont(new java.awt.Font("Arial Narrow", 2, 12)); // NOI18N
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        editoraTxt.setBackground(new java.awt.Color(255, 255, 255));
        editoraTxt.setFont(new java.awt.Font("Vladimir Script", 1, 30)); // NOI18N
        editoraTxt.setText("Emprestimos");

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

        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Livros", "Selecione"
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
        jScrollPane1.setViewportView(tabelaLivros);

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

        categoria.setBackground(new java.awt.Color(255, 255, 255));
        categoria.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        categoria.setText("Amigos");

        NomeEditora.setBackground(new java.awt.Color(255, 255, 255));
        NomeEditora.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        NomeEditora.setText("Data");

        comboboxAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxAmigosActionPerformed(evt);
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(voltar)
                                            .addGap(0, 392, Short.MAX_VALUE))
                                        .addComponent(pesquisa))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addComponent(inativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(IdEditora)
                                                    .addComponent(idEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(NomeEditora))
                                            .addGap(360, 360, 360))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(StatusEditora)
                                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(categoria)
                                                .addComponent(comboboxAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(Criar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Editar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Excluir)
                                    .addGap(369, 369, 369)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editoraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(IdEditora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeEditora)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StatusEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
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

     public void listarLivros(List<LivrosBEAN> listaLivros) {
         DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
            tabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaLivros.getColumnModel().getColumn(1).setPreferredWidth(80);
            
            modelo.setNumRows(0);
            try {
            for (LivrosBEAN livros : listaLivros) {
                modelo.addRow(new Object[]{livros.getId(), livros.getTitulo(), false});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }   
    }
     
     public void listarEmprestimos(List<EmprestimosBEAN> listaEmprestimos) {
         DefaultTableModel modelo = (DefaultTableModel) tabelaEmprestimos.getModel();
            tabelaEmprestimos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaEmprestimos.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaEmprestimos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelaEmprestimos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaEmprestimos.getColumnModel().getColumn(4).setPreferredWidth(80);
            modelo.setNumRows(0);
            try {
            for (EmprestimosBEAN emprestimos : listaEmprestimos) {
                AmigosBEAN amigos = controle.findAmigosNome(emprestimos.getAmigos_idAmigos());
                
                String emprestimos_nomeLivros = "";

                List<Emprestimos_has_livrosBEAN> listaLivrosSelecionados = controle.findLivros(emprestimos.getIdEmprestimos());
                   
                for (Emprestimos_has_livrosBEAN livroSelecionado : listaLivrosSelecionados) {
                    emprestimos_nomeLivros = emprestimos_nomeLivros + controle.findLivrosNomes(livroSelecionado.getIdLivros()).getTitulo()+ ", ";
                }
                
                modelo.addRow(new Object[]{emprestimos.getIdEmprestimos(), emprestimos.getData(), emprestimos.getStatus(), amigos.getNome(), emprestimos_nomeLivros.substring(0,emprestimos_nomeLivros.length())});
            
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }    
    }
    
    private void inativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inativaActionPerformed

    private void tabelaEmprestimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEmprestimosMouseClicked
        int index = tabelaEmprestimos.getSelectedRow();

        idEmprestimos.setText(tabelaEmprestimos.getValueAt(index, 0).toString());
        
        String date = (tabelaEmprestimos.getValueAt(index,1).toString());
        data.setDate(controle.converterData(date));
        
        String st = tabelaEmprestimos.getValueAt(index, 2).toString();
        if ("ativa".equals(st)) {
            status.setSelectedIndex(0);
        } else {
            status.setSelectedIndex(1);
        }
        
        

    }//GEN-LAST:event_tabelaEmprestimosMouseClicked

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        EmprestimosBEAN emprestimos;
        EmprestimosDAO dao = new EmprestimosDAO();

        int index = tabelaEmprestimos.getSelectedRow();

        String id = tabelaEmprestimos.getValueAt(index, 0).toString();
        int idInt = Integer.parseInt(id);

        emprestimos = dao.findEmprestimos(idInt);

        dao.deleteEmprestimos(emprestimos);
        List<EmprestimosBEAN> listaEmprestimos = Controle.getListaEmprestimos();
        listarEmprestimos(listaEmprestimos);
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Livro inativado com sucesso!");
    }//GEN-LAST:event_ExcluirActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void idEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEmprestimosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEmprestimosActionPerformed

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new InicialCRUD().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        List<EmprestimosBEAN> listaEmprestimos = Controle.pesquisarEmprestimos(pesquisa.getText(), inativa.isSelected());
        listarEmprestimos(listaEmprestimos);
    }//GEN-LAST:event_pesquisarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        EmprestimosBEAN emprestimos;
        EmprestimosDAO dao = new EmprestimosDAO();

        AmigosBEAN amigos = comboboxAmigos.getItemAt(comboboxAmigos.getSelectedIndex());
        
        String id = "";
        id = idEmprestimos.getText().toString();
        int idint = Integer.parseInt(id);
        
        emprestimos = new EmprestimosBEAN(idint, data.getDate(), amigos.getIdAmigos(), status.getSelectedItem().toString());
       
        ArrayList<Integer> contaLivros = new ArrayList<Integer>();
        
        for(int i=0;i<tabelaLivros.getRowCount();i++){
            if("true".equals(tabelaLivros.getValueAt(i, 2).toString())){
                int idLivros = Integer.parseInt(tabelaLivros.getValueAt(i, 0).toString());
                contaLivros.add(idLivros);
            }
        }
        try {
            dao.updateEmprestimos(emprestimos, contaLivros);
        } catch (SQLException ex) {
            Logger.getLogger(LivrosCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Livro editado com sucesso!");
    }//GEN-LAST:event_EditarActionPerformed

    private void CriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarActionPerformed
        EmprestimosBEAN emprestimos;
        EmprestimosDAO dao = new EmprestimosDAO();

        AmigosBEAN amigos = comboboxAmigos.getItemAt(comboboxAmigos.getSelectedIndex());
        
        emprestimos = new EmprestimosBEAN(0, data.getDate(), amigos.getIdAmigos(), status.getSelectedItem().toString());
        ArrayList<Integer> contaLivros = new ArrayList<Integer>();

        for(int i=0;i<tabelaLivros.getRowCount();i++){
            if("true".equals(tabelaLivros.getValueAt(i, 2).toString())){
                int cont = Integer.parseInt(tabelaLivros.getValueAt(i, 0).toString());
                contaLivros.add(cont);
            }
        }
        try {
            dao.createEmprestimos(emprestimos, contaLivros);
        } catch (SQLException ex) {
            Logger.getLogger(LivrosCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Livro criado com sucesso!");
    }//GEN-LAST:event_CriarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void comboboxAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxAmigosActionPerformed

    }//GEN-LAST:event_comboboxAmigosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestimosCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Criar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JLabel IdEditora;
    private javax.swing.JLabel NomeEditora;
    private javax.swing.JLabel StatusEditora;
    private javax.swing.JLabel categoria;
    private javax.swing.JComboBox<AmigosBEAN> comboboxAmigos;
    private javax.swing.JLabel editoraTxt;
    private javax.swing.JTextField idEmprestimos;
    private javax.swing.JCheckBox inativa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton sair;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabelaEmprestimos;
    private javax.swing.JTable tabelaLivros;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
