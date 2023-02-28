/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.metodos;

/**
 *
 * @author fe-ro
 */
public class Utilitaria {

    /*
    retorno: esse é void, não possui retorno
    nome: exibirLinha
    argumentos: não possui ()
    corpos: fica dentro da {}
     */
    void exibirLinha() {
        System.out.println("*---------------------*");
    }

    void exibirNome(String nome) {
        System.out.println("Meu nome é: " + nome);
    }

    // Posso ter métodos diferentes com o mesmo argumento
    // A variável nasce e morre dentro do escopo do método
    void exibirNomeFormatado(String nome) {
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
        System.out.println("\n");
    }
}
