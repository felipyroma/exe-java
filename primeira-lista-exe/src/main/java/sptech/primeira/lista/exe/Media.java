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

/* 8) Cálculo de Média
Crie uma classe Java chamada "CalculoMedia" que:
• Seja executável
• Solicite o nome e duas notas ao usuário.
• As notas são números reais.
• Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
• Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA"
• Use Interpolação com 1 casa decimal para a média.
 */
public class Media {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = leitor.nextLine();

        System.out.println("Digite uma nota");
        Double nota1 = leitor.nextDouble();

        System.out.println("Digite uma outra nota");
        Double nota2 = leitor.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println("Olá, " + nome + ". Sua média foi de " + media);
        
    }
}
