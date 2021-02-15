package ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        int numero=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero inteiro: ");
        numero = entrada.nextInt();

        if (numero<0){
            System.out.println("NEGATIVO!");
        } else {
            System.out.println("NÃO NEGATIVO!");
        }

        entrada.close();
    }
}
