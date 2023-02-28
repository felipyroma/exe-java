/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class ValidacaoNumerica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ValidacaoNumericaTeste primo = new ValidacaoNumericaTeste();

        Integer continuar = 1;
            while (continuar > 0) {
                System.out.println("Digite um número positivo: ");
                Integer numero = leitor.nextInt();

                primo.isPrimo(numero);
                
                continuar = 0;
                while(continuar.equals(0)){
                System.out.println(
                String.format("""
                              Deseja continuar? Digite:
                              Sim: Número positivo
                              Não: Número negativo"""));
                continuar = leitor.nextInt();
                
                if(continuar.equals(0)){
                    System.out.println("Por favor, Digite um numero diferente de 0!");
                }
            }
        }

        System.out.println("Volte sempre! =)");
    }

}
