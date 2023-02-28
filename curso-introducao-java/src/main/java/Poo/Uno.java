/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

/**
 *
 * @author fe-ro
 */
public class Uno {
    public static void main(String[] args) {
        Carro uno = new Carro(1990, "Preto");
        
        System.out.println(
        String.format("""
                      O carro Uno, possui:
                      Ano: %d
                      Cor:%s""", uno.ano, uno.cor));
        
        uno.ligar();
        uno.acelerar();
        uno.desligar();
    }
}
