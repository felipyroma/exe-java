/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class Camaro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro camaro = new Carro();

        System.out.println("Digite o ano do carro: ");
        camaro.ano = leitor.nextInt();

        System.out.println("Digite a cor do carro: ");
        camaro.cor = leitor.next();

        System.out.println(
                String.format("""
        O carro do modelo camaro, possui:
        Ano: %d
        Cor: %s""", camaro.ano, camaro.cor));

    }
}
