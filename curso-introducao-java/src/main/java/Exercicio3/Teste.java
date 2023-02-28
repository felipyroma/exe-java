/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

/**
 *
 * @author fe-ro
 */
public class Teste {
    public Double converter(Double valorTotal, Double desconto){
        return desconto < 100 ? valorTotal * (1 - (desconto / 100)) : 0;
    }
    
    public void calcular(Double pago, Double valorDesconto){
        Double resultado = pago - valorDesconto;
        
        if(resultado.equals(0.0) || resultado < 0){
            System.out.println("Pagamento concluído, volte sempre!");
        } else {
            System.out.println(
            String.format("""
                          Pagamento concluído, o valor do troco é: %.2f""", resultado));
        }
    }
}
