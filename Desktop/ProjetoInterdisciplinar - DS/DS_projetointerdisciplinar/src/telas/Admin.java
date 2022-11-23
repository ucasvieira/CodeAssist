package telas;

import javax.swing.JOptionPane;
import conexao.Conexao;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    Conexao con_desenvolvedores;
    
    public Admin() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        con_desenvolvedores = new Conexao(); // inicialização do objeto como instância
        con_desenvolvedores.conecta(); // chama o método que conecta
        con_desenvolvedores.executaSQL("select * from desenvolvedores");
        btnexcluir.setEnabled(false);
        btneditar.setEnabled(false);
        preencherTabela();
        posicionarRegistro();
        String txtpesquisar = txtpesquisa.getText();
        tbldesenvolvedores.setAutoCreateRowSorter(true);
        
        txtcod.setText(""); // limpa a caixa de texto em questão
        txtnome.setText("");
        txtdatanasc.setText("");
        txtcpf.setText("");
        txtsobrenome.setText("");
        txtcargo.setText("");
        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdatanasc = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsobrenome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combobox_s = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        PanelFundoBotao = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btneditar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldesenvolvedores = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Administradores");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(20, 18, 16));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconadm.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sobrenome:");

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data de nascimento:");

        try {
            txtdatanasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo:");

        combobox_s.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Feminino", "Masculino", "Outro" }));
        combobox_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_sActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cargo:");

        btnsalvar.setText("Salvar");
        btnsalvar.setFocusable(false);
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Código:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Digite um  número para podermos localizá-lo na tabela de consulta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalvar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(txtsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(txtdatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(combobox_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel11)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnsalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combobox_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administradores");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Buscar por nome:");

        txtpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesquisaActionPerformed(evt);
            }
        });

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.gif"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setFocusable(false);
        btnbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarMouseClicked(evt);
            }
        });
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.gif"))); // NOI18N
        btnlimpar.setText("Limpar");
        btnlimpar.setFocusable(false);
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        PanelFundoBotao.setOpaque(false);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Para editar ou excluir um administrador, basta selecionar na tabela e clicar no botão desejado. ");

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_edit.gif"))); // NOI18N
        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_delete.gif"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFundoBotaoLayout = new javax.swing.GroupLayout(PanelFundoBotao);
        PanelFundoBotao.setLayout(PanelFundoBotaoLayout);
        PanelFundoBotaoLayout.setHorizontalGroup(
            PanelFundoBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFundoBotaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(66, 66, 66)
                .addComponent(btneditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnexcluir))
        );
        PanelFundoBotaoLayout.setVerticalGroup(
            PanelFundoBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFundoBotaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFundoBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btneditar)
                    .addComponent(btnexcluir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setOpaque(false);

        tbldesenvolvedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Sobrenome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldesenvolvedores.setOpaque(false);
        tbldesenvolvedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldesenvolvedoresMouseClicked(evt);
            }
        });
        tbldesenvolvedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbldesenvolvedoresKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbldesenvolvedores);
        if (tbldesenvolvedores.getColumnModel().getColumnCount() > 0) {
            tbldesenvolvedores.getColumnModel().getColumn(0).setResizable(false);
            tbldesenvolvedores.getColumnModel().getColumn(1).setResizable(false);
            tbldesenvolvedores.getColumnModel().getColumn(2).setResizable(false);
            tbldesenvolvedores.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(420, 420, 420)
                                .addComponent(btnbuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnlimpar))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelFundoBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(btnlimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFundoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_projeto2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        String sql="";
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro? ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION,3);
            if (resposta==0) {
                sql = "delete from desenvolvedores where id_adm = " + txtcod.getText();
                int excluir = con_desenvolvedores.statement.executeUpdate(sql);
                if (excluir==1) {
                    JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_desenvolvedores.executaSQL("select * from desenvolvedores order by id_adm");
                    con_desenvolvedores.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }else {
                    JOptionPane.showMessageDialog(null,"Operação cancelada pelo usuário!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
            } 
        }catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null,"Erro na exclusão: "+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        String nome = txtnome.getText();
        String sobrenome = txtsobrenome.getText();
        String cpf = txtcpf.getText();
        String nascimento = txtdatanasc.getText();
        String sexo = combobox_s.getSelectedItem().toString();
        String cargo = txtcargo.getText();
        String sql="";
        String msg="";
        
        try {
            if(txtcod.getText().equals("")){
                sql="insert into desenvolvedores (nome_adm,sobrenome_adm,cpf_adm , data_nasc, cargo_adm, sexo_adm) values ('" + nome + "','" + sobrenome + "','" + cpf + "','" + nascimento + "','" + sexo + "','" + cargo + "')";
                msg="Gravação de um novo registro";
            } else {
                sql="update desenvolvedores set nome_adm='" + nome + "',sobrenome_adm='" + sobrenome + "', cpf_adm='" + cpf + "', data_nasc='" + nascimento + "', sexo_adm='" + sexo + "', cargo_adm='" + cargo + "' where id_adm = " + txtcod.getText();
                msg="Alteração de registro";
            }
            
            con_desenvolvedores.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,msg+" realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
            con_desenvolvedores.executaSQL("select * from desenvolvedores order by id_adm");
            con_desenvolvedores.resultset.first();
            preencherTabela();
            mostrar_Dados();
            
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }                 
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        txtpesquisa.setText(null);
        
        txtcod.setText(""); 
        txtnome.setText("");
        txtdatanasc.setText("");
        txtcpf.setText("");
        txtsobrenome.setText("");
        txtcargo.setText("");
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        try {
            String pesquisa = "select * from desenvolvedores where nome_adm like '" + txtpesquisa.getText() + "%'";
            con_desenvolvedores.executaSQL(pesquisa);

            if(con_desenvolvedores.resultset.first()){
                preencherTabela();
            } else {
                JOptionPane.showMessageDialog(null,"\n Não existe dados com este paramêtro!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException errosql) {
            JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }

        PanelFundoBotao.setVisible(true);
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarMouseClicked
        btnexcluir.setEnabled(true);
        btneditar.setEnabled(true);
    }//GEN-LAST:event_btnbuscarMouseClicked

    private void txtpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisaActionPerformed
        try {
            String pesquisa = "select * from desenvolvedores where nome_adm like '" + txtpesquisa.getText() + "%'";
            con_desenvolvedores.executaSQL(pesquisa);

            if(con_desenvolvedores.resultset.first()){
                preencherTabela();
            } else {
                JOptionPane.showMessageDialog(null,"\n Não existem dados com este paramêtro!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException errosql) {
            JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtpesquisaActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed

        String nome = txtnome.getText();
        String sobrenome = txtsobrenome.getText();
        String cpf = txtcpf.getText();
        String nascimento = txtdatanasc.getText();
        String cargo = txtcargo.getText();
        String sexo = combobox_s.getSelectedItem().toString();

        if(txtnome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo nome é obrigatório, preencha-o para continuar.", "Aviso", WIDTH);
            return;
        }
        else if(txtcpf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo cpf é obrigatório, preencha-o para continuar.", "Aviso", WIDTH);
            return;
        }
        else if(txtsobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo sobrenome é obrigatório, preencha-o para continuar.", "Aviso", WIDTH);
            return;
        }
        else if(txtdatanasc.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo data de nascimento é obrigatório, preencha-o para continuar.", "Aviso", WIDTH);
            return;
        }
        else if(txtcargo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O campo cargo é obrigatório, preencha-o para continuar.", "Aviso", WIDTH);
            return;
        }
        //*fazer um else if para o combobox*

        try {
            String insert_sql="insert into desenvolvedores (nome_adm, sobrenome_adm, cpf_adm, data_nasc, cargo_adm, sexo_adm) values ('" + nome + "','" + sobrenome + "','" + cpf + "','" + nascimento + "','" + cargo + "','" + sexo + "')";
            con_desenvolvedores.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            con_desenvolvedores.executaSQL("select * from desenvolvedores");

        }catch(SQLException errosql) {
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void combobox_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_sActionPerformed

    private void tbldesenvolvedoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbldesenvolvedoresKeyPressed
        int linha_selecionada = tbldesenvolvedores.getSelectedRow();
        txtcod.setText(tbldesenvolvedores.getValueAt(linha_selecionada, 0).toString());
        txtnome.setText(tbldesenvolvedores.getValueAt(linha_selecionada, 1).toString());
        txtsobrenome.setText(tbldesenvolvedores.getValueAt(linha_selecionada, 2).toString());     
        txtcargo.setText(tbldesenvolvedores.getValueAt(linha_selecionada, 3).toString());
        
    }//GEN-LAST:event_tbldesenvolvedoresKeyPressed

    private void tbldesenvolvedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldesenvolvedoresMouseClicked
        int linha_selecionada = tbldesenvolvedores.getSelectedRow();
        txtcod.setText(tbldesenvolvedores.getValueAt(linha_selecionada, 0).toString());
        txtnome.setText(tbldesenvolvedores.getValueAt(linha_selecionada, 1).toString());
        txtsobrenome.setText(tbldesenvolvedores.getValueAt(linha_selecionada, 2).toString());      
        txtcargo.setText(tbldesenvolvedores.getValueAt(linha_selecionada, 3).toString());
    }//GEN-LAST:event_tbldesenvolvedoresMouseClicked

  
    
    public void preencherTabela(){
      tbldesenvolvedores.getColumnModel() .getColumn(0) .setPreferredWidth(3);
      tbldesenvolvedores.getColumnModel() .getColumn(1) .setPreferredWidth(20);
      tbldesenvolvedores.getColumnModel() .getColumn(2) .setPreferredWidth(60);
      tbldesenvolvedores.getColumnModel() .getColumn(3) .setPreferredWidth(55);

      
      DefaultTableModel modelo = (DefaultTableModel) tbldesenvolvedores.getModel();
      modelo.setNumRows(0);
      
       try {
            con_desenvolvedores.resultset.beforeFirst();
            while(con_desenvolvedores.resultset.next()){
                modelo.addRow(new Object[]{
                    con_desenvolvedores.resultset.getString("id_adm"),
                    con_desenvolvedores.resultset.getString("nome_adm"),
                    con_desenvolvedores.resultset.getString("sobrenome_adm"),
                    con_desenvolvedores.resultset.getString("cpf_adm"),
                    con_desenvolvedores.resultset.getString("data_nasc"),
                    con_desenvolvedores.resultset.getString("cargo_adm"),
                 
                });
            }
        }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "
                    +erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistro() {
        try {
            con_desenvolvedores.resultset.first(); // posiciona no 1ª registro da tabela
            mostrar_Dados(); // chama o método que irá buscar o dado da tabela
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrar_Dados(){
        try {
            combobox_s.getSelectedItem().toString();
            txtcod.setText(con_desenvolvedores.resultset.getString("id_adm"));
            txtnome.setText(con_desenvolvedores.resultset.getString("nome_adm")); 
            txtsobrenome.setText(con_desenvolvedores.resultset.getString("sobrenome_adm"));// Associar a caixa de texto ao campo nome
            txtcpf.setText(con_desenvolvedores.resultset.getString("cpf_adm"));
            txtdatanasc.setText(con_desenvolvedores.resultset.getString("datanasc"));
            txtcargo.setText(con_desenvolvedores.resultset.getString("cargo_adm"));
         
        } catch(SQLException erro) {
            
        }
        
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFundoBotao;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<String> combobox_s;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldesenvolvedores;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtcod;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JFormattedTextField txtdatanasc;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtsobrenome;
    // End of variables declaration//GEN-END:variables
}
