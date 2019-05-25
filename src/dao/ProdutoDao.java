/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Controle.Produto;
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
 * @author Alex
 */
public class ProdutoDao {
    
    private Connection conn = null;
    
    public ProdutoDao(){
    
        conn = ConexaoJdbc.getConnection();
        
    }
    
    public boolean salvar(Produto produto){
    
        String query = "INSERT INTO produto (referencia,descricao,tamanho,quantidade,valorcompra,valorvenda)VALUES(?,?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, produto.getReferencia());
            stmt.setString(2, produto.getDescricao());
            stmt.setInt(3, produto.getTamanho());
            stmt.setFloat(4, produto.getQuantidade());
            stmt.setFloat(5, produto.getValorcompra());
            stmt.setFloat(6, produto.getValorvenda());
            
            stmt.executeUpdate();
            
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
        
            ConexaoJdbc.closeConnection(conn, stmt);
        }   
    
    }
    
     public  List < Produto > listarProduto () {
        
        String sql =  "SELECT * FROM produto" ;
        
        List<Produto> produtos =  new  ArrayList<Produto>();
        
        PreparedStatement stmt = null;
       
        try {
           
            stmt = conn.prepareStatement (sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto =  new  Produto();
                
                produto.setReferencia(rs.getInt("referencia"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setTamanho(rs.getInt("tamanho"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setValorcompra(rs.getFloat("valorcompra"));
                produto.setValorvenda(rs.getFloat("valorvenda"));
                
                produtos.add(produto);
            }
            
         
            ConexaoJdbc.closeConnection(conn, stmt, rs);
  
            return produtos;
        }
              
        catch ( SQLException ex) {
            throw  new  RuntimeException (ex);
        }        
        
    }
     
     public boolean editar(Produto produto){
    
        String query = "UPDATE produto SET referencia = ?, descricao = ?, tamanho = ?, quantidade = ?, valorcompra = ?, valorvenda = ?";
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, produto.getId_produto());
            
            
            stmt.executeUpdate();
            
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
        
            ConexaoJdbc.closeConnection(conn, stmt);
        }   
    
    }
    
}
