/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.atividade02.ac01;

/**
 *
 * @author fe-ro
 */
public class TesteCalculoNutricao {

    void calculaIMC(Integer peso, Double altura) {
        Double imc = peso / (altura * altura);
        System.out.println(
        String.format("""
                      O IMC da pessoa correspondente é: %.2f""", imc));
        System.out.println(" ");
    }
}