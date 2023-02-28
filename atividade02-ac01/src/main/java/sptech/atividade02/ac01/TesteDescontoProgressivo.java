/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.atividade02.ac01;

/**
 *
 * @author fe-ro
 */
public class TesteDescontoProgressivo {

    Double calcularDesconto(Double valor, Integer quantidade) {
        if (quantidade.equals(1)) {
            return ((valor * quantidade) * 0.9);

        } else if (quantidade.equals(2)) {
            return ((valor * quantidade) * 0.8);

        } else {
            return ((valor * quantidade) * 0.7);
        }

    }
    
    void exibirNotaFiscal(Double valor, Integer quantidade, Double valorFinal){
        System.out.println(
        String.format("""
                      -----------------------------------------------------------------
                      Valor do produto: R$%.2f
                      Quantidade: %d
                      -----------------------------------------------------------------
                      Valor com desconto: %.2f
                      """, valor, quantidade, valorFinal));
        
        
    }
    
    
}
