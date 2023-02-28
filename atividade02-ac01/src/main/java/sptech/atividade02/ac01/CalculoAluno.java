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
public class CalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        TesteCalculoAluno calc = new TesteCalculoAluno();
        
        System.out.println("Digite a primeira nota: ");
        Double n1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        Double n2 = leitor.nextDouble();
        
        Double notaFinal = calc.CalcularMedia(n1, n2);
        
        System.out.println(
        String.format("""
                      A sua média foi: %.1f""", notaFinal));
    }
}
