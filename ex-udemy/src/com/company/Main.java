package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int codPeca1;
        int nrPeca1;
        int codPeca2;
        int nrPeca2;
        double valorPeca1 = 0;
        double valorPeca2 = 0;
        double valorPagar;

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o codigo da peça, seguido do nr da peça e do valor: ");
        codPeca1 = entrada.nextInt ();
        nrPeca1 = entrada.nextInt();
        valorPeca1 = entrada.nextDouble();

        System.out.println("Digite o codigo da peça, seguido do nr da peça e do valor: ");
        codPeca2 = entrada.nextInt();
        nrPeca2 = entrada.nextInt();
        valorPeca2 = entrada.nextDouble();

        valorPagar = (nrPeca1 * valorPeca1) + (nrPeca2 * valorPeca2);

        //utilizando o Scanner preciso inserir o cálculo após introduzir os valores, e não na variável

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

    }
}
