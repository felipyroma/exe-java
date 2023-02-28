/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.atividade02.ac01;

/**
 *
 * @author fe-ro
 */
public class ValidacaoNumericaTeste {

    void isPrimo(Integer numero) {
        Integer quantidade = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                quantidade++;
            }
        }

        if (quantidade.equals(2)) {
            System.out.println(
                    String.format("""
                          %d é primo!""", numero));
              System.out.println(" ");
        } else {
            System.out.println(
                    String.format("""
                          %d não é primo!""", numero));
            System.out.println(" ");
    }
       
    }
}
