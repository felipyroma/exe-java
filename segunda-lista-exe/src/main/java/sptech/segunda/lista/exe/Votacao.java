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
public class Votacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer queijo = 0;

        String favorita = null;

        Integer votacao = 10;

        for (int i = 0; i < votacao; i++) {
            System.out.println("""
                               Digite o seu voto, sendo: 
                               5 para pizza de mussarela 
                               25 para pizza de calabresa 
                               e 50 para pizza de quatro queijos""");

            Integer voto = leitor.nextInt();

            switch (voto) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    queijo++;
                    break;
                default:
                    System.out.println("Voto inválido! Tente novamente!");
                    votacao++;
                    break;
            }
        }

        if (mussarela > calabresa && mussarela > queijo) {
            favorita = "Mussarela";
        } else if (calabresa > mussarela && calabresa > queijo) {
            favorita = "Calabresa";
        } else if (queijo > calabresa && queijo > mussarela) {
            favorita = "Quatro queijos";
        }

        System.out.println(
                String.format("""
                      Mussarela: %d votos 
                      Calabresa: %d votos 
                      Quatro Queijos: %d votos""", mussarela, calabresa, queijo));

        System.out.println(
                String.format(" A pizza mais votada foi: %s ", favorita));
        
    }

}
