package ex05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
	 A seguir, calcule e mostre o valor da conta a pagar.

	 1- variaveis codigo, quantiade e valor;
	 2 - entrar o codigo e  quantidade
	 3 - calcular o total
	 */

        int codigo;
        int quantidade;
        double valor;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código do produto, seguido da quantidade: ");
        codigo = entrada.nextInt();
        quantidade = entrada.nextInt();

        if (codigo ==1){
            valor = quantidade*4.00;
        } else if (codigo ==2){
            valor = quantidade*4.50;
        } else if (codigo == 3){
            valor = quantidade*5.00;
        } else if (codigo ==4){
            valor = quantidade*2.00;
        } else{
            valor = quantidade*1.50;
        }

        System.out.printf("Total: R$ %.2f%n", valor);

    }
}
