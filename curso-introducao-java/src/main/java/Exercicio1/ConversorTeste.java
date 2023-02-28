/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author fe-ro
 */
public class ConversorTeste {
    public void converter(Double tempF){
        Double tempC = (5 * (tempF - 32)) / 9;
        System.out.println(
        String.format("""
                      A temperatura %.1f°F é equivalente a %.1f°C""", tempF, tempC));
    }
}
