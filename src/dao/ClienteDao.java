/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controle.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public boolean salvar (Cliente cliente){
        
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email, rua, numero, bairro, cidade, estado) VALUES (?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try{
            System.out.println("Iniciando inclusão de dados...");
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
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            finally{
            System.out.println("Conexão encerrada com o DB.");
            ConexaoJdbc.closeConnection(conn, stmt);
            }
        }
    
    public List<Cliente> listarClientes(){
        
        String sql = "SELECT * FROM cliente ";
    
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
            finally{
            System.out.println("Conexão encerrada com o DB.");
            ConexaoJdbc.closeConnection(conn, stmt);
            }
        }
    public boolean editar (Cliente cliente, String id){
        
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ? WHERE id_cliente = " + id;
        
        PreparedStatement stmt = null;
        
        try{
            System.out.println("Iniciando update de dados...");
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
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            finally{
            System.out.println("Conexão encerrada com o DB.");
            ConexaoJdbc.closeConnection(conn, stmt);
            }
        }
    
  
}
