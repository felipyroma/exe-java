/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeira.lista.exe;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */

/* 2) Cálculo de Renda
No país “Quisito” existe um benefício social chamado "Bolsa Filhos".
Crie uma classe Java que:
• Solicite ao usuário quantos filhos de 0 a 3 anos possui.
• Solicite ao usuário quantos filhos de 4 a 16 anos possui.
• Solicite ao usuário quantos filhos de 17 a 18 anos possui.
• Calcule o valor da Bolsa, sendo que o governo paga:
R$25,12 por filhos com menos de 4 anos
R$15,88 por filhos entre 4 e 16 anos
R$12,44 por filhos entre 17 e 18 anos
Exiba uma frase como esta:
"Você tem um total de T filhos e vai receber R$B de bolsa" Use interpolação com
2 casas decimais para o valor da bolsa */
public class BolsaFilhos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos filhos de 0 a 3 anos você possui?");
        Integer qtdFilhosAte3 = leitor.nextInt();

        System.out.println("Quantos filhos de 4 a 16 anos você possui?");
        Integer qtdFilhosAte16 = leitor.nextInt();

        System.out.println("Quantos filhos de 17 a 18 anos você possui?");
        Integer qtdFilhosAte18 = leitor.nextInt();

        Double calc1 = (qtdFilhosAte3 * 25.12);
        Double calc2 = (qtdFilhosAte16 * 15.88);
        Double calc3 = (qtdFilhosAte18 * 12.44);
        Double total = (calc1 + calc2 + calc3);
        
        Integer qtdFilhos = (qtdFilhosAte3 + qtdFilhosAte16 + qtdFilhosAte18);
        
        System.out.println("Você tem um total de " + qtdFilhos +
                " filhos e vai receber " + total + "R$ de bolsa");
        
        
    }

}
