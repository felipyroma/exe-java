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

/* 5) Calculadora
Crie uma classe Java chamada “Calculadora” que:
• Seja executável (possui o método main).
• Solicite um número para o usuário (número real).
• Solicite outro número para o usuário (número real).
• Calcule e exiba a soma dos dois números digitados.
• Calcule e exiba a subtração do primeiro número pelo segundo.
• Calcule e exiba a multiplicação do primeiro número pelo segundo.
• Calcule e exiba a divisão do primeiro número pelo segundo.
Exemplo de saída:
Digite um número:
10
Digite outro número:
4
Resultado da soma:
14.0
Resultado da subtração:
6.0
Resultado da multiplicação:
40.0
Resultado da divisão:
2.5 */

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Double n1 = leitor.nextDouble();
        
        System.out.println("Digite um outro número:");
        Double n2 = leitor.nextDouble();
        
        Double soma = (n1 + n2);
        System.out.println("Resultado da soma: " + soma);
        
        Double subtracao = (n1 - n2);
        System.out.println("Resultado da subtração: " + subtracao);
        
        Double multiplicacao = (n1 * n2);
        System.out.println("Resultado da multiplicação " + multiplicacao);
        
        Double divisao = (n1 / n2);
        System.out.println("Resultado da divisão " + divisao);
    }
}
