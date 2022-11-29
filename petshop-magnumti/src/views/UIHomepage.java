package views;

public class UIHomepage extends javax.swing.JFrame {

    public UIHomepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnComprar = new com.k33ptoo.components.KButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        btnsobrenos = new com.k33ptoo.components.KButton();
        btnHome = new com.k33ptoo.components.KButton();
        btncaes = new com.k33ptoo.components.KButton();
        btngatos = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new com.k33ptoo.components.KButton();
        btnCarrinho = new javax.swing.JLabel();
        btnfechar = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(250, 150, 0));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(64, 37, 22));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/poteracao-ofc__1_-removebg-preview.png"))); // NOI18N

        btnComprar.setBorder(null);
        btnComprar.setText("COMPRAR AGORA");
        btnComprar.setToolTipText("");
        btnComprar.setBorderPainted(false);
        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComprar.setkBackGroundColor(new java.awt.Color(250, 189, 74));
        btnComprar.setkBorderRadius(50);
        btnComprar.setkEndColor(new java.awt.Color(250, 189, 74));
        btnComprar.setkForeGround(new java.awt.Color(212, 115, 56));
        btnComprar.setkHoverEndColor(new java.awt.Color(250, 189, 74));
        btnComprar.setkHoverForeGround(new java.awt.Color(212, 115, 56));
        btnComprar.setkHoverStartColor(new java.awt.Color(255, 255, 153));
        btnComprar.setkPressedColor(new java.awt.Color(250, 189, 74));
        btnComprar.setkSelectedColor(new java.awt.Color(250, 189, 74));
        btnComprar.setkStartColor(new java.awt.Color(250, 189, 74));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/arrow-white-removebg-preview (1).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>\nSeu pet também é <br> o nosso MELHOR ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(212, 115, 56));
        jLabel7.setText("AMIGO !");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addGap(539, 539, 539))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(451, 451, 451))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(96, 96, 96)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnCadastrar.setBorder(null);
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("Inscrever-se");
        btnCadastrar.setToolTipText("");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setkBackGroundColor(new java.awt.Color(250, 150, 0));
        btnCadastrar.setkBorderRadius(50);
        btnCadastrar.setkEndColor(new java.awt.Color(250, 150, 0));
        btnCadastrar.setkForeGround(new java.awt.Color(0, 0, 0));
        btnCadastrar.setkHoverEndColor(new java.awt.Color(250, 150, 0));
        btnCadastrar.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnCadastrar.setkHoverStartColor(new java.awt.Color(242, 104, 53));
        btnCadastrar.setkPressedColor(new java.awt.Color(255, 153, 0));
        btnCadastrar.setkSelectedColor(new java.awt.Color(250, 150, 0));
        btnCadastrar.setkStartColor(new java.awt.Color(250, 150, 0));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/sublogo_-_petshop__2___1_-removebg-preview.png"))); // NOI18N

        btnsobrenos.setBorder(null);
        btnsobrenos.setText("SOBRE NÓS");
        btnsobrenos.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnsobrenos.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnsobrenos.setkEndColor(new java.awt.Color(255, 255, 255));
        btnsobrenos.setkForeGround(new java.awt.Color(0, 0, 0));
        btnsobrenos.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnsobrenos.setkHoverForeGround(new java.awt.Color(250, 150, 0));
        btnsobrenos.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btnsobrenos.setkStartColor(new java.awt.Color(255, 255, 255));
        btnsobrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsobrenosActionPerformed(evt);
            }
        });

        btnHome.setBorder(null);
        btnHome.setText("HOME");
        btnHome.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btnHome.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnHome.setkEndColor(new java.awt.Color(255, 255, 255));
        btnHome.setkForeGround(new java.awt.Color(0, 0, 0));
        btnHome.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnHome.setkHoverForeGround(new java.awt.Color(250, 150, 0));
        btnHome.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btnHome.setkStartColor(new java.awt.Color(255, 255, 255));

        btncaes.setBorder(null);
        btncaes.setText("CÃES");
        btncaes.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btncaes.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btncaes.setkEndColor(new java.awt.Color(255, 255, 255));
        btncaes.setkForeGround(new java.awt.Color(0, 0, 0));
        btncaes.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btncaes.setkHoverForeGround(new java.awt.Color(250, 150, 0));
        btncaes.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btncaes.setkStartColor(new java.awt.Color(255, 255, 255));
        btncaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncaesActionPerformed(evt);
            }
        });

        btngatos.setBorder(null);
        btngatos.setText("GATOS");
        btngatos.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        btngatos.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btngatos.setkEndColor(new java.awt.Color(255, 255, 255));
        btngatos.setkForeGround(new java.awt.Color(0, 0, 0));
        btngatos.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btngatos.setkHoverForeGround(new java.awt.Color(250, 150, 0));
        btngatos.setkHoverStartColor(new java.awt.Color(204, 204, 204));
        btngatos.setkStartColor(new java.awt.Color(255, 255, 255));
        btngatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngatosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ou");

        btnLogin.setBorder(null);
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.setToolTipText("");
        btnLogin.setBorderPainted(false);
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setkBackGroundColor(new java.awt.Color(250, 150, 0));
        btnLogin.setkBorderRadius(50);
        btnLogin.setkEndColor(new java.awt.Color(250, 150, 0));
        btnLogin.setkForeGround(new java.awt.Color(0, 0, 0));
        btnLogin.setkHoverEndColor(new java.awt.Color(250, 150, 0));
        btnLogin.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnLogin.setkHoverStartColor(new java.awt.Color(242, 104, 53));
        btnLogin.setkPressedColor(new java.awt.Color(255, 153, 0));
        btnLogin.setkSelectedColor(new java.awt.Color(250, 150, 0));
        btnLogin.setkStartColor(new java.awt.Color(250, 150, 0));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/carrinho-icon (1).png"))); // NOI18N
        btnCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrinhoMouseClicked(evt);
            }
        });

        btnfechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/red-x-icon (1).png"))); // NOI18N
        btnfechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(btnsobrenos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncaes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btngatos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(526, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnfechar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncaes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btngatos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsobrenos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        UICadastro telaCadastro = new UICadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        UICaes telaCaes = new UICaes();
        telaCaes.setVisible(true);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        UIlogin telaLogin = new UIlogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnfecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnfecharMouseClicked

    private void btncaesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncaesActionPerformed
        UICaes telaProdCaes = new UICaes();
        this.dispose();
        telaProdCaes.setVisible(true);
    }//GEN-LAST:event_btncaesActionPerformed

    private void btngatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngatosActionPerformed
        UIGatos telaProdGatos = new UIGatos();
        this.dispose();

        telaProdGatos.setVisible(true);
    }//GEN-LAST:event_btngatosActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        UICaes telaCaes2 = new UICaes();
        telaCaes2.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrinhoMouseClicked
        UICarrinho telacarrinho = new UICarrinho();
        telacarrinho.setVisible(true);
    }//GEN-LAST:event_btnCarrinhoMouseClicked

    private void btnsobrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsobrenosActionPerformed
        UIAboutUs sobrenos = new UIAboutUs();
        sobrenos.setVisible(true);
    }//GEN-LAST:event_btnsobrenosActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCadastrar;
    private javax.swing.JLabel btnCarrinho;
    private com.k33ptoo.components.KButton btnComprar;
    private com.k33ptoo.components.KButton btnHome;
    private com.k33ptoo.components.KButton btnLogin;
    private com.k33ptoo.components.KButton btncaes;
    private javax.swing.JLabel btnfechar;
    private com.k33ptoo.components.KButton btngatos;
    private com.k33ptoo.components.KButton btnsobrenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
