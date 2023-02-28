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
public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        TesteIdade classificacao = new TesteIdade();
        
        System.out.println("Digite a sua idade: ");
        Integer idade = leitor.nextInt();
        
        classificacao.classificaIdade(idade);
        
        
    }
}
