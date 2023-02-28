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
public class CalculoNutricao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        TesteCalculoNutricao calc = new TesteCalculoNutricao();

        Boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o peso da pessoa: ");
            Integer peso = leitor.nextInt();

            System.out.println("Digite a altura da pessoa: ");
            Double altura = leitor.nextDouble();

            calc.calculaIMC(peso, altura);
            Boolean repetir = true;

            while (repetir) {
                System.out.println(
                        String.format("""
                          Deseja continuar calculando? Digite:
                          1. Sim
                          2. Não"""));
                Integer pass = leitor.nextInt();

                if (pass.equals(1)) {
                    continuar = true;
                    repetir = false;
                } else if (pass.equals(2)) {
                    continuar = false;
                    repetir = false;
                } else {
                    System.out.println("Digite um número válido!");
                    repetir = true;
                }

            }
        }

        if (!continuar) {
            System.out.println("Volte sempre! =)");
        }

    }
}
