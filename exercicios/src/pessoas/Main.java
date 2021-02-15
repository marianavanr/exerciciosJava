package pessoas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //testar fluxograma
	// write your code here

        /*
        2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
        Fazer um algoritmo que calcule e escreva:
            a. a maior e a menor altura do grupo;
            b. média de altura dos homens;
            c. o número de mulheres.

         */

        int sexo;
        int qtMulheres=0;
        int qtHomens=0;

        float altura;
        float maior=0;
        float menor=0;
        float somaH=0;
        float mediaAlturaHomens=0;

        Scanner pessoas = new Scanner(System.in);

        for (int i=0; i<=10; i++){

            System.out.println("Informe se você é Mulher (1) ou Homem (2): ");
            sexo = pessoas.nextInt();

            System.out.println("Informe sua altura: ");
            altura = pessoas.nextFloat();

            if (sexo == 1){
                qtMulheres++;
            } else if (sexo==2){
                qtHomens++;
                somaH=somaH+altura;
            }   else {
                System.out.println("Deu ruim! Opção sexo inválido!");
            }

            if (altura>maior){
                maior=altura;
            } else if (altura<menor){
                menor=altura;
            }

            mediaAlturaHomens=somaH/qtHomens;
        }

        System.out.println("Maior altura: "+maior);
        System.out.println("Menor altura: "+menor);
        System.out.println("Média de altura dos Homens: "+mediaAlturaHomens);
        System.out.println("Quantidade de Mulheres: "+ qtMulheres);


        pessoas.close();
    }

}
