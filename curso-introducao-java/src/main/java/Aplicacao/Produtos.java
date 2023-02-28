/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacao;

/**
 *
 * @author fe-ro
 */
public class Produtos {
    public String nomeProduto;
    public Double quantidade;
    public Double preco;
    
    public void addProduto (Integer estoque){
        this.quantidade += estoque;
    }
    
    public void subProduto (Integer estoque) {
        this.quantidade -= estoque;
    }
}
