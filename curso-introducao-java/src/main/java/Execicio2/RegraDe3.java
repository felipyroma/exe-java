/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Execicio2;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class RegraDe3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Teste result = new Teste();
        
        System.out.println("Digite um número: ");
        Double numero = leitor.nextDouble();
        
        System.out.println("Digite uma porcentagem: ");
        Double porcentagem = leitor.nextDouble();
        
        result.converter(numero, porcentagem);
        
    }

}
