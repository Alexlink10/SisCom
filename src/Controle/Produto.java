/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author israe
 */
public class Produto {
    
    private Integer id_produto;
<<<<<<< HEAD
     private Integer referencia;
=======
    private Integer referencia;  //// vata esse em int e foda kkk
>>>>>>> 2c61cb7ee100ce83d49f5fc596b0869fd77a1351
    private String modelo;
    private String marca;
    private Integer tamanho;
    private String cor;
    private Integer quantidade;
<<<<<<< HEAD
    private Double valor_compra;
    private Double valor_venda;
=======
    private Integer cor;
    private float valorcompra;
    private float valorvenda;
>>>>>>> 2c61cb7ee100ce83d49f5fc596b0869fd77a1351

    public Produto(Integer id_produto, Integer referencia, String modelo, String marca, Integer tamanho, String cor, Integer quantidade, Double valor_compra, Double valor_venda) {
        this.referencia = referencia;
        this.id_produto = id_produto;
        this.modelo = modelo;
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.quantidade = quantidade;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
    }

    public Produto(String modelo, Integer referencia, String marca, Integer tamanho, String cor, Integer quantidade, Double valor_compra, Double valor_venda) {
        this.referencia = referencia;
        this.modelo = modelo;
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.quantidade = quantidade;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
    }

    public Produto() {
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public Integer getReferencia() {
        return referencia;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }
    
}
