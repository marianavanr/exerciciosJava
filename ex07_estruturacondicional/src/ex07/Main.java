package ex07;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
	A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos
	ou na origem (x = y = 0).Se o ponto estiver na origem, escreva a mensagem “Origem”.
	Se o ponto estiver sobre um dos eixos escreva“Eixo X” ou “Eixo Y”, conforme for a situação.
	 */

        double x;
        double y;

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as coordenadas de X e Y: ");
        x= entrada.nextDouble();
        y= entrada.nextDouble();

        if (x==0 && y==0){
            System.out.println("O ponto está na origem.");
        } else if (x==0){
            System.out.println("O ponto está no eixo X");
        } else if (y==0){
            System.out.println("O ponto está no eixo Y");
        } else if (x>0 && y>0){
            System.out.println("Q1");
        } else if (x>0 && y<0){
            System.out.println("Q4");
        } else if (x<0 && y<0){
            System.out.println("Q3");
        } else if (x<0 && y>0){
            System.out.println("Q2");
        }

        entrada.close();

    }
}
