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

/* 6) Salário Líquido
Crie uma classe Java que ajude Chicó a saber quanto será seu salário líquido.
• A classe deve ser executável
• O programa solicita o salário bruto
• O programa calcula o desconto do INSS, que é sempre de 10% sobre o bruto
• O programa calcula o desconto de IR, que é sempre de 20% sobre o bruto
• O programa pergunta quanto custa a condução diária só de ida da casa para o trabalho.
• O desconto de VT é sempre o que o usuário gasta. Assim, calcula-se assim: Valor de
condução ida x 2 x 22.
• Calcule o salário líquido, que é o bruto menos os descontos de INSS, IR e VT
Exiba, usando interpolação e com os valores numéricos com 2 casas decimais, uma frase como
esta:
"Seu salário bruto é R$A, tem um total de R$B em descontos e receberá um
líquido de R$C"
*/

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o salário bruto:");
        Double salarioBruto = leitor.nextDouble();
        
        Double descontoImposto = (salarioBruto * 0.3);
        
        System.out.println("Digite qual o valor da condução diária de ida do casa para o trabalho:");
        Double valeTransporte = leitor.nextDouble();
        
        Double descontoVt = (valeTransporte * 2 * 22);
        
        Double descontoTotal = (descontoImposto + descontoVt);
        
        Double salarioLiquido = (salarioBruto - descontoTotal);
        System.out.println("Seu salário bruto é " +  salarioBruto + 
                ", tem um total de " + descontoTotal + 
                " em descontos e receberá um líquido de " + salarioLiquido);
        
        
        
        
    }
}
