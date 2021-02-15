package ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
	 "Sao Multiplos"ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos
	 entre si.
     Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
    */

        int a;
        int b;

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o valor de A e o valor de B para saber se eles são múltiplos um do outro: ");
        a = entrada.nextInt();
        b = entrada.nextInt();

        if ((a%b)==0 || (b%a)==0){
            System.out.println("São multiplos");
        } else {
            System.out.println("não são multiplos");
        }

        entrada.close();
    }
}
