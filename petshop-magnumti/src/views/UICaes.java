package views;

import conexoes.MySQL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.AdicionaCarrinho;

public class UICaes extends javax.swing.JFrame {

    MySQL conectar = new MySQL();
    AdicionaCarrinho carrinho = new AdicionaCarrinho();

    int qtd_magnus = 1;

    public void cadastraMagnus(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        carrinho.setNome(txtProdCao1.getText());
        carrinho.setPreco(Double.parseDouble(txtPrecoCao1.getText()));

        carrinho.setQuantidade(qtd_magnus++);

        try {
            this.conectar.insertSQL(
                    "INSERT INTO carrinho VALUES ("
                    + "'" + carrinho.getId() + "',"
                    + "'" + carrinho.getNome() + "',"
                    + "'" + carrinho.getPreco() + "',"
                    + "'" + carrinho.getQuantidade() + "'"
                    + ");");
            JOptionPane.showMessageDialog(null, "[OK]: Item adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("[ERRO]: Não foi possível adicionar o item ao carrinho! " + e.getMessage());
        } finally {
            this.conectar.fechaBanco();
        }
    }

    int qtd_coleira = 1;

    public void cadastraColeira(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        carrinho.setNome(txtProdCao2.getText());
        carrinho.setPreco(Double.parseDouble(txtPrecoCao2.getText()));

        carrinho.setQuantidade(qtd_coleira++);

        try {
            this.conectar.insertSQL(
                    "INSERT INTO carrinho VALUES ("
                    + "'" + carrinho.getId() + "',"
                    + "'" + carrinho.getNome() + "',"
                    + "'" + carrinho.getPreco() + "',"
                    + "'" + carrinho.getQuantidade() + "'"
                    + ");");
            JOptionPane.showMessageDialog(null, "[OK]: Item adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("[ERRO]: Não foi possível adicionar o item ao carrinho! " + e.getMessage());
        } finally {
            this.conectar.fechaBanco();
        }
    }

    int qtd_mordedor = 1;

    public void cadastraMordedor(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        carrinho.setNome(txtProdCao3.getText());
        carrinho.setPreco(Double.parseDouble(txtPrecoCao3.getText()));

        carrinho.setQuantidade(qtd_mordedor++);

        try {
            this.conectar.insertSQL(
                    "INSERT INTO carrinho VALUES ("
                    + "'" + carrinho.getId() + "',"
                    + "'" + carrinho.getNome() + "',"
                    + "'" + carrinho.getPreco() + "',"
                    + "'" + carrinho.getQuantidade() + "'"
                    + ");");
            JOptionPane.showMessageDialog(null, "[OK]: Item adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("[ERRO]: Não foi possível adicionar o item ao carrinho! " + e.getMessage());
        } finally {
            this.conectar.fechaBanco();
        }
    }

    int qtd_petisco = 1;

    public void cadastraPetisco(AdicionaCarrinho carrinho) {
        this.conectar.conectaBanco();

        carrinho.setNome(txtProdCao4.getText());
        carrinho.setPreco(Double.parseDouble(txtPrecoCao4.getText()));

        carrinho.setQuantidade(qtd_petisco++);

        try {
            this.conectar.insertSQL(
                    "INSERT INTO carrinho VALUES ("
                    + "'" + carrinho.getId() + "',"
                    + "'" + carrinho.getNome() + "',"
                    + "'" + carrinho.getPreco() + "',"
                    + "'" + carrinho.getQuantidade() + "'"
                    + ");");
            JOptionPane.showMessageDialog(null, "[OK]: Item adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("[ERRO]: Não foi possível adicionar o item ao carrinho! " + e.getMessage());
        } finally {
            this.conectar.fechaBanco();
        }
    }

    public UICaes() {
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
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnCarrinhoCao4 = new com.k33ptoo.components.KButton();
        btnCarrinhoCao1 = new com.k33ptoo.components.KButton();
        btnCarrinhoCao2 = new com.k33ptoo.components.KButton();
        btnCarrinhoCao3 = new com.k33ptoo.components.KButton();
        txtProdCao1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cifrao1 = new javax.swing.JLabel();
        txtProdCao2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cifrao2 = new javax.swing.JLabel();
        txtProdCao3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cifrao3 = new javax.swing.JLabel();
        txtProdCao4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cifrao4 = new javax.swing.JLabel();
        txtPrecoCao1 = new javax.swing.JLabel();
        txtPrecoCao2 = new javax.swing.JLabel();
        txtPrecoCao3 = new javax.swing.JLabel();
        txtPrecoCao4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnfechar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(250, 150, 0));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(64, 37, 22));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html>\nSeu pet também é <br> o nosso MELHOR ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(212, 115, 56));
        jLabel7.setText("AMIGO !");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cachorro-modelo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/prod_cao_2.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/prod_cao_1.png"))); // NOI18N
        jLabel8.setText("jLabel6");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/prod_cao_4.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/prod_cao_3.png"))); // NOI18N

        btnCarrinhoCao4.setBorder(null);
        btnCarrinhoCao4.setForeground(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao4.setText("+ Carrinho");
        btnCarrinhoCao4.setToolTipText("");
        btnCarrinhoCao4.setBorderPainted(false);
        btnCarrinhoCao4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrinhoCao4.setkBackGroundColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao4.setkBorderRadius(30);
        btnCarrinhoCao4.setkEndColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao4.setkForeGround(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao4.setkHoverEndColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao4.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao4.setkHoverStartColor(new java.awt.Color(242, 104, 53));
        btnCarrinhoCao4.setkPressedColor(new java.awt.Color(255, 153, 0));
        btnCarrinhoCao4.setkSelectedColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao4.setkStartColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoCao4ActionPerformed(evt);
            }
        });

        btnCarrinhoCao1.setBorder(null);
        btnCarrinhoCao1.setForeground(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao1.setText("+ Carrinho");
        btnCarrinhoCao1.setToolTipText("");
        btnCarrinhoCao1.setBorderPainted(false);
        btnCarrinhoCao1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrinhoCao1.setkBackGroundColor(new java.awt.Color(242, 104, 53));
        btnCarrinhoCao1.setkBorderRadius(30);
        btnCarrinhoCao1.setkEndColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao1.setkForeGround(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao1.setkHoverEndColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao1.setkHoverStartColor(new java.awt.Color(242, 104, 53));
        btnCarrinhoCao1.setkPressedColor(new java.awt.Color(255, 153, 0));
        btnCarrinhoCao1.setkSelectedColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao1.setkStartColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoCao1ActionPerformed(evt);
            }
        });

