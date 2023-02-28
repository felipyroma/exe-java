/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ConversorTeste conv = new ConversorTeste();

        System.out.println("Digite a temperatura em Fahrenheit");
        Double tempF = leitor.nextDouble();
        
        conv.converter(tempF);
        
    }
}
