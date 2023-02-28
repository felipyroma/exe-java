/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

/**
 *
 * @author fe-ro
 */
public class Ferrari {

    public static void main(String[] args) {
        Carro ferrari = new Carro();

        ferrari.ano = 2010;
        ferrari.cor = "Vermelho";
        System.out.println(
                String.format("""
                              O carro do modelo: Ferrari 
                              possui o ano: %d 
                              e a cor %s""", ferrari.ano, ferrari.cor));

        ferrari.ligar();
        ferrari.acelerar();

    }

}
