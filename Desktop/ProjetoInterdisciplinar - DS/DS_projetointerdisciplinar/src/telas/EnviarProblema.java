package telas;

import javax.swing.JOptionPane;
import conexao.Conexao;
import java.awt.Color;
import java.sql.*;
import javax.swing.JTextArea;

public class EnviarProblema extends javax.swing.JFrame {

    Conexao con_problema;
    
    public EnviarProblema() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        con_problema = new Conexao(); // inicialização do objeto como instância
        con_problema.conecta(); // chama o método que conecta
        con_problema.executaSQL("select * from problema");
        
        this.txtproblema.setLineWrap(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnenviarproblema = new javax.swing.JToggleButton();
        txtemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtproblema = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        paginaprincipal = new javax.swing.JMenu();
        espaco = new javax.swing.JMenu();
        deslogar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 18, 16));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aqui você poderá nos enviar o problema que está tendo com seu celular");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" por favor digite seu");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Problema:");

        btnenviarproblema.setBackground(new java.awt.Color(37, 237, 108));
        btnenviarproblema.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnenviarproblema.setForeground(new java.awt.Color(23, 24, 16));
        btnenviarproblema.setText("Enviar");
        btnenviarproblema.setBorder(null);
        btnenviarproblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnenviarproblemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnenviarproblemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnenviarproblemaMouseExited(evt);
            }
        });
        btnenviarproblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarproblemaActionPerformed(evt);
            }
        });

        txtemail.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtemail.setBorder(null);
        txtemail.setMargin(new java.awt.Insets(50, 10, 10, 10));

        txtproblema.setColumns(20);
        txtproblema.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtproblema.setRows(5);
        txtproblema.setBorder(null);
        jScrollPane1.setViewportView(txtproblema);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_projeto2.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(37, 237, 108));
        jLabel6.setText("problema");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("e seu");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 237, 108));
        jLabel8.setText("e-mail");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(", respectivamente, nos campos abaixo!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnenviarproblema, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(332, 332, 332))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(352, 352, 352)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1052, 1052, 1052)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9)))
                .addContainerGap(1249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(btnenviarproblema, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        paginaprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Home.gif"))); // NOI18N
        paginaprincipal.setText("Página Inicial   |");
        paginaprincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paginaprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paginaprincipalMouseClicked(evt);
            }
        });
        jMenuBar1.add(paginaprincipal);

        espaco.setText("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        espaco.setEnabled(false);
        espaco.setFocusable(false);
        espaco.setRequestFocusEnabled(false);
        jMenuBar1.add(espaco);

        deslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.gif"))); // NOI18N
        deslogar.setText("Deslogar");
        deslogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deslogarMouseClicked(evt);
            }
        });
        deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslogarActionPerformed(evt);
            }
        });
        jMenuBar1.add(deslogar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paginaprincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paginaprincipalMouseClicked
        EnviarProblema.this.dispose(); //fechará o jframe atual
        TelaPrincipal telaprincipal = new TelaPrincipal();
        telaprincipal.setVisible(true);
    }//GEN-LAST:event_paginaprincipalMouseClicked

    private void deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslogarMouseClicked
        EnviarProblema.this.dispose(); //fechará o jframe atual
        TelaLogin loginn = new TelaLogin();
        loginn.setVisible(true);  //mostrará a tela de cadastro
    }//GEN-LAST:event_deslogarMouseClicked

    private void deslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogarActionPerformed
        
    }//GEN-LAST:event_deslogarActionPerformed

    private void btnenviarproblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarproblemaActionPerformed

        String email = txtemail.getText();
        String problema = txtproblema.getText();    
        
        
        if(txtemail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo email é obrigatório, preencha-o para continuar.", "Aviso", WIDTH);
            return;
        }
        else if(txtproblema.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo problema é obrigatório, preencha-o para continuar.", "Aviso", WIDTH);
            return;
        }
        
        
        
        try {
            String insert_sql="insert into problema (email, desc_problema) values ('" + email + "','" + problema + "')";
            con_problema.statement.executeUpdate(insert_sql);
            con_problema.executaSQL("select * from problema");
            
        }catch(SQLException errosql) {
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
        
        JOptionPane.showMessageDialog(null, "Sua mensagem foi enviada! Em breve entraremos em contato e resolveremos seu problema.");
        
        EnviarProblema.this.dispose(); //fechará o jframe atual
        TelaPrincipal telaprincipal = new TelaPrincipal();
        telaprincipal.setVisible(true);
    }//GEN-LAST:event_btnenviarproblemaActionPerformed

    private void btnenviarproblemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenviarproblemaMouseClicked
        
        
    }//GEN-LAST:event_btnenviarproblemaMouseClicked

    private void btnenviarproblemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenviarproblemaMouseEntered
        btnenviarproblema.setBackground(new Color(37,237,108));
        btnenviarproblema.setForeground(new Color(255,255,255));  
    }//GEN-LAST:event_btnenviarproblemaMouseEntered

    private void btnenviarproblemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenviarproblemaMouseExited
        btnenviarproblema.setBackground(new Color(37,237,108));
        btnenviarproblema.setForeground (new Color(0,0,0));  
    }//GEN-LAST:event_btnenviarproblemaMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnviarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnviarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnviarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnviarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnviarProblema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnenviarproblema;
    private javax.swing.JMenu deslogar;
    private javax.swing.JMenu espaco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu paginaprincipal;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextArea txtproblema;
    // End of variables declaration//GEN-END:variables
}
