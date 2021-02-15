package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a =0;
        double b =0;
        double c =0;
        double pi = 3.14159;

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite os valores de a, b e c.");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        double triangulo = a*c/2;
        double circulo = pi* Math.pow(c,2);
        double trapezio = (a+b) * c / 2;
        double quadrado = b*b;
        double retangulo = a*b;


        System.out.printf("a) a área do triângulo retângulo que tem A por base e C por altura. TRIANGULO: %.3f%n", triangulo);
        System.out.printf("b) a área do círculo de raio C. (pi = 3.14159). CÍRCULO: %.3f%n", circulo);
        System.out.printf("c) a área do trapézio que tem A e B por bases e C por altura. TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("d) a área do quadrado que tem lado B. QUADRADO: %.3f%n)",quadrado);
        System.out.printf("e) a área do retângulo que tem lados A e B. RETANGULO: %.3f%n", retangulo);

    }
}
