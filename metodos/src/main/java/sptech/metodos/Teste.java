/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.metodos;

/**
 *
 * @author fe-ro
 */
public class Teste {

    public static void main(String[] args) {
        /* 
        criar um objeto da Utilitaria
        fazer uma instância = a ação de crir um objeto, ou seja new
         */
        Utilitaria util = new Utilitaria();

        Calculadora calc = new Calculadora();

        String nome01 = "Xampson";
        String nome02 = "Giuliana";

        // chamando um método = invocando um método
        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);

        Integer soma = calc.somar(10, 32);

        System.out.println("Soma: " + soma);
        System.out.println("Soma + 10: " + (soma + 10));
        
        System.out.println(
        String.format("""
                      Soma com interpolação: %d""", soma));
        
        
        // soma com sobrecarga
        Integer soma3numeros = calc.somar(10, 15, 1);
        
        Boolean verificar = calc.isPar(5.1);
        System.out.println(verificar);
    }
}
