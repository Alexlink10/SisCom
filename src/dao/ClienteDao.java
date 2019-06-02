/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controle.Cliente;
import Telas.Tela_cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author israe
 */
public class ClienteDao {
    
    private Connection conn = null;
    
    public ClienteDao (){
    
        conn = ConexaoJdbc.getConnection();
    }
    
        public boolean campoEmBranco (Cliente cliente){
        
        boolean salvar;
        
        if(cliente.getNome().equals("") || cliente.getCpf().equals("")|| cliente.getTelefone().equals("") || cliente.getEmail().equals("") ||
           cliente.getCidade().equals("") || cliente.getEstado().equals("")){
            salvar = false;
            System.out.println("Existem campos que não foram preenchidos!");
            System.out.println("A tentativa de inclusão de dados falhou!");
            /*JOptionPane.showMessageDialog(null, "Existem campos que não foram preenchidos!");*/
        }
        else
        {
            salvar = true;
            System.out.println("Nenhum campo está em branco!");
            /*JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");*/
            
        }
        
        return salvar;
        
    }
    
    public boolean salvar (Cliente cliente){
        
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email, rua, numero, bairro, cidade, estado) VALUES (?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getRua());
            stmt.setString(6, cliente.getNumero());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getEstado());
            
            stmt.executeUpdate();
            
            return true;
            }    
            catch (SQLException ex) {
                System.err.println("Erro!" + ex);
                return false;
            }
            
        }
    
    public List<Cliente> listarClientes(){
        
        String sql = "SELECT * FROM cliente";
    
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        PreparedStatement stmt = null;
        
        try{
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                //nome, cpf, telefone, email, rua, numero, bairro, cidade, estado
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setRua(rs.getString("rua"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                
                clientes.add(cliente);
            }
                        
            ConexaoJdbc.closeConnection(conn, stmt, rs);
            
            return clientes;
        } 
        catch (SQLException ex) 
        {
            throw new RuntimeException (ex);
        }     
        
    }
    
    public boolean excluir (Cliente cliente){
        
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        
        PreparedStatement stmt = null;
        
        try{
            System.out.println("Iniciando exclusao de dados...");
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,cliente.getId_cliente());
            
            stmt.executeUpdate();
            
            return true;
            
            }    
            catch (SQLException ex) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        }
    
    public boolean editar (Cliente cliente){
        
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ? WHERE id_cliente = ?";
        
        PreparedStatement stmt = null;
        
        try
        {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getRua());
            stmt.setString(6, cliente.getNumero());
            stmt.setString(7, cliente.getBairro());
            stmt.setString(8, cliente.getCidade());
            stmt.setString(9, cliente.getEstado());
            stmt.setInt(10, cliente.getId_cliente());
            
            stmt.executeUpdate();
            
            return true;
        }    
        catch (SQLException ex) 
        {
           throw new RuntimeException (ex);
        }
        
    }
    
    /*public boolean validarCpf(String cpf){
        
        String query = "SELECT * FROM cliente WHERE cpf = '" + cpf + "'";
        
        PreparedStatement stmt = null;
        
        try 
        {
            stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            
            String cpfDB = rs.getString("cpf");
            
            rs.next();
            
            stmt.execute();
            
            if(cpfDB != cpf){
                return true;
            }
            else
            {
                System.out.println("CPF já cadastrado.\nNão é possível salvá-lo novamente!");
                return false;
            }
        } 
        catch (SQLException ex) 
        {
            System.err.println("Erro!" + ex);
            return false;
        }
        finally
        {
            ConexaoJdbc.closeConnection(conn, stmt);
        }
    }*/
}
