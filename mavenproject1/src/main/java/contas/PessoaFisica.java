/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author fe-ro
 */
public class PessoaFisica {

    public static void main(String[] args) {
        Conta cc1 = new Conta();

        cc1.setCliente("Roberto");
        cc1.setSaldo(10000.00);

        System.out.println("Cliente: " + cc1.getCliente());
        // sacar
        cc1.sacar(1000.00);
        cc1.exibirSaldo();
        System.out.println(" ");

        Conta cc2 = new Conta();

        cc2.setCliente("Nicolau");
        cc2.setSaldo(5000.00);

        System.out.println("Cliente: " + cc2.getCliente());
        // depositar
        cc2.depositar(4000.00);
        cc2.exibirSaldo();
        System.out.println(" ");

        // transferencia
        cc1.transferir(cc2, 1000.00);
        cc1.exibirSaldo();
        cc2.exibirSaldo();
        System.out.println(" ");
        
        
        // gerenciamento do total das contas
        Conta gerente = new Conta();
        
        Double totalContas = gerente.somar(cc1.getSaldo(), cc2.getSaldo());
        
        System.out.println(
        String.format("""
                      Total das contas é de: R$%.2f""", totalContas));
    }
}
