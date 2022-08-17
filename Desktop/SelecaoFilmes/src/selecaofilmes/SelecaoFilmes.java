package selecaofilmes;
public class SelecaoFilmes extends javax.swing.JFrame {

 
    public SelecaoFilmes() {
        initComponents();
        setLocationRelativeTo(null); //centralizando a tela.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        acaocheck = new javax.swing.JCheckBox();
        comediacheck = new javax.swing.JCheckBox();
        comediarocheck = new javax.swing.JCheckBox();
        ficcaocheck = new javax.swing.JCheckBox();
        romancecheck = new javax.swing.JCheckBox();
        suspensecheck = new javax.swing.JCheckBox();
        terrorcheck = new javax.swing.JCheckBox();
        botaook = new javax.swing.JButton();
        botaocancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção de Filmes");

        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 30)); // NOI18N
        jLabel1.setText("Seleção de Filmes");

        selecao.add(acaocheck);
        acaocheck.setText("Ação");
        acaocheck.setFocusPainted(false);
        acaocheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acaocheckActionPerformed(evt);
            }
        });

        selecao.add(comediacheck);
        comediacheck.setText("Comédia");

        selecao.add(comediarocheck);
        comediarocheck.setText("Comédia Romântica");

        selecao.add(ficcaocheck);
        ficcaocheck.setText("Ficção");

        selecao.add(romancecheck);
        romancecheck.setText("Romance");

        selecao.add(suspensecheck);
        suspensecheck.setText("Suspense");

        selecao.add(terrorcheck);
        terrorcheck.setText("Terror");

        botaook.setText("OK");
        botaook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaookActionPerformed(evt);
            }
        });

        botaocancelar.setText("Cancelar");
        botaocancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(terrorcheck)
                            .addComponent(suspensecheck)
                            .addComponent(romancecheck)
                            .addComponent(ficcaocheck)
                            .addComponent(comediarocheck)
                            .addComponent(comediacheck)
                            .addComponent(acaocheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botaook)
                                .addGap(41, 41, 41)
                                .addComponent(botaocancelar)
                                .addGap(20, 20, 20)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(acaocheck)
                .addGap(18, 18, 18)
                .addComponent(comediacheck)
                .addGap(18, 18, 18)
                .addComponent(comediarocheck)
                .addGap(18, 18, 18)
                .addComponent(ficcaocheck)
                .addGap(18, 18, 18)
                .addComponent(romancecheck)
                .addGap(18, 18, 18)
                .addComponent(suspensecheck)
                .addGap(18, 18, 18)
                .addComponent(terrorcheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaook)
                    .addComponent(botaocancelar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaookActionPerformed
       
       if(acaocheck.isSelected()){
       new FilmeAcao ().show(true);
       }
       else if(comediacheck.isSelected()){
       new FilmeComedia ().show(true);
       }
       else if(comediarocheck.isSelected()){
       new FilmeComediaR ().show(true);
       }
       else if(ficcaocheck.isSelected()){
       new FilmeFiccao ().show(true);
       }
       else if(romancecheck.isSelected()){
       new FilmeRomance ().show(true);
       }
       else if(suspensecheck.isSelected()){
       new FilmeSuspense ().show(true);
       }
       else if(terrorcheck.isSelected()){
       new FilmeTerror ().show(true);
       }
       /*dependendo da checkbox que o usuário clicar, um dos jframes acima (ex: acaocheck) será mostrado na tela*/ 
        
    }//GEN-LAST:event_botaookActionPerformed

    private void acaocheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acaocheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acaocheckActionPerformed

    private void botaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarActionPerformed
        System.exit(0); //fecha o jframe.
    }//GEN-LAST:event_botaocancelarActionPerformed

    public static void main(String args[]) { //método principal.
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecaoFilmes().setVisible(true); //fazendo a janela SelecaoFilmes.java ficar visível.
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acaocheck;
    private javax.swing.JButton botaocancelar;
    private javax.swing.JButton botaook;
    private javax.swing.JCheckBox comediacheck;
    private javax.swing.JCheckBox comediarocheck;
    private javax.swing.JCheckBox ficcaocheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox romancecheck;
    private javax.swing.ButtonGroup selecao;
    private javax.swing.JCheckBox suspensecheck;
    private javax.swing.JCheckBox terrorcheck;
    // End of variables declaration//GEN-END:variables
}
