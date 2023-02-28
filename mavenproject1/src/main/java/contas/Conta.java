 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author fe-ro
 */
public class Conta {
    // protected -> libera acesso se tiver herança
    // private -> libera acesso somente a classe pertencente
    // private -> libera acesso total
   
    // atributos
    private String cliente; 
    
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    private Double saldo;
    
    public Double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    
    // construtor
    public Conta(){
        System.out.println("Agência 0261");
    }
    
    // método
    public void exibirSaldo(){
        System.out.println("Saldo: R$" + saldo);
    }
    
    public void depositar(Double valor){
        saldo += valor;
    }
    
    public void sacar(Double valor){
        saldo -= valor;
    }
    
    public void transferir(Conta destino, Double valor){
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println(
        String.format("""
                      Transferência: R$%.2f""", valor));
    }
    
    
    Double somar(Double valorA, Double valorB){
        return valorA + valorB;
    }
   
    
}
