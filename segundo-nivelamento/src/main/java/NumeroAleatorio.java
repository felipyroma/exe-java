
import java.util.concurrent.ThreadLocalRandom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fe-ro
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        // da pra fazer usando essa classe
        // math.random
        // Mas precisa cirar um objeto
        
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println("Número sorteado: " + numeroSorteado);
        
        System.out.println("Número Double sorteado: " + ThreadLocalRandom.current().nextDouble(1.3, 54.7));
    }
}
