/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

/**
 *
 * @author fe-ro
 */
public class Condicao {

    public static void main(String[] args) {
        Integer n1 = 10;
        Integer n2 = 42;
        
        // .equals é mesmo que == no JS

        if (n1 > n2) {
            System.out.println("É maior!");
        } else if (n1 < n2) {
            System.out.println("É menor!");
        } else if (n1.equals(n2)) {
            System.out.println("É igual!");
        }

        String nome1 = "Xampson";
        String nome2 = "xampson";
        
        // SENsitive case
        if (nome1.equals(nome2)) {
            System.out.println("É o mesmo nome!");
        } else {
            System.out.println("Não é o mesmo nome!");
        }
        
        //INsensitive case
         if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("É o mesmo nome!");
        } else {
            System.out.println("Não é o mesmo nome!");
        }
         
        // comparação de booleans
        
        Boolean bloqueado = false;
        
        if(bloqueado) {
            System.out.println("Está bloqueado!");
        } else {
            System.out.println("Está desbloqueado!");
        }
    }
}
