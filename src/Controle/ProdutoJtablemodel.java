/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class ProdutoJtablemodel extends AbstractTableModel{
    
    private List<Produto> dados = new ArrayList<>();
    private String [] colunas = {"Referência","Modelo","Marca","Tamanho","Quantidade","Cor","Valor","valor_venda"};

    @Override
    public String getColumnName(int colunn) {
        return colunas[colunn];
    }
    
    

    @Override
    public int getRowCount() {
        
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linhai, int coluna) {

        switch(coluna){
            case 0:
                return dados.get(linhai).getReferencia();
            case 1:
                return dados.get(linhai).getModelo();
            case 2:
                return dados.get(linhai).getMarca();
            case 3:
                return dados.get(linhai).getTamanho();
            case 4:
                return dados.get(linhai).getQuantidade();
            case 5:
                return dados.get(linhai).getCor();
            case 6:
                return dados.get(linhai).getValor_venda();
            case 7:
                return dados.get(linhai).getSubtotal();
        
        }
        return null;

    }

    @Override
    public void setValueAt(Object valor, int linhai, int coluna) {

        switch(coluna){
            case 0:
                 dados.get(linhai).setReferencia(Integer.parseInt((String)valor));
                 break;
            case 1:
                 dados.get(linhai).setModelo((String)valor);
                 break;
            case 2:
                 dados.get(linhai).setMarca((String)valor);
                 break;
            case 3:
                 dados.get(linhai).setTamanho(Integer.parseInt((String)valor));
                 break;
            case 4:
                 dados.get(linhai).setQuantidade(Integer.parseInt((String)valor));
                 break;
            case 5:
                 dados.get(linhai).setCor((String)valor);
                 break;
            case 6:
                 dados.get(linhai).setValor_venda(Double.parseDouble((String)valor));
                 break;
            case 7:
                 dados.get(linhai).setSubtotal(Double.parseDouble((String)valor));
                 break;
        
        }
        this.fireTableRowsUpdated(linhai, linhai);

        

    }
    
    
    
    public void addlinha(Produto p){
    
        this.dados.add(p);
        this.fireTableDataChanged();
    
    }
    
    public void removlinha(int linha){
    
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    
    }
    
    
    
    
}
