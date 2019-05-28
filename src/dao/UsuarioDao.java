/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Controle.Usuario;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author israel
 */
public class UsuarioDao {
    
    
    private Connection conn = null;
    
    
    public UsuarioDao(){
    
        conn = ConexaoJdbc.getConnection();
    }
    
    public boolean campoEmBranco (Usuario usuario){
        
        boolean salvar;
        
        if(usuario.getNome().equals("")||(usuario.getLogin().equals("")|| usuario.getSenha().equals("") || usuario.getCpf().equals("")
          || usuario.getTelefone().equals("") || usuario.getEmail().equals("") || usuario.getRua().equals("") || usuario.getNumero().equals("") 
          || usuario.getBairro().equals("") || usuario.getCidade().equals("") || usuario.getEstado().equals(""))){
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
    
    public boolean salvar (Usuario usuario){
    
        String query = "INSERT INTO usuario(nome, login, senha, cpf, telefone, email, rua, numero, bairro, cidade, estado)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conn.prepareStatement(query);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getTelefone());
            stmt.setString(6, usuario.getEmail());
            stmt.setString(7, usuario.getRua());
            stmt.setString(8, usuario.getNumero());
            stmt.setString(9, usuario.getBairro());
            stmt.setString(10, usuario.getCidade());
            stmt.setString(11, usuario.getEstado());
            
            stmt.executeUpdate();
            
           return true; 
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ConexaoJdbc.closeConnection(conn, stmt);
        }
        
    }
    
    public List<Usuario> listarUsuario(){
    
        String sql = "SELECT * FROM usuario";
        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        PreparedStatement stmt = null;
        
        try{
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Usuario usuario = new Usuario();
                
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEmail(rs.getString("email"));
                usuario.setRua(rs.getString("rua"));
                usuario.setNumero(rs.getString("numero"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setEstado(rs.getString("estado"));
                
                usuarios.add(usuario);
                
            }
            ConexaoJdbc.closeConnection(conn, stmt, rs);
            
            return usuarios;
            
        } catch (SQLException ex) {
            throw  new  RuntimeException (ex);
        }
        finally{
            ConexaoJdbc.closeConnection(conn, stmt);
        }
        
    }
    
    public boolean excluir (String id){
        
        String query = "DELETE FROM usuario WHERE id_usuario = " + id;
        
        System.out.println(query);
        
        PreparedStatement stmt = null;
        
        try{
            stmt = conn.prepareStatement(query);
            stmt.execute();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
        }
        finally{
            ConexaoJdbc.closeConnection(conn, stmt);
        }
        
    }
    
}