/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Produto {
   
    private Integer id_produto;
    private Integer referencia;  //// vata esse em int e foda kkk
    private String descricao;
    private Integer tamanho;
    private Integer quantidade;
    private float valorcompra;
    private float valorvenda;

    public Produto() {
    
    }

    public Produto(Integer referencia, String descricao, Integer tamanho, Integer quantidade, float valorcompra, float valorvenda) {
        this.referencia = referencia;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valorcompra = valorcompra;
        this.valorvenda = valorvenda;
    }
    
    

    public Integer getId_produto(){
        return id_produto;
    }
    
    public void setId_produto(Integer id_produto){
        this.id_produto = id_produto;
    }
    
    public Integer getReferencia() {
        return referencia;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(float valorcompra) {
        this.valorcompra = valorcompra;
    }

    public float getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(float valorvenda) {
        this.valorvenda = valorvenda;
    }
        
    
}
