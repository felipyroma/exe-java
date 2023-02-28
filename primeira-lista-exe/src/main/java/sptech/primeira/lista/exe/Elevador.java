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

/* 7) Elevador
Crie uma classe Java chamada “Elevador” que:
• Seja executável.
• Solicite ao usuário o limite de peso de um elevador (número real).
• Solicite ao usuário o limite de pessoas em um elevador (número inteiro).
• Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real).
• Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real).
• Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real).
Ao final, exiba uma frase assim:
"Entraram 3 pessoas no elevador, no qual cabem X pessoas.
O peso total no elevador é de Y, sendo que ele suporta Z".
(onde X é o 2º valor lido no programa, Z o 1º e Y é a soma dos pesos das 3 pessoas)*/
public class Elevador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite de peso do elevador:");
        Double limitePeso = leitor.nextDouble();

        System.out.println("Digite o limite de pessoas no elevador:");
        Integer limitePessoas = leitor.nextInt();

        System.out.println("Digite o peso da 1ª pessoa que entrou no elevador:");
        Double pesoPessoa1 = leitor.nextDouble();

        System.out.println("Digite o peso da 2ª pessoa que entrou no elevador:");
        Double pesoPessoa2 = leitor.nextDouble();

        System.out.println("Digite o peso da 3ª pessoa que entrou no elevador:");
        Double pesoPessoa3 = leitor.nextDouble();

        Double pesoTotal = (pesoPessoa1 + pesoPessoa2 + pesoPessoa3);

        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas
                + " pessoas. O peso total no elevador é de " + pesoTotal +
                ", sendo que ele suporta " + limitePeso);
    }
}
