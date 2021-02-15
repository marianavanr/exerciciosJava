package com.exercicioidadevotacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade= entrada.nextInt();

        if (idade >= 16 && idade < 18 ||  idade > 70) {
            System.out.println("você pode votar, mas seu voto não é obrigatório!");
        } else if (idade >= 18) {
            System.out.println("Você é obrigado a votar!");
        } else {
            System.out.println("Você não pode votar");
        }
        entrada.close();
    }
}