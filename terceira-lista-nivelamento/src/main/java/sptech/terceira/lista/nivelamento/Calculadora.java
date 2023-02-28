package sptech.terceira.lista.nivelamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fe-ro
 */
public class Calculadora {

    Double calculadora(Double renda) {
        return renda / 1045;
    }

    String categoria(Double conversaoRenda) {
        if (conversaoRenda < 2.0) {
            return "E";
        } else if (conversaoRenda < 4.0) {
            return "D";
        } else if (conversaoRenda < 10.0) {
            return "C";
        } else if (conversaoRenda < 20.0) {
            return "B";
        } else {
            return "A";
        }
    }

}
 