        btnCarrinhoCao2.setBorder(null);
        btnCarrinhoCao2.setForeground(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao2.setText("+ Carrinho");
        btnCarrinhoCao2.setToolTipText("");
        btnCarrinhoCao2.setBorderPainted(false);
        btnCarrinhoCao2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrinhoCao2.setkBackGroundColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao2.setkBorderRadius(30);
        btnCarrinhoCao2.setkEndColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao2.setkForeGround(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao2.setkHoverEndColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao2.setkHoverStartColor(new java.awt.Color(242, 104, 53));
        btnCarrinhoCao2.setkPressedColor(new java.awt.Color(255, 153, 0));
        btnCarrinhoCao2.setkSelectedColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao2.setkStartColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoCao2ActionPerformed(evt);
            }
        });

        btnCarrinhoCao3.setBorder(null);
        btnCarrinhoCao3.setForeground(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao3.setText("+ Carrinho");
        btnCarrinhoCao3.setToolTipText("");
        btnCarrinhoCao3.setBorderPainted(false);
        btnCarrinhoCao3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarrinhoCao3.setkBackGroundColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao3.setkBorderRadius(30);
        btnCarrinhoCao3.setkEndColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao3.setkForeGround(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao3.setkHoverEndColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao3.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnCarrinhoCao3.setkHoverStartColor(new java.awt.Color(242, 104, 53));
        btnCarrinhoCao3.setkPressedColor(new java.awt.Color(255, 153, 0));
        btnCarrinhoCao3.setkSelectedColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao3.setkStartColor(new java.awt.Color(250, 150, 0));
        btnCarrinhoCao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoCao3ActionPerformed(evt);
            }
        });

        txtProdCao1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtProdCao1.setText("<html>\nRação Magnus Original Premium - Cães <br> Filhotes 10kg");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(166, 166, 166));
        jLabel16.setText("Cachorros");

        cifrao1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cifrao1.setForeground(new java.awt.Color(68, 78, 67));
        cifrao1.setText("R$ ");

        txtProdCao2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtProdCao2.setText("<html> Coleira de Cachorro com Identificação em <br> Papel - Tecido Macio Vermelho Liso");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(166, 166, 166));
        jLabel17.setText("Cachorros");

        cifrao2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cifrao2.setForeground(new java.awt.Color(68, 78, 67));
        cifrao2.setText("R$ ");

        txtProdCao3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtProdCao3.setText("<html> Mordedor Halteres com espinhos de <br> plástico");

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(166, 166, 166));
        jLabel26.setText("Cachorros");

        cifrao3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cifrao3.setForeground(new java.awt.Color(68, 78, 67));
        cifrao3.setText("R$");

        txtProdCao4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtProdCao4.setText("<html> Petisco Biscrok Pedigree adulto raças <br> pequenas - 500g");

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(166, 166, 166));
        jLabel29.setText("Cachorros");

        cifrao4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cifrao4.setForeground(new java.awt.Color(68, 78, 67));
        cifrao4.setText("R$");

        txtPrecoCao1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtPrecoCao1.setForeground(new java.awt.Color(68, 78, 67));
        txtPrecoCao1.setText("89.90");

        txtPrecoCao2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtPrecoCao2.setForeground(new java.awt.Color(68, 78, 67));
        txtPrecoCao2.setText("54.10");

        txtPrecoCao3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtPrecoCao3.setForeground(new java.awt.Color(68, 78, 67));
        txtPrecoCao3.setText("24.90");

        txtPrecoCao4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtPrecoCao4.setForeground(new java.awt.Color(68, 78, 67));
        txtPrecoCao4.setText("17.60");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProdCao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cifrao1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecoCao1))))
                            .addComponent(txtProdCao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cifrao4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoCao4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnCarrinhoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(btnCarrinhoCao2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProdCao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cifrao2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoCao2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtProdCao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cifrao3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecoCao3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnCarrinhoCao3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnCarrinhoCao4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProdCao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cifrao1)
                            .addComponent(txtPrecoCao1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProdCao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cifrao3)
                                    .addComponent(txtPrecoCao3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProdCao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cifrao2)
                                    .addComponent(txtPrecoCao2))))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCarrinhoCao1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCarrinhoCao2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCarrinhoCao3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdCao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cifrao4)
                    .addComponent(txtPrecoCao4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarrinhoCao4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(550, 550, 550)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel7))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/sublogo_-_petshop__2___1_-removebg-preview.png"))); // NOI18N

        btnfechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/red-x-icon (1).png"))); // NOI18N
        btnfechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfecharMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 150, 0));
        jLabel12.setText("CÃES");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/carrinho-icon (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnfechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(579, 579, 579)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnfechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)))
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void btnfecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfecharMouseClicked
        this.dispose();

        UIHomepage telaHome = new UIHomepage();
        telaHome.setVisible(true);
    }//GEN-LAST:event_btnfecharMouseClicked

    private void btnCarrinhoCao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoCao4ActionPerformed
        btnCarrinhoCao4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastraPetisco(carrinho);
            }
        });
    }//GEN-LAST:event_btnCarrinhoCao4ActionPerformed

    private void btnCarrinhoCao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoCao1ActionPerformed
        btnCarrinhoCao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastraMagnus(carrinho);
            }
        });
    }//GEN-LAST:event_btnCarrinhoCao1ActionPerformed

    private void btnCarrinhoCao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoCao2ActionPerformed
        btnCarrinhoCao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastraColeira(carrinho);
            }
        });
    }//GEN-LAST:event_btnCarrinhoCao2ActionPerformed

    private void btnCarrinhoCao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoCao3ActionPerformed
        btnCarrinhoCao3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastraMordedor(carrinho);
            }
        });
    }//GEN-LAST:event_btnCarrinhoCao3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        UICarrinho telaCarrinho = new UICarrinho();
        telaCarrinho.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(UICaes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICaes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICaes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICaes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new UICaes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCarrinhoCao1;
    private com.k33ptoo.components.KButton btnCarrinhoCao2;
    private com.k33ptoo.components.KButton btnCarrinhoCao3;
    private com.k33ptoo.components.KButton btnCarrinhoCao4;
    private javax.swing.JLabel btnfechar;
    private javax.swing.JLabel cifrao1;
    private javax.swing.JLabel cifrao2;
    private javax.swing.JLabel cifrao3;
    private javax.swing.JLabel cifrao4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel txtPrecoCao1;
    private javax.swing.JLabel txtPrecoCao2;
    private javax.swing.JLabel txtPrecoCao3;
    private javax.swing.JLabel txtPrecoCao4;
    private javax.swing.JLabel txtProdCao1;
    private javax.swing.JLabel txtProdCao2;
    private javax.swing.JLabel txtProdCao3;
    private javax.swing.JLabel txtProdCao4;
    // End of variables declaration//GEN-END:variables
}
