/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class EscritaLeitura {
    public static void main(String[] args) {
        // criando um leitor
        
        // scann
        // essa não é um variável comum e sim um objeto!!!
        // pra ser um objeto, precisa INTANCIAR (new)
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("O nome digitado foi: " + nomeDigitado);
        
        System.out.println("Digite a sua altura: ");
        Double alturaDigitada = leitor.nextDouble();
        
        System.out.println("A altura digitada foi: " + alturaDigitada);
        
        
        System.out.println("Digite a sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        
        System.out.println("A idade digitada foi: " + idadeDigitada);
    }
}
