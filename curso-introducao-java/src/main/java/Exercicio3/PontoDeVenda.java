/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class PontoDeVenda {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Teste calc = new Teste();

        System.out.println("Digite o valor total do produto: ");
        Double valorTotal = leitor.nextDouble();

        System.out.println("Digite o valor de desconto: ");
        Double desconto = leitor.nextDouble();

        Double valorDesconto = calc.converter(valorTotal, desconto);
        
        System.out.println("O valor a ser pago é de: " + valorDesconto);

        Boolean continuar = false;

        Double pago = 0.0;

        while (!continuar) {
            System.out.println("Digite o valor pago ao caixa: ");
            pago = leitor.nextDouble();

            if (pago >= valorDesconto) {
                continuar = true;
            } else {
                System.out.println("Valor insuficiente!");
                continuar = false;
            }
        }

        calc.calcular(pago, valorDesconto);
    }
}
