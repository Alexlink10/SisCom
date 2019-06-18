/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controle.Cliente;
import Controle.Produto;
import Controle.ProdutoJtablemodel;
import com.sun.media.sound.ModelOscillator;
import dao.ClienteDao;
import dao.ProdutoDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Alex
 */
public class Tela_venda extends javax.swing.JFrame {

    private Tabela_Cliente_Venda tabela_Cliente_Venda;
    private Tabela_Usuario_Venda tabela_usuario_vendas;
    private Tabela_Produto_venda tabela_Produto_venda;
    
    ProdutoJtablemodel tablemodel = new ProdutoJtablemodel();
    
    /**
     * Creates new form Tela_venda
     */
    public Tela_venda() {
        initComponents();
        this.tabela_Cliente_Venda = new Tabela_Cliente_Venda(this, rootPaneCheckingEnabled);
        this.tabela_usuario_vendas = new Tabela_Usuario_Venda(this,rootPaneCheckingEnabled);
        this.tabela_Produto_venda = new Tabela_Produto_venda(this, rootPaneCheckingEnabled);
        tabela_venda.setModel(tablemodel);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_vendedor = new javax.swing.JTextField();
        jButton_localizar_vendedor = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_venda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jl_data = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        jButton_localizar_cliente = new javax.swing.JButton();
        txt_cpf = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_rua = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_referencia = new javax.swing.JTextField();
        jButton_localizar_produto = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_estoque = new javax.swing.JTextField();
        jButton_inserir_produto = new javax.swing.JButton();
        jButton_excluir_produto = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_venda = new javax.swing.JTable();
        jButton_nova_venda = new javax.swing.JButton();
        jButton_registrar_venda = new javax.swing.JButton();
        jButton_excluir_venda = new javax.swing.JButton();
        jButton_imprimir_venda = new javax.swing.JButton();
        jButton_sair = new javax.swing.JButton();
        txt_total = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_itens_total = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Vendedor:");

        txt_vendedor.setBackground(new java.awt.Color(255, 255, 204));

        jButton_localizar_vendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa32b.png"))); // NOI18N
        jButton_localizar_vendedor.setText("Localizar");
        jButton_localizar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_localizar_vendedorActionPerformed(evt);
            }
        });

        jLabel11.setText("Venda:");

        txt_venda.setEditable(false);
        txt_venda.setBackground(new java.awt.Color(255, 255, 204));
        txt_venda.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel12.setText("Data:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_localizar_vendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txt_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jl_data, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_data, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_localizar_vendedor)
                        .addComponent(jLabel11)
                        .addComponent(txt_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Cliente:");

        txt_cliente.setBackground(new java.awt.Color(255, 255, 204));

        jButton_localizar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa32b.png"))); // NOI18N
        jButton_localizar_cliente.setText("Localizar");
        jButton_localizar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_localizar_clienteActionPerformed(evt);
            }
        });

        txt_cpf.setEditable(false);

        txt_telefone.setEditable(false);

        txt_email.setEditable(false);

        txt_rua.setEditable(false);

        txt_numero.setEditable(false);

        txt_bairro.setEditable(false);

        txt_cidade.setEditable(false);

        txt_estado.setEditable(false);

        jLabel9.setText("Estado:");

        jLabel6.setText("Num:");

        jLabel4.setText("E-mail:");

        jLabel3.setText("Telefone:");

        jLabel8.setText("Cidade:");

        jLabel7.setText("Bairro:");

        jLabel5.setText("Rua:");

        jLabel10.setText("CPF:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_localizar_cliente))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_localizar_cliente))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel14.setText("Referencia:");

        jButton_localizar_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa32b.png"))); // NOI18N
        jButton_localizar_produto.setText("Localizar");
        jButton_localizar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_localizar_produtoActionPerformed(evt);
            }
        });

        jLabel15.setText("Quantidade:");

        jLabel16.setText("Estoque Atual:");

        txt_estoque.setEditable(false);

        jButton_inserir_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/registrar venda32b.png"))); // NOI18N
        jButton_inserir_produto.setText("Inserir Produto");
        jButton_inserir_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_inserir_produtoActionPerformed(evt);
            }
        });

        jButton_excluir_produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excuir ven32.png"))); // NOI18N
        jButton_excluir_produto.setText("Excluir Produto");
        jButton_excluir_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluir_produtoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_localizar_produto)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_inserir_produto)
                .addGap(102, 102, 102)
                .addComponent(jButton_excluir_produto)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_localizar_produto)
                    .addComponent(jLabel15)
                    .addComponent(txt_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_inserir_produto)
                    .addComponent(jButton_excluir_produto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabela_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Referencia", "Modelo", "Marca", "Tamanho", "Quantidade", "Cor", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_venda);

        jButton_nova_venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nova venda32b.png"))); // NOI18N
        jButton_nova_venda.setText("Nova Venda");

        jButton_registrar_venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/registrar venda32b.png"))); // NOI18N
        jButton_registrar_venda.setText("Registrar Venda");

        jButton_excluir_venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excuir ven32.png"))); // NOI18N
        jButton_excluir_venda.setText("Excluir Venda");

        jButton_imprimir_venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imprimir32b.png"))); // NOI18N
        jButton_imprimir_venda.setText("Imprimir Venda");

        jButton_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Delete32b.png"))); // NOI18N
        jButton_sair.setText("Sair");
        jButton_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sairActionPerformed(evt);
            }
        });

        txt_total.setBackground(new java.awt.Color(255, 255, 204));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel17.setText("TOTAL");

        jLabel13.setText("Itens Total");

        txt_itens_total.setEditable(false);
        txt_itens_total.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton_nova_venda)
                .addGap(39, 39, 39)
                .addComponent(jButton_registrar_venda)
                .addGap(44, 44, 44)
                .addComponent(jButton_excluir_venda)
                .addGap(44, 44, 44)
                .addComponent(jButton_imprimir_venda)
                .addGap(38, 38, 38)
                .addComponent(jButton_sair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(txt_itens_total, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_itens_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_nova_venda)
                        .addComponent(jButton_registrar_venda)
                        .addComponent(jButton_excluir_venda)
                        .addComponent(jButton_imprimir_venda)
                        .addComponent(jButton_sair))
                    .addComponent(txt_total, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        jMenu1.setText("Arquivos");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1274, 958));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sairActionPerformed
       
        Principal telaPrincipal = new Principal();
        telaPrincipal.setExtendedState(Principal.MAXIMIZED_BOTH);
        telaPrincipal.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton_sairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        Date datasistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jl_data.setText(formato.format(datasistema));
    }//GEN-LAST:event_formWindowOpened

    private void jButton_localizar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_localizar_vendedorActionPerformed
        
        this.tabela_usuario_vendas.setVisible(true);
        this.txt_vendedor.setText(String.valueOf(this.tabela_usuario_vendas.getNome()));
        
    }//GEN-LAST:event_jButton_localizar_vendedorActionPerformed
 
    private void jButton_localizar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_localizar_clienteActionPerformed
        
        
        this.tabela_Cliente_Venda.setVisible(true);
        this.txt_cliente.setText(String.valueOf(this.tabela_Cliente_Venda.getNome()));
        this.txt_cpf.setText(String.valueOf(this.tabela_Cliente_Venda.getCpf()));
        this.txt_telefone.setText(String.valueOf(this.tabela_Cliente_Venda.getTelefone()));
        this.txt_email.setText(String.valueOf(this.tabela_Cliente_Venda.getEmail()));
        this.txt_rua.setText(String.valueOf(this.tabela_Cliente_Venda.getRua()));
        this.txt_numero.setText(String.valueOf(this.tabela_Cliente_Venda.getNumero()));
        this.txt_bairro.setText(String.valueOf(this.tabela_Cliente_Venda.getBairro()));
        this.txt_cidade.setText(String.valueOf(this.tabela_Cliente_Venda.getCidade()));
        this.txt_estado.setText(String.valueOf(this.tabela_Cliente_Venda.getEstado()));
         
        
    }//GEN-LAST:event_jButton_localizar_clienteActionPerformed

    private void jButton_localizar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_localizar_produtoActionPerformed
        
       
        this.tabela_Produto_venda.setVisible(true);
        // Produto p = new Produto();
       
          
        //System.err.println("teste ok");
       
    }//GEN-LAST:event_jButton_localizar_produtoActionPerformed

    private void jButton_inserir_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_inserir_produtoActionPerformed

        Produto p = new Produto();
       
        p.setReferencia(tabela_Produto_venda.getReferencia());
        p.setModelo(tabela_Produto_venda.getModelo());
        p.setMarca(tabela_Produto_venda.getMarca());
        p.setTamanho(tabela_Produto_venda.getTamanho());
        p.setQuantidade(Integer.parseInt(txt_quantidade.getText()));
        p.setCor((tabela_Produto_venda.getCor()));
        p.setValor_venda(tabela_Produto_venda.getValor_venda());
               
        tablemodel.addlinha(p);


    }//GEN-LAST:event_jButton_inserir_produtoActionPerformed

    private void jButton_excluir_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluir_produtoActionPerformed

       if(tabela_venda.getSelectedRow() != -1){
           
           tablemodel.removlinha(tabela_venda.getSelectedRow());
      
       }
    }//GEN-LAST:event_jButton_excluir_produtoActionPerformed

      
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
            java.util.logging.Logger.getLogger(Tela_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_excluir_produto;
    private javax.swing.JButton jButton_excluir_venda;
    private javax.swing.JButton jButton_imprimir_venda;
    private javax.swing.JButton jButton_inserir_produto;
    private javax.swing.JButton jButton_localizar_cliente;
    private javax.swing.JButton jButton_localizar_produto;
    private javax.swing.JButton jButton_localizar_vendedor;
    private javax.swing.JButton jButton_nova_venda;
    private javax.swing.JButton jButton_registrar_venda;
    private javax.swing.JButton jButton_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_data;
    private javax.swing.JTable tabela_venda;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_estoque;
    private javax.swing.JTextField txt_itens_total;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_quantidade;
    private javax.swing.JTextField txt_referencia;
    private javax.swing.JTextField txt_rua;
    private javax.swing.JTextField txt_telefone;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_venda;
    private javax.swing.JTextField txt_vendedor;
    // End of variables declaration//GEN-END:variables
}