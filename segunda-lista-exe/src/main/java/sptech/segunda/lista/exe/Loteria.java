/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segunda.lista.exe;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author fe-ro
 */

/* Crie uma classe chamada Loteria que:
• Solicite apenas uma vez número entre 0 e 10 para o usuário.
• Tente adivinhar o número digitado através de números randômicos.
• A cada iteração exiba o número sorteado.
• Quando acontecer o “acerto” se a quantidade de vezes necessárias for:
 Até 3: exiba "Você é MUITO sortudo"
 Entre 4 e 10: exiba "Você é sortudo"
 Mais de 10: exiba "É melhor você parar de apostar e ir trabalhar"*/
public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 10: ");
        Integer numero = leitor.nextInt();

        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);

        Integer quantidade = 0;

        for (int i = 0; i <= 20; i++) {
            if (numeroSorteado.equals(numero)) {
                System.out.println(numeroSorteado);
                System.out.println("Acertou!");
                quantidade++;
                numeroSorteado = ThreadLocalRandom.current().nextInt(1, 11);
                break;

            } else if (numeroSorteado != numero) {
                System.out.println(numeroSorteado);
                quantidade++;
                numeroSorteado = ThreadLocalRandom.current().nextInt(1, 11);
            }
        }

        if (quantidade <= 3) {
            System.out.println("Você é muito sortudo!");
        } else if (quantidade <= 10) {
            System.out.println("Você é sortudo");
        } else if (quantidade > 10) {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }

    }
}
