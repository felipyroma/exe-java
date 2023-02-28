/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fe-ro
 */
public class Interpolacao {

    public static void main(String[] args) {
        String nome = "Xampsom";
        Integer idade = 42;
        Double altura = 1.26;

        // %s --> String 
        // %d --> Integer
        // %.2f --> Double (o nº representa as casas decimais)
        String frase = String.format("Meu nome é %s, tenho %d anos de idade e %.2f de altura. O nome do meu pet é %s",
                nome, idade, altura, "Mel");

        System.out.println(frase);

        /*System.out.println(
                String.format(
                        "Meu nome é %s, tenho %d anos de idade e %.2f de altura",
                        nome, idade, altura)); */
    }
}
