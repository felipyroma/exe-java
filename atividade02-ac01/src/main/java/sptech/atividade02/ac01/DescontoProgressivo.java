/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class DescontoProgressivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        TesteDescontoProgressivo desconto = new TesteDescontoProgressivo();
        
        System.out.println("Bem vindo ao sistema de desconto progressivo!");
        
        System.out.println("Digite o valor do produto: ");
        Double valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade do produto: ");
        Integer quantidade = leitor.nextInt();
        
        Double valorFinal = desconto.calcularDesconto(valor, quantidade);
        
        desconto.exibirNotaFiscal(valor, quantidade, valorFinal);
        
    }
}
