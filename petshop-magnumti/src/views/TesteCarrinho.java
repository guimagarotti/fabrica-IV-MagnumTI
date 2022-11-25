package views;

import conexoes.MySQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.AdicionaCarrinho;

public class TesteCarrinho extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    AdicionaCarrinho carrinho = new AdicionaCarrinho();

    double total = 0.0;

    private void buscaBola(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 29.9;

        try {
            this.conectar.executarSQL(
                    "SELECT " + "nome," + "preco," + "quantidade" + " FROM " + "carrinho"
                    + " WHERE" + " preco = '" + preco + "'" + ";"
            );

            while (this.conectar.getResultSet().next()) {
                carrinho.setNome(this.conectar.getResultSet().getString(1));
                carrinho.setPreco(this.conectar.getResultSet().getDouble(2));
                carrinho.setQuantidade(this.conectar.getResultSet().getInt(3));
            }

            if (carrinho.getNome() != null) {
                valorBola.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                quantidadeBola.setText(Integer.toString(carrinho.getQuantidade()));
            } else {
                valorBola.setText("0.0");
                quantidadeBola.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto bola!");
        } finally {
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            total += Double.parseDouble(valorBola.getText());
            this.conectar.fechaBanco();
        }
    }

    private void buscaOsso(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 9.90;

        try {
            this.conectar.executarSQL(
                    "SELECT " + "nome," + "preco," + "quantidade" + " FROM " + "carrinho"
                    + " WHERE" + " preco = '" + preco + "'" + ";"
            );
            while (this.conectar.getResultSet().next()) {
                carrinho.setNome(this.conectar.getResultSet().getString(1));
                carrinho.setPreco(this.conectar.getResultSet().getDouble(2));
                carrinho.setQuantidade(this.conectar.getResultSet().getInt(3));
            }

            if (carrinho.getNome().contains("Osso")) {
                valorOsso.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                quantidadeOsso.setText(Integer.toString(carrinho.getQuantidade()));
            } else {
                valorOsso.setText("0.0");
                quantidadeOsso.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto osso!");
        } finally {
            total += Double.parseDouble(valorOsso.getText());
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            this.conectar.fechaBanco();
        }
    }

    private void buscaShampoo(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 39.90;

        try {
            this.conectar.executarSQL(
                    "SELECT " + "nome," + "preco," + "quantidade" + " FROM " + "carrinho"
                    + " WHERE" + " preco = '" + preco + "'" + ";"
            );
            while (this.conectar.getResultSet().next()) {
                carrinho.setNome(this.conectar.getResultSet().getString(1));
                carrinho.setPreco(this.conectar.getResultSet().getDouble(2));
                carrinho.setQuantidade(this.conectar.getResultSet().getInt(3));
            }

            if (carrinho.getNome().contains("Shampoo")) {
                valorShampoo.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                quantidadeShampoo.setText(Integer.toString(carrinho.getQuantidade()));
            } else {
                valorShampoo.setText("0.0");
                quantidadeShampoo.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto shampoo!");
        } finally {
            total += Double.parseDouble(valorShampoo.getText());
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            this.conectar.fechaBanco();
        }
    }

    private void buscaArranhador(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 19.90;

        try {
            this.conectar.executarSQL(
                    "SELECT " + "nome," + "preco," + "quantidade" + " FROM " + "carrinho"
                    + " WHERE" + " preco = '" + preco + "'" + ";"
            );
            while (this.conectar.getResultSet().next()) {
                carrinho.setNome(this.conectar.getResultSet().getString(1));
                carrinho.setPreco(this.conectar.getResultSet().getDouble(2));
                carrinho.setQuantidade(this.conectar.getResultSet().getInt(3));
            }

            if (carrinho.getNome().contains("Arranhador")) {
                valorArranhador.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                quantidadeArranhador.setText(Integer.toString(carrinho.getQuantidade()));
            } else {
                valorArranhador.setText("0.0");
                quantidadeArranhador.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto arranhador!");
        } finally {
            total += Double.parseDouble(valorArranhador.getText());
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            this.conectar.fechaBanco();
        }
    }

    private void finalizaCompra(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        try {
            this.conectar.updateSQL(
                    "DELETE FROM carrinho WHERE id > 0;"
            );

            if (carrinho.getNome() == null) {
                JOptionPane.showMessageDialog(null, "[ERRO]: Campos para finalização de compra vazios!");
            } else {
                JOptionPane.showMessageDialog(null, "[OK]: Compra finalizada com sucesso!");

                valorBola.setText("0.0");
                quantidadeBola.setText("0");

                valorOsso.setText("0.0");
                quantidadeOsso.setText("0");

                valorShampoo.setText("0.0");
                quantidadeShampoo.setText("0");

                valorArranhador.setText("0.0");
                quantidadeArranhador.setText("0");

                valorGasto.setText("0.0");
            }
        } catch (Exception e) {
            System.out.println("[ERRO]: Não foi possível finalizar a compra! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao finalizar compra!");
        } finally {
            this.conectar.fechaBanco();
        }
    }

    public TesteCarrinho() {
        initComponents();

        buscaBola(carrinho);
        buscaOsso(carrinho);
        buscaShampoo(carrinho);
        buscaArranhador(carrinho);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeBola = new javax.swing.JLabel();
        valorBola = new javax.swing.JLabel();
        quantidadeBola = new javax.swing.JLabel();
        nomeOsso = new javax.swing.JLabel();
        valorOsso = new javax.swing.JLabel();
        quantidadeOsso = new javax.swing.JLabel();
        nomeShampoo = new javax.swing.JLabel();
        valorShampoo = new javax.swing.JLabel();
        quantidadeShampoo = new javax.swing.JLabel();
        nomeArranhador = new javax.swing.JLabel();
        valorArranhador = new javax.swing.JLabel();
        quantidadeArranhador = new javax.swing.JLabel();
        btnFinaliza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valorGasto = new javax.swing.JLabel();
        nomeBola1 = new javax.swing.JLabel();
        nomeBola2 = new javax.swing.JLabel();
        nomeBola3 = new javax.swing.JLabel();

        jLabel4.setText("nome");

        jLabel5.setText("valor");

        jLabel14.setText("Bola");

        jLabel6.setText("quantidade");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeBola.setText("Produto");

        valorBola.setText("0.0");

        quantidadeBola.setText("0");

        nomeOsso.setText("Osso");

        valorOsso.setText("0.0");

        quantidadeOsso.setText("0");

        nomeShampoo.setText("Shampoo");

        valorShampoo.setText("0.0");

        quantidadeShampoo.setText("0");

        nomeArranhador.setText("Arranhador");

        valorArranhador.setText("0.0");

        quantidadeArranhador.setText("0");

        btnFinaliza.setText("Finalizar Compra");
        btnFinaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizaActionPerformed(evt);
            }
        });

        jLabel1.setText("Gasto Total:");

        valorGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valorGasto.setText("0");

        nomeBola1.setText("Valor");

        nomeBola2.setText("Bola");

        nomeBola3.setText("Quantidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeBola)
                            .addComponent(nomeBola2)
                            .addComponent(nomeOsso)
                            .addComponent(nomeShampoo))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorBola)
                            .addComponent(nomeBola1)
                            .addComponent(valorOsso)
                            .addComponent(valorShampoo)
                            .addComponent(valorArranhador))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantidadeArranhador)
                            .addComponent(quantidadeShampoo)
                            .addComponent(quantidadeOsso)
                            .addComponent(nomeBola3)
                            .addComponent(quantidadeBola)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeArranhador)
                                .addGap(162, 162, 162))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnFinaliza)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(valorGasto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeBola)
                    .addComponent(nomeBola1)
                    .addComponent(nomeBola3))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorBola)
                    .addComponent(quantidadeBola)
                    .addComponent(nomeBola2))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeOsso)
                    .addComponent(valorOsso)
                    .addComponent(quantidadeOsso))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeShampoo)
                    .addComponent(valorShampoo)
                    .addComponent(quantidadeShampoo))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeArranhador)
                    .addComponent(valorArranhador)
                    .addComponent(quantidadeArranhador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinaliza)
                    .addComponent(jLabel1)
                    .addComponent(valorGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizaActionPerformed
        btnFinaliza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalizaCompra(carrinho);
            }
        });
    }//GEN-LAST:event_btnFinalizaActionPerformed

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
            java.util.logging.Logger.getLogger(TesteCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteCarrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinaliza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nomeArranhador;
    private javax.swing.JLabel nomeBola;
    private javax.swing.JLabel nomeBola1;
    private javax.swing.JLabel nomeBola2;
    private javax.swing.JLabel nomeBola3;
    private javax.swing.JLabel nomeOsso;
    private javax.swing.JLabel nomeShampoo;
    private javax.swing.JLabel quantidadeArranhador;
    private javax.swing.JLabel quantidadeBola;
    private javax.swing.JLabel quantidadeOsso;
    private javax.swing.JLabel quantidadeShampoo;
    private javax.swing.JLabel valorArranhador;
    private javax.swing.JLabel valorBola;
    private javax.swing.JLabel valorGasto;
    private javax.swing.JLabel valorOsso;
    private javax.swing.JLabel valorShampoo;
    // End of variables declaration//GEN-END:variables
}
