package telas;

import java.awt.Color;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnbateria = new javax.swing.JToggleButton();
        btnmemoria = new javax.swing.JToggleButton();
        btntravamentos = new javax.swing.JToggleButton();
        btnsuperaquecimento = new javax.swing.JToggleButton();
        btncontatenos = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        paginaprincipal = new javax.swing.JMenu();
        espaco = new javax.swing.JMenu();
        deslogar = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu4.setText("jMenu4");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(20, 18, 16));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_projeto.png"))); // NOI18N

        btnbateria.setBackground(new java.awt.Color(37, 237, 108));
        btnbateria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnbateria.setForeground(new java.awt.Color(0, 0, 0));
        btnbateria.setText("Problemas com bateria");
        btnbateria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, null));
        btnbateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbateria.setFocusPainted(false);
        btnbateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbateriaMouseExited(evt);
            }
        });
        btnbateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbateriaActionPerformed(evt);
            }
        });

        btnmemoria.setBackground(new java.awt.Color(37, 237, 108));
        btnmemoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmemoria.setForeground(new java.awt.Color(0, 0, 0));
        btnmemoria.setText("Problemas com memória");
        btnmemoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, null));
        btnmemoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmemoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmemoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmemoriaMouseExited(evt);
            }
        });
        btnmemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmemoriaActionPerformed(evt);
            }
        });

        btntravamentos.setBackground(new java.awt.Color(37, 237, 108));
        btntravamentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntravamentos.setForeground(new java.awt.Color(0, 0, 0));
        btntravamentos.setText("Problemas com travamentos");
        btntravamentos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, null));
        btntravamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntravamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntravamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntravamentosMouseExited(evt);
            }
        });
        btntravamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntravamentosActionPerformed(evt);
            }
        });

        btnsuperaquecimento.setBackground(new java.awt.Color(37, 237, 108));
        btnsuperaquecimento.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnsuperaquecimento.setForeground(new java.awt.Color(0, 0, 0));
        btnsuperaquecimento.setText("Problemas com superaquecimento");
        btnsuperaquecimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, null));
        btnsuperaquecimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsuperaquecimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsuperaquecimentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsuperaquecimentoMouseExited(evt);
            }
        });
        btnsuperaquecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuperaquecimentoActionPerformed(evt);
            }
        });

        btncontatenos.setBackground(new java.awt.Color(37, 237, 108));
        btncontatenos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncontatenos.setForeground(new java.awt.Color(0, 0, 0));
        btncontatenos.setText("Contate-nos");
        btncontatenos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, null));
        btncontatenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncontatenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncontatenosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncontatenosMouseExited(evt);
            }
        });
        btncontatenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontatenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(695, 695, 695)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(btnbateria, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnmemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btntravamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnsuperaquecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btncontatenos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1373, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbateria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntravamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsuperaquecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncontatenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
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

        espaco.setText("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
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
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslogarActionPerformed

    }//GEN-LAST:event_deslogarActionPerformed

    private void deslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deslogarMouseClicked
        TelaPrincipal.this.dispose(); //fechará o jframe atual
        TelaLogin loginn = new TelaLogin();
        loginn.setVisible(true);  //mostrará a tela de cadastro
    }//GEN-LAST:event_deslogarMouseClicked

    private void btnbateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbateriaActionPerformed
        TelaPrincipal.this.dispose(); //fechará o jframe atual
        TelaBateria telabateria = new TelaBateria();
        telabateria.setVisible(true);
    }//GEN-LAST:event_btnbateriaActionPerformed

    private void btnmemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmemoriaActionPerformed
        TelaPrincipal.this.dispose(); //fechará o jframe atual
        TelaMemoria telamemoria = new TelaMemoria();
        telamemoria.setVisible(true);
    }//GEN-LAST:event_btnmemoriaActionPerformed

    private void btntravamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntravamentosActionPerformed
        TelaPrincipal.this.dispose(); //fechará o jframe atual
        TelaTravamentos telatravamentos = new TelaTravamentos();
        telatravamentos.setVisible(true);
    }//GEN-LAST:event_btntravamentosActionPerformed

    private void btnsuperaquecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuperaquecimentoActionPerformed
        TelaPrincipal.this.dispose(); //fechará o jframe atual
        TelaSuperaquecimento telasuperaquecimento = new TelaSuperaquecimento();
        telasuperaquecimento.setVisible(true);
    }//GEN-LAST:event_btnsuperaquecimentoActionPerformed

    private void btncontatenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontatenosActionPerformed
        TelaPrincipal.this.dispose(); //fechará o jframe atual
        EnviarProblema enviarproblema = new EnviarProblema();
        enviarproblema.setVisible(true);
    }//GEN-LAST:event_btncontatenosActionPerformed

    private void paginaprincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paginaprincipalMouseClicked
      
    }//GEN-LAST:event_paginaprincipalMouseClicked

    private void btnbateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbateriaMouseEntered
        btnbateria.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_btnbateriaMouseEntered

    private void btnbateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbateriaMouseExited
        btnbateria.setBackground(new Color(37,237,108));
    }//GEN-LAST:event_btnbateriaMouseExited

    private void btnmemoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmemoriaMouseEntered
        btnmemoria.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_btnmemoriaMouseEntered

    private void btnmemoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmemoriaMouseExited
        btnmemoria.setBackground(new Color(37,237,108));
    }//GEN-LAST:event_btnmemoriaMouseExited

    private void btntravamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntravamentosMouseEntered
        btntravamentos.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_btntravamentosMouseEntered

    private void btntravamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntravamentosMouseExited
        btntravamentos.setBackground(new Color(37,237,108));
    }//GEN-LAST:event_btntravamentosMouseExited

    private void btnsuperaquecimentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuperaquecimentoMouseEntered
        btnsuperaquecimento.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_btnsuperaquecimentoMouseEntered

    private void btnsuperaquecimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuperaquecimentoMouseExited
        btnsuperaquecimento.setBackground(new Color(37,237,108));
    }//GEN-LAST:event_btnsuperaquecimentoMouseExited

    private void btncontatenosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncontatenosMouseEntered
        btncontatenos.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_btncontatenosMouseEntered

    private void btncontatenosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncontatenosMouseExited
        btncontatenos.setBackground(new Color(37,237,108));
    }//GEN-LAST:event_btncontatenosMouseExited

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnbateria;
    private javax.swing.JToggleButton btncontatenos;
    private javax.swing.JToggleButton btnmemoria;
    private javax.swing.JToggleButton btnsuperaquecimento;
    private javax.swing.JToggleButton btntravamentos;
    private javax.swing.JMenu deslogar;
    private javax.swing.JMenu espaco;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JMenu paginaprincipal;
    // End of variables declaration//GEN-END:variables
}
