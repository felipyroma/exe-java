/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author fe-ro
 */
public class Carro {

    public Integer ano;
    public String cor;

    public Carro() {
        Integer chassi = ThreadLocalRandom.current().nextInt(1000);
        System.out.println("Chassi: " + chassi);
    }
    
    public Carro(Integer ano, String cor) {
        this.ano = ano;
        this.cor = cor;
    }

    public void ligar() {
        System.out.println("Ligado!!");
    }

    public void desligar() {
        System.out.println("Desligado!");
    }

    public void acelerar() {
        System.out.println("Vruuuum!");
    }
}
