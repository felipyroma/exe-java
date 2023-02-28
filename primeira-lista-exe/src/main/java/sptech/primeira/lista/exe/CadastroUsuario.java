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

/* 1) Crie uma classe Java chamada "CadastroUsuario" que:
• Seja executável
• Solicite o login do cliente
• Solicite a senha do cliente
• Solicite a quantidade de vezes que o usuário aceita errar a senha antes do bloqueio
• Exiba uma frase como esta: "Seu login é L e sua senha é S. Você tem T
tentativas antes de ser bloqueado" */

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Login: ");
        String loginDigitado = leitor.nextLine();
        
        System.out.println("Senha: ");
        String senhaDigitada = leitor.nextLine();
        
        System.out.println("Quantas vezes você aceita errar a senha antes do bloqueio?");
        Integer erroDigitado = leitor.nextInt();
        
        
        System.out.println("O seu login é: " + loginDigitado +
                "\n A sua senha é: " + senhaDigitada +
                "\n A quantidade de tentativas para bloqueio da sua conta é de: "
                + erroDigitado);
    }
}
