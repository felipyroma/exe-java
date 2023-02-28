/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segunda.lista.exe;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class Potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        Integer base = leitor.nextInt();

        System.out.println("Digite o valor do expoente: ");
        Integer expoente = leitor.nextInt();

        Integer resultado = 0;

        for (int i = 1; i <= expoente; i++) {
            if (i == 1) {
                resultado += base * i;
            } else {
                resultado *= base;
            }
        }

        System.out.println(
                String.format(
                        "O resultado da potência da base %d elevado ao expoente %d é igual a: %d"
                        , base, expoente, resultado));
    }

}
