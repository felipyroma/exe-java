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

/* 9) Idade
Crie uma classe Java chamada “Idade” que:
• Seja executável.
• Solicite que o usuário digite o seu nome.
• Em seguida, o programa deverá exibir a mensagem: “Olá, Fulano! Qual o ano de
seu nascimento?”.
• Depois, o programa deverá exibir: “Em 2030 você terá 25 anos” (sendo "Fulano" o
nome digitado pelo usuário e "xx" a idade do usuário).
Exemplo:
Qual é o seu nome?
Maria
Olá, Maria! Qual o ano de seu nascimento?
1995
Em 2030 você terá 35 anos.*/

public class Idade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        String nome = leitor.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o ano do seu nascimento?");
        Integer nascimento = leitor.nextInt();
        
        Integer idade = (2030 - nascimento);
        System.out.println("Em 2030 você terá " + idade + " anos");
    }
}
