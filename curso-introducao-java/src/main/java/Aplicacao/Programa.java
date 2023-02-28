/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacao;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fe-ro
 */
public class Programa {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Produtos produto = new Produtos();

        System.out.println("Digite o nome do produto: ");
        produto.nomeProduto = leitor.nextLine();

        System.out.println("Digite a quantidade do produto: ");
        produto.quantidade = leitor.nextDouble();

        System.out.println("Digite o preço do produto: ");
        produto.preco = leitor.nextDouble();

        System.out.println(
                String.format(
                        "O produto %s, possui estoque de %.2f e o seu preço é %.2f ",
                        produto.nomeProduto, produto.quantidade, produto.preco));
        
        System.out.println("Deseja acrescentar produtos ao estoque? ");
        Integer estoque = leitor.nextInt();
        produto.addProduto(estoque);
        System.out.println(
                String.format(
                        "Atualização: produto acrescentado com sucesso, estoque atual: %.2f", produto.quantidade));
        
        System.out.println("Ocorreu alguma venda durante o período? ");
        estoque =  leitor.nextInt();
        produto.subProduto(estoque);
         System.out.println(
                String.format(
                        "Atualização: produto vendido com sucesso, estoque atual: %.2f", produto.quantidade));
         
         JOptionPane.showMessageDialog(null, "Estoque atualizado com sucesso!");
        
    }
}
