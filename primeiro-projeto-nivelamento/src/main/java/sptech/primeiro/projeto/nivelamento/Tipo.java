/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

/**
 *
 * @author fe-ro
 */
public class Tipo {

    public static void main(String[] args) {
        // os tipos que mais usaremos em Java

        // 01- numeros inteiros => integer
        // declarando e inicializando
        Integer idade = 42;

        // só declarar
        Integer numeroQualquer;

        // só inicializar
        numeroQualquer = 10;
        System.out.println(numeroQualquer);

        // 02- numeros quebrados => Double
        Double altura = 1.66;

        // 03- para palavras => String
        String nome = "Xampson";

        System.out.println("Meu nome é " + nome + "\n tenho "
                + idade + " anos de idade e "
                + altura + " de altura");

        // diferença entre tipos primitivos e tipos Wrapper
        // para inteiros
        int inteiroPrimitivo; // começa com 0, se for inicializado
        Integer inteiroWrapper; // começa com null, se for inicializado

        boolean boleanoPrimitivo; // começa com false, quando não declarado
        Boolean boleanoWrapper; // começa com null, quando não declarado
        
        // classes possuem métodos! E eles vão ajudar
        // tipos primitivos NÃO! :(
        // boleanPrimitivo.
        // boleanWrapper.

        // Uma variável da classe Integer
        Integer valorMaxInteiro = Integer.MAX_VALUE;
        System.out.println("O máximo do integer é: " + valorMaxInteiro);
    }
}
