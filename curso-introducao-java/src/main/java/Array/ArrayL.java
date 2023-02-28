/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.ArrayList;

/**
 *
 * @author fe-ro
 */
public class ArrayL {

    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>();

        contatos.add("Rodolfo");
        contatos.add("(11)95793-6213");
        contatos.add("São Paulo");
        
        contatos.add("Rebeca");
        contatos.add("(11)96117-8456");
        contatos.add("Amapá");
        
        System.out.println("Tamanho do array é de: " + contatos.size());
        
        System.out.println("conteúdo do index 2: " + contatos.get(2));
        System.out.println(" ");
        
        for(int i = 0; i < contatos.size(); i++){
            System.out.println(contatos.get(i));
        }
    }
}
