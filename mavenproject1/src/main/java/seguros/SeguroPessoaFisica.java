/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguros;

/**
 *
 * @author fe-ro
 */
public class SeguroPessoaFisica extends contas.Conta{
    public static void main(String[] args) {
        SeguroPessoaFisica cc3 =  new SeguroPessoaFisica();
        
        cc3.setCliente("Jennifer");
        cc3.setSaldo(25000.00);
        
        System.out.println(cc3.getCliente());
        
        cc3.exibirSaldo();
        
    }
}
