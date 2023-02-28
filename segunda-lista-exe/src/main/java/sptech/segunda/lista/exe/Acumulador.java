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

/* Crie uma classe chamada Acumulador que:
• Leia vários números até ler o número 0 e calcule a soma dos números lidos. (Não é para
usar vetor).
• Exiba: "A soma dos números é x"
 */
public class Acumulador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 11);
        System.out.println(numeroSorteado);

        Integer somaNumeros = 0;
        
        while(numeroSorteado != 0) {
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 10);
            somaNumeros += numeroSorteado;
             System.out.println(numeroSorteado);
        } 
        
        System.out.println("A soma dos números é " + somaNumeros);

    }
}
