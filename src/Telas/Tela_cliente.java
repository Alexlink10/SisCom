/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Controle.Cliente;
import dao.ClienteDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class Tela_cliente extends javax.swing.JFrame {

    /**
     * Creates new form Tela_cliente
     */
    public Tela_cliente() {
        initComponents();
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
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        btnLocalizar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cliente");

        jLabel1.setText("Nome:");

        txtNome.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("CPF:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("E-mail:");

        txtEmail.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setText("Rua:");

        txtRua.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setText("Num:");

        txtNumero.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setText("Bairro:");

        txtBairro.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setText("Cidade:");

        txtCidade.setBackground(new java.awt.Color(255, 255, 204));

        jLabel9.setText("Estado:");

        txtEstado.setBackground(new java.awt.Color(255, 255, 204));

        txtCpf.setBackground(new java.awt.Color(255, 255, 204));

        txtTelefone.setBackground(new java.awt.Color(255, 255, 204));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel10.setText("Campos obrigatorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtRua)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Cliente", "Nome", "CPF", "Telefone", "E-mail", "Rua", "Número", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.getTableHeader().setReorderingAllowed(false);
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        tabelaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnLocalizar)
                .addGap(57, 57, 57)
                .addComponent(btnEditar)
                .addGap(58, 58, 58)
                .addComponent(btnExcluir)
                .addGap(71, 71, 71)
                .addComponent(btnSalvar)
                .addGap(61, 61, 61)
                .addComponent(btnSair)
                .addGap(82, 82, 82)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLocalizar)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir)
                            .addComponent(btnSair)
                            .addComponent(btnSalvar))
                        .addContainerGap())))
        );

        setSize(new java.awt.Dimension(788, 785));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limparcampos(){
    
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtNome.requestFocus();
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Cliente cliente = new Cliente();
        
        cliente.setNome(txtNome.getText());
        cliente.setCpf(txtCpf.getText());
        cliente.setTelefone(txtTelefone.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setRua(txtRua.getText());
        cliente.setNumero(txtNumero.getText());
        cliente.setBairro(txtBairro.getText());
        cliente.setCidade(txtCidade.getText());
        cliente.setEstado(txtEstado.getText());
        
        ClienteDao cd = new ClienteDao();
        
        boolean v = cd.campoEmBranco(cliente);
        
        /*String cpf = (txtCpf.getText());
        
        boolean cpfDB = cd.validarCpf(cpf);*/
        
        if(v==true){/*&& cpfDB==true*/
            cd.salvar(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado(a) com sucesso!");
            limparcampos();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Algum campo não foi preenchido ou CPF já cadastrado!\nTente novamente!");
        }  
        
        
        
        List<Cliente> clientes = cd.listarClientes();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        //referenciando as tabelas do DB, entre "", com as colunas da tabela, na ordem definida na tabela desta tela.
        
        modelo.addColumn("id_cliente");
        modelo.addColumn("nome");
        modelo.addColumn("cpf");
        modelo.addColumn("telefone");
        modelo.addColumn("email");
        modelo.addColumn("rua");
        modelo.addColumn("numero");
        modelo.addColumn("bairro");
        modelo.addColumn("cidade");
        modelo.addColumn("estado");
        
        Object rowData[] = new Object[10];
        
        System.out.println("Pesquisando clientes...");
        
        for(int i=0; i<clientes.size();i++){
            
            rowData[0] = clientes.get(i).getId_cliente();
            rowData[1] = clientes.get(i).getNome();
            rowData[2] = clientes.get(i).getCpf();
            rowData[3] = clientes.get(i).getTelefone();
            rowData[4] = clientes.get(i).getEmail();
            rowData[5] = clientes.get(i).getRua();
            rowData[6] = clientes.get(i).getNumero();
            rowData[7] = clientes.get(i).getBairro();
            rowData[8] = clientes.get(i).getCidade();
            rowData[9] = clientes.get(i).getEstado();
            
            modelo.addRow(rowData); 
        }
        //tabelaCliente é o nome da tabela na tela Tela_cliente.
        tabelaCliente.setModel(modelo);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Principal telaPrincipal = new Principal();
        telaPrincipal.setExtendedState(Principal.MAXIMIZED_BOTH);
        telaPrincipal.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        
        ClienteDao cd = new ClienteDao();
        
        List<Cliente> clientes = cd.listarClientes();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        //referenciando as tabelas do DB, entre "", com as colunas da tabela, na ordem definida na tabela desta tela.
        
        modelo.addColumn("id_cliente");
        modelo.addColumn("nome");
        modelo.addColumn("cpf");
        modelo.addColumn("telefone");
        modelo.addColumn("email");
        modelo.addColumn("rua");
        modelo.addColumn("numero");
        modelo.addColumn("bairro");
        modelo.addColumn("cidade");
        modelo.addColumn("estado");
        
        Object rowData[] = new Object[10];
        
        System.out.println("Pesquisando clientes...");
        
        for(int i=0; i<clientes.size();i++){
            
            rowData[0] = clientes.get(i).getId_cliente();
            rowData[1] = clientes.get(i).getNome();
            rowData[2] = clientes.get(i).getCpf();
            rowData[3] = clientes.get(i).getTelefone();
            rowData[4] = clientes.get(i).getEmail();
            rowData[5] = clientes.get(i).getRua();
            rowData[6] = clientes.get(i).getNumero();
            rowData[7] = clientes.get(i).getBairro();
            rowData[8] = clientes.get(i).getCidade();
            rowData[9] = clientes.get(i).getEstado();
            
            modelo.addRow(rowData); 
        }
        //tabelaCliente é o nome da tabela na tela Tela_cliente.
        tabelaCliente.setModel(modelo);
        System.out.println("Clientes adicionados à tabelaCliente");
        
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       
       Cliente cliente = new Cliente();
       Integer linha= tabelaCliente.getSelectedRow();
       String id = tabelaCliente.getModel().getValueAt(linha, 0).toString();
        
       cliente.setId_cliente(Integer.parseInt(id));
       
       ClienteDao cd = new ClienteDao();
       cd.excluir(cliente);  
     
       JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
 
        limparcampos();
        List<Cliente> clientes = cd.listarClientes();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        //referenciando as tabelas do DB, entre "", com as colunas da tabela, na ordem definida na tabela desta tela.
        
        modelo.addColumn("id_cliente");
        modelo.addColumn("nome");
        modelo.addColumn("cpf");
        modelo.addColumn("telefone");
        modelo.addColumn("email");
        modelo.addColumn("rua");
        modelo.addColumn("numero");
        modelo.addColumn("bairro");
        modelo.addColumn("cidade");
        modelo.addColumn("estado");
        
        Object rowData[] = new Object[10];
        
        System.out.println("Pesquisando clientes...");
        
        for(int i=0; i<clientes.size();i++){
            
            rowData[0] = clientes.get(i).getId_cliente();
            rowData[1] = clientes.get(i).getNome();
            rowData[2] = clientes.get(i).getCpf();
            rowData[3] = clientes.get(i).getTelefone();
            rowData[4] = clientes.get(i).getEmail();
            rowData[5] = clientes.get(i).getRua();
            rowData[6] = clientes.get(i).getNumero();
            rowData[7] = clientes.get(i).getBairro();
            rowData[8] = clientes.get(i).getCidade();
            rowData[9] = clientes.get(i).getEstado();
            
            modelo.addRow(rowData); 
        }
        //tabelaCliente é o nome da tabela na tela Tela_cliente.
        tabelaCliente.setModel(modelo);
     
     
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        Integer linha= tabelaCliente.getSelectedRow();
        if (linha < 0){
            JOptionPane.showMessageDialog(null, "Selecione um cliente para poder editar!");
        }
        
        String id = tabelaCliente.getModel().getValueAt(linha, 0).toString();
       
        Cliente cliente = new Cliente(); 
        
        cliente.setId_cliente(Integer.parseInt(id));
        cliente.setNome(txtNome.getText());
        cliente.setCpf(txtCpf.getText());
        cliente.setTelefone(txtTelefone.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setRua(txtRua.getText());
        cliente.setNumero(txtNumero.getText());
        cliente.setBairro(txtBairro.getText());
        cliente.setCidade(txtCidade.getText());
        cliente.setEstado(txtEstado.getText());
        
        ClienteDao cd = new ClienteDao();
       
        boolean v = cd.campoEmBranco(cliente);
        
       if(v == true){
            
            cd.editar(cliente);
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar cliente!");
        }
       
    limparcampos();
        
        List<Cliente> clientes = cd.listarClientes();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        //referenciando as tabelas do DB, entre "", com as colunas da tabela, na ordem definida na tabela desta tela.
        
        modelo.addColumn("id_cliente");
        modelo.addColumn("nome");
        modelo.addColumn("cpf");
        modelo.addColumn("telefone");
        modelo.addColumn("email");
        modelo.addColumn("rua");
        modelo.addColumn("numero");
        modelo.addColumn("bairro");
        modelo.addColumn("cidade");
        modelo.addColumn("estado");
        
        Object rowData[] = new Object[10];
        
        System.out.println("Pesquisando clientes...");
        
        for(int i=0; i<clientes.size();i++){
            
            rowData[0] = clientes.get(i).getId_cliente();
            rowData[1] = clientes.get(i).getNome();
            rowData[2] = clientes.get(i).getCpf();
            rowData[3] = clientes.get(i).getTelefone();
            rowData[4] = clientes.get(i).getEmail();
            rowData[5] = clientes.get(i).getRua();
            rowData[6] = clientes.get(i).getNumero();
            rowData[7] = clientes.get(i).getBairro();
            rowData[8] = clientes.get(i).getCidade();
            rowData[9] = clientes.get(i).getEstado();
            
            modelo.addRow(rowData); 
        }
        //tabelaCliente é o nome da tabela na tela Tela_cliente.
        tabelaCliente.setModel(modelo);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
 
        int linha = tabelaCliente.getSelectedRow();
        String id = tabelaCliente.getModel().getValueAt(linha, 0).toString();
        String nome = tabelaCliente.getModel().getValueAt(linha, 1).toString();
        String cpf = tabelaCliente.getModel().getValueAt(linha, 2).toString();
        String telefone = tabelaCliente.getModel().getValueAt(linha, 3).toString();
        String email = tabelaCliente.getModel().getValueAt(linha, 4).toString();
        String rua = tabelaCliente.getModel().getValueAt(linha, 5).toString();
        String numero = tabelaCliente.getModel().getValueAt(linha, 6).toString();
        String bairro = tabelaCliente.getModel().getValueAt(linha, 7).toString();
        String cidade = tabelaCliente.getModel().getValueAt(linha, 8).toString();
        String estado = tabelaCliente.getModel().getValueAt(linha, 9).toString();
        
        txtNome.setText(nome);
        txtCpf.setText(cpf);
        txtTelefone.setText(telefone);
        txtEmail.setText(email);
        txtRua.setText(rua);
        txtNumero.setText(numero);
        txtBairro.setText(bairro);
        txtCidade.setText(cidade);
        txtEstado.setText(estado);
        
        
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void tabelaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaClienteKeyReleased
        
        int linha = tabelaCliente.getSelectedRow();
        String id = tabelaCliente.getModel().getValueAt(linha, 0).toString();
        String nome = tabelaCliente.getModel().getValueAt(linha, 1).toString();
        String cpf = tabelaCliente.getModel().getValueAt(linha, 2).toString();
        String telefone = tabelaCliente.getModel().getValueAt(linha, 3).toString();
        String email = tabelaCliente.getModel().getValueAt(linha, 4).toString();
        String rua = tabelaCliente.getModel().getValueAt(linha, 5).toString();
        String numero = tabelaCliente.getModel().getValueAt(linha, 6).toString();
        String bairro = tabelaCliente.getModel().getValueAt(linha, 7).toString();
        String cidade = tabelaCliente.getModel().getValueAt(linha, 8).toString();
        String estado = tabelaCliente.getModel().getValueAt(linha, 9).toString();
        
        txtNome.setText(nome);
        txtCpf.setText(cpf);
        txtTelefone.setText(telefone);
        txtEmail.setText(email);
        txtRua.setText(rua);
        txtNumero.setText(numero);
        txtBairro.setText(bairro);
        txtCidade.setText(cidade);
        txtEstado.setText(estado);
        
        
    }//GEN-LAST:event_tabelaClienteKeyReleased

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
            java.util.logging.Logger.getLogger(Tela_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
