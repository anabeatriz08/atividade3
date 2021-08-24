package main;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        //Essa é a questão um do primeiro exercício
        double valor_inicial = 1000;
        double taxa = 10.0;
        double tempo = 5;

        double resultado_renda_fixa = (valor_inicial + Math.pow(taxa, tempo));


        System.out.println("A renda fixa: " + resultado_renda_fixa);
    }

}
