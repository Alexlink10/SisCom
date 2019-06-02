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
import javax.swing.JOptionPane;

/**
 *
 * @author israe
 */
public class ProdutoDao {
    
    private Connection conn = null;
    
    public ProdutoDao(){
    
        conn = ConexaoJdbc.getConnection();
        
    }
    
    public boolean campoEmBranco (Produto produto){
        
        boolean salvar;
        
        if(produto.getMarca().equals("")||(produto.getModelo().equals("")|| produto.getCor().equals("") || produto.getValor_compra().equals(0) || produto.getValor_venda().equals(0) || produto.getReferencia().equals(0) || produto.getTamanho().equals(0))){
            salvar = false;
            System.out.println("Existem campos que não foram preenchidos!");
            System.out.println("A tentativa de inclusão de dados falhou!");
            JOptionPane.showMessageDialog(null, "Existem campos que não foram preenchidos!");
        }
        else
        {
            salvar = true;
            System.out.println("Nenhum campo está em branco!");
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
        }
        
        return salvar;
        
    }
    
    public boolean salvar(Produto produto){
    
        String query = "INSERT INTO produto (referencia, modelo, marca, tamanho, quantidade, cor,"
                + " valor_compra, valor_venda)VALUES(?,?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, produto.getReferencia());
            stmt.setString(2, produto.getModelo());
            stmt.setString(3, produto.getMarca());
            stmt.setInt(4, produto.getTamanho());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setString(6, produto.getCor());
            stmt.setDouble(7, produto.getValor_compra());
            stmt.setDouble(8, produto.getValor_venda());
            
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
            System.err.println("Erro!" + ex);
            return false;
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
                
                produto.setId_produto(rs.getInt("id_produto"));
                produto.setReferencia(rs.getInt("referencia"));
                produto.setModelo(rs.getString("modelo"));
                produto.setMarca(rs.getString("marca"));
                produto.setTamanho(rs.getInt("tamanho"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setCor(rs.getString("cor"));
                produto.setValor_compra(rs.getDouble("valor_compra"));
                produto.setValor_venda(rs.getDouble("valor_venda"));
                
                produtos.add(produto);
            }
            
            ConexaoJdbc.closeConnection(conn, stmt, rs);
  
            return produtos;
        }
              
        catch ( SQLException ex) {
            throw  new  RuntimeException (ex);
        }        
        
    }
    
     public boolean excluir (String id){
         
         String query = "DELETE FROM produto WHERE id_produto = " + id;
         
         System.out.println(query);
         
         PreparedStatement stmt = null;
         
         try {
             stmt = conn.prepareStatement(query);
             stmt.execute();
             
             return true;
         } 
         catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false;
         }
         
         
     }
     
     public boolean editar (Produto produto){
         
         String query = "UPDATE produto SET referencia=?, modelo=?, marca=?, tamanho=?, quantidade=?, cor=?,"
                + " valor_compra=?, valor_venda=? WHERE id_produto = ?";
         
         PreparedStatement stmt = null;
         
         try{
             stmt = conn.prepareStatement(query);
             
             stmt.setInt(1, produto.getReferencia());
             stmt.setString(2, produto.getModelo());
             stmt.setString(3, produto.getMarca());
             stmt.setInt(4, produto.getTamanho());
             stmt.setInt(5, produto.getQuantidade());
             stmt.setString(6, produto.getCor());
             stmt.setDouble(7, produto.getValor_compra());
             stmt.setDouble(8, produto.getValor_venda());
             stmt.setInt(9, produto.getId_produto());
             
             stmt.executeUpdate();
             
            return true; 
             
         } catch (SQLException ex) {
            System.err.println("Erro!" + ex);
            return false; 
         }
         
     }
     
}
