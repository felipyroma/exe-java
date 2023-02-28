/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segunda.lista.exe;

import java.util.Scanner;

/**
 *
 * @author fe-ro
 */
public class Login {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um nome de usuário: ");
        String login = leitor.nextLine();

        System.out.println("Digite a sua senha: ");
        String senha = leitor.nextLine();

        for (int i = 0; i <= 50; i++) {
            if (login.equals("admin") && senha.equals("#SPtech2022")) {
                System.out.println("Login realizado com sucesso");
                break;
            } else {
                System.out.println("Login e/ou senha inválidos");

                System.out.println("Digite um nome de usuário: ");
                login = leitor.nextLine();

                System.out.println("Digite a sua senha: ");
                senha = leitor.nextLine();
            }
        }

    }
}
