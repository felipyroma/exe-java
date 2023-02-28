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
public class Fusca {

    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        Scanner leitor =new Scanner(System.in);

        Carro fusca = new Carro();

        System.out.println("Digite o ano do carro: ");
        fusca.ano = leitorNumero.nextInt();
        
        System.out.println("Digite a cor do carro: ");
        fusca.cor = leitor.nextLine();

        System.out.println(
                String.format("""
                      Modelo do carro: Fusca
                      ano: %d
                      cor: %s""", fusca.ano, fusca.cor));

        fusca.ligar();
        fusca.acelerar();
        fusca.desligar();
    }

}
