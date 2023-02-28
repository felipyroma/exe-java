/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author fe-ro
 */
public class ArrayMultidimensional {

    public static void main(String[] args) {
        String agenda[][] = {
            {"José", "912345678", "ze@emai.com"},
            {"Rodrigo", "945678912", "digo@outlook.com"},
            {"Maria", "973651234", "mari@hotmail.com"}
        };
        
        System.out.println(agenda[0][1]);
        System.out.println("\n");
        
        System.out.println(agenda[0][0] + " " + agenda[0][1] + "\n");
        
        for (int i = 0; i < agenda.length; i++) {
            // for para percorrer as linhas
            System.out.println("----------------------------------");
            
            for (int j = 0; j < agenda.length; j++) {
                 // for para percorrer as colunas
                System.out.println(agenda[i][j]); 
            }
            
        }
    }
}
