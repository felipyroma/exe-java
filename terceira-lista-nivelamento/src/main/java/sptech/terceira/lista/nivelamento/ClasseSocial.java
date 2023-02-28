package sptech.terceira.lista.nivelamento;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fe-ro
 */
public class ClasseSocial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Digite a sua renda: ");
        Double renda = leitor.nextDouble();

        Double conversaoRenda = calc.calculadora(renda);
        
        String categoria = calc.categoria(conversaoRenda);

        System.out.println(
                String.format("""
                      Voce recebe aproximadamente %.1f salários mínimos
                      Você pertence a classe social %s""", conversaoRenda, categoria));

    }
}
