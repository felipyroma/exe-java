/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeira.lista.exe;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */

/* 4) Cálculo de Troco
Crie uma classe Java chamada “CalculadoraTroco” que:
• Seja executável.
• Solicite o valor unitário de um produto.
• Solicite a quantidade vendida.
• Solicite o valor pago pelo cliente.
• Calcule e exiba o troco com a seguinte frase: "Seu troco será de R$ X", onde "X"
é o valor a ser devolvido ao cliente.*/

public class CalculoDeTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor unitário do produto:");
        Double valorUnitario = leitor.nextDouble();
        
        System.out.println("Digite a quantidade de produtos vendidos");
        Double qtdVendida = leitor.nextDouble();
        
        System.out.println("Digite o valor pago pelo cliente");
        Double valorPago = leitor.nextDouble();
        
        Double valorVendaTotal = (valorUnitario * qtdVendida);
        
        if (valorPago > valorVendaTotal) {
            Double troco = (valorPago - valorVendaTotal);
            System.out.println("Seu troco será de R$" + troco);
            
        } else if (valorPago.equals(valorVendaTotal)) {
            System.out.println("Seu troco será de R$0,00");
            
        } else {
            System.out.println("Valor insulficiente para a compra!");
        }
            
    }
}
