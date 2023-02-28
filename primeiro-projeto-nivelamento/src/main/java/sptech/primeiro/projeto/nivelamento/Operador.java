/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

/**
 *
 * @author fe-ro
 */
public class Operador {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 10;
        
        // 01- Soma
        // exibindo com uma variável 
        Integer soma = numero01 + numero02;
        System.out.println("Soma: " + soma);
        
        // somando direto no print
        System.out.println("Soma: " + (numero01 + numero02));
        
        // 02- Multiplicação
        System.out.println("Multiplicação: " + (numero01 * numero02));
        
        // 03- Divisão
        System.out.println("Divisão: " + (numero01 / numero02));
        
        // 04- Subtração
        System.out.println("Substração: " + (numero01 - numero02));
        
        // 05 - Resto
        System.out.println("Resto: " + (numero01 % numero02));
        
        // 06 - Somando e subtraindo 1
        System.out.println("Valor +1: " + ++numero01);
        System.out.println("Valor -1: " + --numero02);
        
        // ** usado para potência no JavaScript NÃO tem no Java!!!
        // Mas temos uma classe com um método que faz isso :)
        // Potência
        Double potencia = Math.pow(2, 5);
        System.out.println("Potência no Java: " + potencia);
        
        // valor de PI
        // essa clase, além de métodos tem variáveis que ajudam!
        System.out.println("PI no Java: " + (Math.PI));
    }
}
