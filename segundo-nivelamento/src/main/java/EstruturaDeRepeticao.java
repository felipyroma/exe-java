
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fe-ro
 */
public class EstruturaDeRepeticao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        /* System.out.println("for de 0 a 10");
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("10 a 0");
        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        
        int i = 0;
        while (i <= 10) {
            System.out.println("i");
            i++;
        }
        
        System.out.println("while - advinhe o número");

        System.out.println("Digite um número");
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 42) {
            System.out.println("Advinhe o número:");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Acertou!"); */
        System.out.println("do while - adivinhe o numero");
        Integer numeroDigitado = leitor.nextInt();

        System.out.println("digite o numero");

        do {
            System.out.println("Adivinhe o numero");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != 42);
    }
}
