/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segunda.lista.exe;

/**
 *
 * @author fe-ro
 */
public class ContadorVariado {

    public static void main(String[] args) {

        Double valor = 0.15;
        Double incremento = 0.15;

        for (int i = 0; valor < 5; i++) {
            if ((valor + incremento) < 5) {
                valor += incremento;
                System.out.println(
                        String.format(
                                "%.2f",
                                valor));
            }
        }

    }
}
