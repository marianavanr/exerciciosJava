package temperatura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Digite a temperatura de hoje em Grau Celsius: ");
        Scanner temperatura = new Scanner(System.in);

        double C = (double)temperatura.nextFloat();
        double F = C * 1.8D + 32.0D;
        double K = C + 273.15D;
        double Re = C * 0.8D;
        double Ra = C * 1.8D + 32.0D + 459.67D;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é: " + Re);

    }

}
