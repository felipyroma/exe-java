/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.metodos;

/**
 *
 * @author fe-ro
 */
public class Calculadora {
    
    // não fazer print no retorno, por que pode confundir e esquecer de usar o retorno
    Integer somar(Integer a, Integer b) {
        return a + b;
    }
    
    // quando for necessário fazer o print dentro do método, usar nome que dá para entender
    
    void exibirSoma(Integer a, Integer b) {
        System.out.println(a + b);
    }
    
    // sobracarga do metodo somar
    Integer somar (Integer a, Integer b, Integer c){
        return a + b + c;
    }
    
    // is e has
    Boolean isPar (Double numeroVerificar){
       return numeroVerificar % 2 == 0;
    }
    
    
    
}
