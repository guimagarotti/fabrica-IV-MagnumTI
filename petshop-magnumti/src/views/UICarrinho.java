package views;

import conexoes.MySQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.AdicionaCarrinho;

public class UICarrinho extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    AdicionaCarrinho carrinho = new AdicionaCarrinho();

    double total = 0.0;

    // CAES
    private void buscaMagnus(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 89.90;

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
                txtValorProd1.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                txtQtdProd1.setText(Integer.toString(carrinho.getQuantidade()));
            }

            if (carrinho.getPreco() != preco) {
                txtValorProd1.setText("0.0");
                txtQtdProd1.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar Produto: Ração Magnus!");
        } finally {
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            total += Double.parseDouble(txtValorProd1.getText());
            this.conectar.fechaBanco();
        }
    }

    private void buscaColeiraTecido(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 54.10;

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
                txtValorProd2.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                txtQtdProd2.setText(Integer.toString(carrinho.getQuantidade()));
            }

            if (carrinho.getPreco() != preco) {
                txtValorProd2.setText("0.0");
                txtQtdProd2.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto osso!");
        } finally {
            total += Double.parseDouble(txtValorProd2.getText());
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            this.conectar.fechaBanco();
        }
    }

    private void buscaMordedor(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 24.90;

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
                txtValorProd3.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                txtQtdProd3.setText(Integer.toString(carrinho.getQuantidade()));
            }

            if (carrinho.getPreco() != preco) {
                txtValorProd3.setText("0.0");
                txtQtdProd3.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto shampoo!");
        } finally {
            total += Double.parseDouble(txtValorProd3.getText());
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            this.conectar.fechaBanco();
        }
    }

    private void buscaPetiscoCachorro(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 17.60;

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
                txtValorProd4.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                txtQtdProd4.setText(Integer.toString(carrinho.getQuantidade()));
            }

            if (carrinho.getPreco() != preco) {
                txtValorProd4.setText("0.0");
                txtQtdProd4.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto arranhador!");
        } finally {
            total += Double.parseDouble(txtValorProd4.getText());
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            this.conectar.fechaBanco();
        }
    }

    // GATOS
    private void buscaWhiskas(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 79.90;

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
                txtValorProd5.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                txtQtdProd5.setText(Integer.toString(carrinho.getQuantidade()));
            }

            if (carrinho.getPreco() != preco) {
                txtValorProd5.setText("0.0");
                txtQtdProd5.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar Produto: Ração Whiskas!");
        } finally {
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            total += Double.parseDouble(txtValorProd5.getText());
            this.conectar.fechaBanco();
        }
    }

    private void buscaColeira(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 29.90;

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
                txtValorProd6.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                txtQtdProd6.setText(Integer.toString(carrinho.getQuantidade()));
            }

            if (carrinho.getPreco() != preco) {
                txtValorProd6.setText("0.0");
                txtQtdProd6.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto osso!");
        } finally {
            total += Double.parseDouble(txtValorProd6.getText());
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            this.conectar.fechaBanco();
        }
    }

    private void buscaPeteca(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 35.40;

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
                txtValorProd7.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                txtQtdProd7.setText(Integer.toString(carrinho.getQuantidade()));
            }

            if (carrinho.getPreco() != preco) {
                txtValorProd7.setText("0.0");
                txtQtdProd7.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto shampoo!");
        } finally {
            total += Double.parseDouble(txtValorProd7.getText());
            valorGasto.setText(Double.toString(Math.round(total * 100.0) / 100.0));
            this.conectar.fechaBanco();
        }
    }

    private void buscaPetisco(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        double preco = 14.90;

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
                txtValorProd8.setText(Double.toString(Math.round(carrinho.getPreco() * carrinho.getQuantidade() * 100.0) / 100.0));
                txtQtdProd8.setText(Integer.toString(carrinho.getQuantidade()));
            }

            if (carrinho.getPreco() != preco) {
                txtValorProd8.setText("0.0");
                txtQtdProd8.setText("0");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto!" + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao buscar produto arranhador!");
        } finally {
            total += Double.parseDouble(txtValorProd8.getText());
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

                txtValorProd1.setText("0.0");
                txtQtdProd1.setText("0");

                txtValorProd2.setText("0.0");
                txtQtdProd2.setText("0");

                txtValorProd3.setText("0.0");
                txtQtdProd3.setText("0");

                txtValorProd4.setText("0.0");
                txtQtdProd4.setText("0");

                txtValorProd5.setText("0.0");
                txtQtdProd5.setText("0");

                txtValorProd6.setText("0.0");
                txtQtdProd6.setText("0");

                txtValorProd7.setText("0.0");
                txtQtdProd7.setText("0");

                txtValorProd8.setText("0.0");
                txtQtdProd8.setText("0");

                valorGasto.setText("0.0");
            }
        } catch (Exception e) {
            System.out.println("[ERRO]: Não foi possível finalizar a compra! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "[ERRO]: Erro ao finalizar compra!");
        } finally {
            this.conectar.fechaBanco();
        }
    }

    public UICarrinho() {
        initComponents();
        // CAES
        buscaMagnus(carrinho);
        buscaColeiraTecido(carrinho);
        buscaMordedor(carrinho);
        buscaPetiscoCachorro(carrinho);

        // GATOS
        buscaWhiskas(carrinho);
        buscaColeira(carrinho);
        buscaPeteca(carrinho);
        buscaPetisco(carrinho);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnfechar = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtQtdCao5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtValorProd1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValorProd2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtValorProd3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtValorProd4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtValorProd5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtValorProd6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtValorProd7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtValorProd8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        valorGasto = new javax.swing.JLabel();
        btnFinaliza = new com.k33ptoo.components.KButton();
        txtQtdProd1 = new javax.swing.JTextField();
        txtQtdProd2 = new javax.swing.JTextField();
        txtQtdProd3 = new javax.swing.JTextField();
        txtQtdProd4 = new javax.swing.JTextField();
        txtQtdProd5 = new javax.swing.JTextField();
        txtQtdProd6 = new javax.swing.JTextField();
        txtQtdProd7 = new javax.swing.JTextField();
        txtQtdProd8 = new javax.swing.JTextField();
        valorGasto1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/sublogo_-_petshop__2___1_-removebg-preview.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 150, 0));
        jLabel12.setText("CARRINHO");

        btnfechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/red-x-icon (1).png"))); // NOI18N
        btnfechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnfechar)
                .addGap(239, 239, 239)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(34, 34, 34))
        );

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Qtd:");

        txtQtdCao5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQtdCao5.setText("1");
        txtQtdCao5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(238, 238, 238)));
        txtQtdCao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdCao5ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(250, 150, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUTO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VALOR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUANTIDADE");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 56));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Ração Magnus Original Premium - Cães Filhotes 10KG");

        txtValorProd1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtValorProd1.setText("0.0");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Coleira de Cachorro com Identificação em Papel - Tecido Macio Vermelho Liso");

        txtValorProd2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtValorProd2.setText("0.0");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Mordedor Halteres com espinhos de plástico");

        txtValorProd3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtValorProd3.setText("0.0");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Petisco Biscrok Pedigree adulto raças pequenas - 500g");

        txtValorProd4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtValorProd4.setText("0.0");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setText("Ração Whiskas 1+ Anos Frango e Leite - 3KG");

        txtValorProd5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtValorProd5.setText("0.0");

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setText("Coleira para Gatos com Guizo vermelha - Tam. P");

        txtValorProd6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtValorProd6.setText("0.0");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel25.setText("Peteca com Penas  e Fios para Gatos com Sizal");

        txtValorProd7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtValorProd7.setText("0.0");

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel28.setText("Petisco Dreamies Recheado para Gatos Frango - 500g");

        txtValorProd8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtValorProd8.setText("0.0");

        jLabel31.setBackground(new java.awt.Color(250, 150, 0));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(250, 150, 0));
        jLabel31.setText("TOTAL:");

        valorGasto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        valorGasto.setForeground(new java.awt.Color(250, 150, 0));
        valorGasto.setText("00,00");

        btnFinaliza.setBorder(null);
        btnFinaliza.setText("FINALIZAR PEDIDO");
        btnFinaliza.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        btnFinaliza.setkBackGroundColor(new java.awt.Color(0, 204, 0));
        btnFinaliza.setkBorderRadius(15);
        btnFinaliza.setkEndColor(new java.awt.Color(0, 102, 102));
        btnFinaliza.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnFinaliza.setkHoverStartColor(new java.awt.Color(0, 153, 0));
        btnFinaliza.setkPressedColor(new java.awt.Color(51, 153, 0));
        btnFinaliza.setkSelectedColor(new java.awt.Color(0, 153, 0));
        btnFinaliza.setkStartColor(new java.awt.Color(153, 255, 102));
        btnFinaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizaActionPerformed(evt);
            }
        });

        txtQtdProd1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtQtdProd1.setText("0");
        txtQtdProd1.setBorder(null);

        txtQtdProd2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtQtdProd2.setText("0");
        txtQtdProd2.setBorder(null);

        txtQtdProd3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtQtdProd3.setText("0");
        txtQtdProd3.setBorder(null);

        txtQtdProd4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtQtdProd4.setText("0");
        txtQtdProd4.setBorder(null);

        txtQtdProd5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtQtdProd5.setText("0");
        txtQtdProd5.setBorder(null);

        txtQtdProd6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtQtdProd6.setText("0");
        txtQtdProd6.setBorder(null);

        txtQtdProd7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtQtdProd7.setText("0");
        txtQtdProd7.setBorder(null);

        txtQtdProd8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtQtdProd8.setText("0");
        txtQtdProd8.setBorder(null);

        valorGasto1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        valorGasto1.setForeground(new java.awt.Color(250, 150, 0));
        valorGasto1.setText("R$");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(49, 49, 49)
                .addComponent(txtQtdCao5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtdProd8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtdProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtdProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtdProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtdProd4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtdProd5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtdProd6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQtdProd7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(160, 160, 160)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValorProd2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtValorProd7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorProd8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorProd6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorProd5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorProd4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorProd3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorProd1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorGasto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(txtQtdCao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorProd1)
                    .addComponent(txtQtdProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtValorProd2)
                    .addComponent(txtQtdProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtValorProd3)
                    .addComponent(txtQtdProd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtValorProd4)
                    .addComponent(txtQtdProd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtValorProd5)
                    .addComponent(txtQtdProd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtValorProd6)
                    .addComponent(txtQtdProd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtValorProd7)
                    .addComponent(txtQtdProd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtValorProd8)
                    .addComponent(txtQtdProd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valorGasto)
                        .addComponent(valorGasto1))
                    .addComponent(btnFinaliza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdCao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdCao5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdCao5ActionPerformed

    private void btnfecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnfecharMouseClicked

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
            java.util.logging.Logger.getLogger(UICarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UICarrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnFinaliza;
    private javax.swing.JLabel btnfechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtQtdCao5;
    private javax.swing.JTextField txtQtdProd1;
    private javax.swing.JTextField txtQtdProd2;
    private javax.swing.JTextField txtQtdProd3;
    private javax.swing.JTextField txtQtdProd4;
    private javax.swing.JTextField txtQtdProd5;
    private javax.swing.JTextField txtQtdProd6;
    private javax.swing.JTextField txtQtdProd7;
    private javax.swing.JTextField txtQtdProd8;
    private javax.swing.JLabel txtValorProd1;
    private javax.swing.JLabel txtValorProd2;
    private javax.swing.JLabel txtValorProd3;
    private javax.swing.JLabel txtValorProd4;
    private javax.swing.JLabel txtValorProd5;
    private javax.swing.JLabel txtValorProd6;
    private javax.swing.JLabel txtValorProd7;
    private javax.swing.JLabel txtValorProd8;
    private javax.swing.JLabel valorGasto;
    private javax.swing.JLabel valorGasto1;
    // End of variables declaration//GEN-END:variables
}
