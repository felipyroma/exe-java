/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer voto = 7;
        Integer numero = 0;
        Integer calculo;
        Integer expoente = 0;
        Integer base = 0;
        Integer resultado = 0;

        while (voto != 0) {

            System.out.println(
                    String.format(
                            "Digite o número correspondente a operação desejada:\n"
                            + "1 - Soma\n"
                            + "2 - Multiplicação\n"
                            + "3 - Divisão\n"
                            + "4 - Subtração\n"
                            + "5 - Potência \n"
                            + "6 - Resto \n"
                            + "0 – Sair"));

            voto = leitor.nextInt();

            if (voto != 0 && voto != 5 && voto <= 6) {
                System.out.println("Digite um número inteiro: ");
                numero = leitor.nextInt();
            }

            if (voto == 5) {
                System.out.println("Digite um número inteiro: ");
                base = leitor.nextInt();
                System.out.println("Digite um expoente inteiro: ");
                expoente = leitor.nextInt();
            }

            switch (voto) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        calculo = numero + i;
                        System.out.println(
                                String.format(
                                        "%d + %d = %d", numero, i, calculo));
                    }
                    break;

                case 2:
                    for (int i = 1; i <= 10; i++) {
                        calculo = numero * i;
                        System.out.println(
                                String.format(
                                        "%d * %d = %d", numero, i, calculo));
                    }
                    break;

                case 3:
                    for (int i = 1; i <= 10; i++) {
                        calculo = numero / i;
                        System.out.println(
                                String.format(
                                        "%d / %d = %d", numero, i, calculo));
                    }
                    break;

                case 4:
                    for (int i = 1; i <= 10; i++) {
                        calculo = numero - i;
                        System.out.println(
                                String.format(
                                        "%d - %d = %d", numero, i, calculo));
                    }
                    break;

                case 5:
                    for (int i = 1; i <= expoente; i++) {
                        if (i == 1) {
                            resultado += base * i;
                            System.out.println(
                                    String.format(
                                            "%d ** %d = %d", base, i, resultado));
                        } else {
                            resultado *= base;
                            System.out.println(
                                    String.format(
                                            "%d ** %d = %d", base, i, resultado));
                        }
                    }
                    break;

                case 6:
                    for (int i = 1; i <= 10; i++) {
                        calculo = numero % i;
                        System.out.println(
                                String.format(
                                        "O resto de %d / %d = %d", numero, i, calculo));
                    }
                    break;

                case 0:
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
                    
            }
        }
    }
}
