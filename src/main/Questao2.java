package main;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        //Essa é a questão 2 da atividade 3
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos metros? ");
        float metros = entrada.nextFloat();

        //Formula
        float centimetros = metros * 100;

        System.out.println(centimetros + " cm");
    }
}
