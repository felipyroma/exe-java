/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

/**
 *
 * @author fe-ro
 */
public class Cessna {

    public static void main(String[] args) {
        Aviao cessna = new Aviao();

        cessna.ano = 2010;
        cessna.cor = "Branco";
        cessna.envergadura = 21.3;
        
        System.out.println(
        String.format("""
                      O avião Cessna, possui:
                      Ano: %d
                      Envergadura: %.1f""", cessna.ano, cessna.envergadura));
        
        cessna.aterrissar();
        cessna.desligar();
                     
    }

}
