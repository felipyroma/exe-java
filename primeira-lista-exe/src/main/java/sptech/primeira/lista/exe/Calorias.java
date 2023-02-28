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

/* 3) Calorias
Chicó começou a se exercitar e deseja saber quantas calorias vai perder nos exercícios.
Crie uma classe Java que:
• Seja executável
• Solicite ao usuário o tempo, em minutos (valor inteiro) que ele passou se aquecendo
• Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios aeróbicos
(correr, andar, pedalar etc)
• Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios de
musculação
• Calcule quantas calorias o Jorge perdeu, sendo que: * cada minuto de aquecimento faz
perder 12 calorias * cada minuto de ex aeróbico faz perder 20 calorias * cada minuto de
musculação faz perder 25 calorias
Exiba, usando interpolação e apenas valores numéricos inteiros, uma frase como esta:
"Olá, Jorge. Você fez um total de X minutos de exercícios e perdeu cerca de
Y calorias".
 */
public class Calorias {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos minutos você praticou o aquecimento?");
        Integer tempoAquecimento = leitor.nextInt();

        System.out.println("Quantos minutos você praticou exercícios aeróbicos?");
        Integer tempoAerobico = leitor.nextInt();

        System.out.println("Quantos minutos você praticou exercícios de musculação?");
        Integer tempoMusculacao = leitor.nextInt();
        
        Integer tempoTotal = (tempoAquecimento + tempoAerobico + tempoMusculacao);

        Integer aquecimento = (tempoAquecimento * 12);
        Integer aerobico = (tempoAerobico * 20);
        Integer musculacao = (tempoMusculacao * 25);
        Integer totalCalorias = (aquecimento + aerobico + musculacao);

        System.out.println("Olá, Jorge. Você fez um total de " + tempoTotal
                + " minutos de exercícios e perdeu cerca de\n"
                + totalCalorias +" calorias");

    }
}
