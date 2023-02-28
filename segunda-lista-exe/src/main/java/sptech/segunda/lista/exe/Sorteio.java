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
public class Sorteio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 100: ");
        Integer numero = leitor.nextInt();

        Integer posicao = 0;
        Integer qtdPar = 0;
        Integer qtdImpar = 0;

        for (int i = 1; i <= 200; i++) {
            Integer numeroSorteio = ThreadLocalRandom.current().nextInt(0, 100);
            if (numeroSorteio.equals(numero)) {
                posicao = i;
            }

            if (numeroSorteio % 2 == 0) {
                qtdPar++;
            } else if (numeroSorteio % 2 == 1) {
                qtdImpar++;
            }

            System.out.println(
                    String.format(
                            "%d° lugar: %d",
                            i, numeroSorteio));
        }

        System.out.println(
                String.format(
                        "O numero %d ficou em %d lugar",
                        numero, posicao));

        System.out.println(
                String.format(
                        "Houveram %d números pares",
                        qtdPar));

        System.out.println(
                String.format(
                        "E %d números ímpares",
                        qtdImpar));

    }
}
