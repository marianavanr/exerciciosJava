package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
      sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima
      de 1 hora e máxima de 24 horas.
    */

        double horaInicial;
        double horaFinal;
        double duracao;

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a hora inicial do jogo seguido da hora final: ");
        horaInicial = entrada.nextDouble();
        horaFinal = entrada.nextDouble();

        if (horaInicial<horaFinal){
            duracao = horaFinal - horaInicial;
        } else{
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou " + duracao + " horas.");
    }

}
