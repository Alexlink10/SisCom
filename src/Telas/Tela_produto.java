/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controle.Produto;
import dao.ProdutoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author israe
 */
public class Tela_produto extends javax.swing.JFrame {

    /**
     * Creates new form Tela_produto
     */
    public Tela_produto() {
        initComponents();
        listaAuto();
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
        jTextField_referencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_modelo = new javax.swing.JTextField();
        jComboBox_tamanho = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_quantidade = new javax.swing.JTextField();
        jTextField_Compra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_venda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_marca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_cor = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnLimparCampos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton_localizar = new javax.swing.JButton();
        jButton_editar = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jButton_salvar = new javax.swing.JButton();
        jButton_sair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Produtos");

        jLabel1.setText("Referencia:");

        jTextField_referencia.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("Modelo:");

        jTextField_modelo.setBackground(new java.awt.Color(255, 255, 204));

        jComboBox_tamanho.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox_tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "16", "17", "18", "19", "20", "21", "22", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48" }));

        jLabel3.setText("Tamanho:");

        jLabel4.setText("Quantid:");

        jTextField_quantidade.setBackground(new java.awt.Color(255, 255, 204));

        jTextField_Compra.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setText("Val. Compra:");

        jLabel6.setText("Val.Venda:");

        jTextField_venda.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setText("Marca:");

        jTextField_marca.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setText("Cor:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel9.setText("Campos obrigatorios");

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_quantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jTextField_modelo))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_marca)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_cor)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_referencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnLimparCampos))
                .addContainerGap())
        );

        jButton_localizar.setText("Localizar");
        jButton_localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_localizarActionPerformed(evt);
            }
        });

        jButton_editar.setText("Editar");
        jButton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editarActionPerformed(evt);
            }
        });

        jButton_excluir.setText("Excluir");
        jButton_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluirActionPerformed(evt);
            }
        });

        jButton_salvar.setText("Salvar");
        jButton_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvarActionPerformed(evt);
            }
        });

        jButton_sair.setText("Sair");
        jButton_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton_localizar)
                .addGap(73, 73, 73)
                .addComponent(jButton_editar)
                .addGap(62, 62, 62)
                .addComponent(jButton_excluir)
                .addGap(61, 61, 61)
                .addComponent(jButton_salvar)
                .addGap(64, 64, 64)
                .addComponent(jButton_sair)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_localizar)
                    .addComponent(jButton_editar)
                    .addComponent(jButton_excluir)
                    .addComponent(jButton_salvar)
                    .addComponent(jButton_sair))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Referencia", "Modelo", "Marca", "Tamanho", "Quantidade", "Cor", "Valor Compra", "Valor Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.getTableHeader().setReorderingAllowed(false);
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        tabelaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaProdutoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(0).setMinWidth(40);
            tabelaProduto.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(838, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sairActionPerformed
                    
        Principal tela_princi = new Principal();
        tela_princi.setExtendedState(Principal.MAXIMIZED_BOTH);
        tela_princi.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_sairActionPerformed

    public void limparcampos(){
    
        jTextField_referencia.setText("");
        jTextField_marca.setText("");
        jTextField_cor.setText("");
        jTextField_modelo.setText("");
        jComboBox_tamanho.setSelectedItem("");
        jTextField_quantidade.setText("");
        jTextField_Compra.setText("");
        jTextField_venda.setText("");
        jTextField_referencia.requestFocus();
        
    }
   
    private void jButton_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvarActionPerformed
         
       
        Produto novop = new Produto();
        
        novop.setReferencia(Integer.parseInt(jTextField_referencia.getText()));
        novop.setModelo(jTextField_modelo.getText());
        novop.setMarca(jTextField_marca.getText());
        novop.setTamanho(Integer.parseInt((String) jComboBox_tamanho.getSelectedItem()));
        novop.setQuantidade(Integer.parseInt(jTextField_quantidade.getText()));
        novop.setCor(jTextField_cor.getText());
        novop.setValor_compra(Double.parseDouble(jTextField_Compra.getText()));
        novop.setValor_venda(Double.parseDouble(jTextField_venda.getText()));
        
        ProdutoDao pd = new ProdutoDao();
        
        boolean v = pd.campoEmBranco(novop);
        
        if(v == true && novop.getValor_compra()!= 0 && novop.getValor_venda()!= 0){
            pd.salvar(novop);
            limparcampos();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
                
        }
        
        
        
        listaAuto();
        
    }//GEN-LAST:event_jButton_salvarActionPerformed

    private void jButton_localizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_localizarActionPerformed
        
        ProdutoDao ppd = new ProdutoDao();
        
        List <Produto> produto = ppd.listarProduto();
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id_produto");
        modelo.addColumn("referencia");
        modelo.addColumn("modelo");
        modelo.addColumn("marca");
        modelo.addColumn("tamanho");
        modelo.addColumn("quantidade");
        modelo.addColumn("cor");
        modelo.addColumn("valor_compra");
        modelo.addColumn("valor_venda");
        
        Object rowData[] = new Object[9];
        for(int i=0; i<produto.size();i++){
            
            rowData[0] = produto.get(i).getId_produto();
            rowData[1] = produto.get(i).getReferencia();
            rowData[2] = produto.get(i).getModelo();
            rowData[3] = produto.get(i).getMarca();
            rowData[4] = produto.get(i).getTamanho();
            rowData[5] = produto.get(i).getQuantidade();
            rowData[6] = produto.get(i).getCor();
            rowData[7] = produto.get(i).getValor_compra();
            rowData[8] = produto.get(i).getValor_venda();
            
            modelo.addRow(rowData);
        }
        
        tabelaProduto.setModel(modelo);
        
    }//GEN-LAST:event_jButton_localizarActionPerformed

    private void jButton_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluirActionPerformed
        
        int linha = tabelaProduto.getSelectedRow();
        
        if (linha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto para poder excluí-lo!");
        }
                                                                                                            //linha, coluna.
        //Especificando para pegar um dado da linha selecionada com o clik do mouse, na coluna 0. getValueAt(linha, 0).
        String referencia = tabelaProduto.getModel().getValueAt(linha, 0).toString();
        
        ProdutoDao pd = new ProdutoDao();
        
        if(pd.excluir(referencia) == true){
            pd.excluir(referencia);
            limparcampos();
            JOptionPane.showMessageDialog(null, "Produto de referencia " + referencia + " excluído com sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir produto de referencia " + referencia + " !");
        }
        
        
        listaAuto();
        
    }//GEN-LAST:event_jButton_excluirActionPerformed

    
    public void listaAuto(){
    
        ProdutoDao pd = new ProdutoDao();
        List <Produto> produtos = pd.listarProduto();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id_produto");
        modelo.addColumn("referencia");
        modelo.addColumn("modelo");
        modelo.addColumn("marca");
        modelo.addColumn("tamanho");
        modelo.addColumn("quantidade");
        modelo.addColumn("cor");
        modelo.addColumn("valor_compra");
        modelo.addColumn("valor_venda");
        
        Object rowData[] = new Object[9];
        for(int i=0; i<produtos.size();i++){
            
            rowData[0] = produtos.get(i).getId_produto();
            rowData[1] = produtos.get(i).getReferencia();
            rowData[2] = produtos.get(i).getModelo();
            rowData[3] = produtos.get(i).getMarca();
            rowData[4] = produtos.get(i).getTamanho();
            rowData[5] = produtos.get(i).getQuantidade();
            rowData[6] = produtos.get(i).getCor();
            rowData[7] = produtos.get(i).getValor_compra();
            rowData[8] = produtos.get(i).getValor_venda();
            
            modelo.addRow(rowData);
        }
        
        tabelaProduto.setModel(modelo);
    
    }
    
    private void jButton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editarActionPerformed
        
        int linha = tabelaProduto.getSelectedRow();
        
        if (linha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um produto para poder editá-lo!");
        }
        
        String id = tabelaProduto.getModel().getValueAt(linha, 0).toString();
        
        Produto produto = new Produto();
        
        
        produto.setReferencia(Integer.parseInt(jTextField_referencia.getText()));
        produto.setModelo(jTextField_modelo.getText());
        produto.setMarca(jTextField_marca.getText());
        produto.setTamanho(Integer.parseInt((String) jComboBox_tamanho.getSelectedItem()));
        produto.setQuantidade(Integer.parseInt(jTextField_quantidade.getText()));
        produto.setCor(jTextField_cor.getText());
        produto.setValor_compra(Double.parseDouble(jTextField_Compra.getText()));
        produto.setValor_venda(Double.parseDouble(jTextField_venda.getText()));
        produto.setId_produto(Integer.parseInt(id));
        
        ProdutoDao pd = new ProdutoDao();
        pd.editar(produto);
       
        limparcampos();
        listaAuto();
      
        JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
        
    }//GEN-LAST:event_jButton_editarActionPerformed

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        
        carregarTabela();
        
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparcampos();
        
    }//GEN-LAST:event_btnLimparCamposActionPerformed

       public void carregarTabela(){
         
        int linha = tabelaProduto.getSelectedRow();
        String id = tabelaProduto.getModel().getValueAt(linha, 0).toString();
        String referencia = tabelaProduto.getModel().getValueAt(linha, 1).toString();
        String modelo = tabelaProduto.getModel().getValueAt(linha, 2).toString();
        String marca = tabelaProduto.getModel().getValueAt(linha, 3).toString();
        String tamanho = tabelaProduto.getModel().getValueAt(linha, 4).toString();
        String quantidade = tabelaProduto.getModel().getValueAt(linha, 5).toString();
        String cor = tabelaProduto.getModel().getValueAt(linha, 6).toString();
        String valorCompra = tabelaProduto.getModel().getValueAt(linha, 7).toString();
        String valorVenda = tabelaProduto.getModel().getValueAt(linha, 8).toString();
        
        jTextField_referencia.setText(referencia);
        jTextField_modelo.setText(modelo);
        jTextField_marca.setText(marca);
        jComboBox_tamanho.setSelectedItem(tamanho);
        jTextField_quantidade.setText(quantidade);
        jTextField_cor.setText(cor);
        jTextField_Compra.setText(valorCompra);
        jTextField_venda.setText(valorVenda);
         
     }
    
    private void tabelaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaProdutoKeyReleased
        
        carregarTabela();
        
    }//GEN-LAST:event_tabelaProdutoKeyReleased

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
            java.util.logging.Logger.getLogger(Tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton jButton_editar;
    private javax.swing.JButton jButton_excluir;
    private javax.swing.JButton jButton_localizar;
    private javax.swing.JButton jButton_sair;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JComboBox<String> jComboBox_tamanho;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_Compra;
    private javax.swing.JTextField jTextField_cor;
    private javax.swing.JTextField jTextField_marca;
    private javax.swing.JTextField jTextField_modelo;
    private javax.swing.JTextField jTextField_quantidade;
    private javax.swing.JTextField jTextField_referencia;
    private javax.swing.JTextField jTextField_venda;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
