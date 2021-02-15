package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        int numero;
        //int nrPar= numero+2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero: ");
        numero = entrada.nextInt();

        if ((numero %2)==0){
            System.out.println("Par");
        } else{
            System.out.println("Impar");
        }

        entrada.close();
    }
}
