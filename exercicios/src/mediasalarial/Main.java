package mediasalarial;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /*
        3. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade
         de funcionários e os salários, e devolvendo a média salarial.

         variaveis - salario, funcionarios, media salarial
        */

        /*
        1 - declarar as variaveis
            nomeFuncionario
            qtFuncionarios
            salario
            somaSalario
            mediaSalario ------------- OK

         2- inserir os dados dos funcionarios (nome e salario);
         3- saber quantos funcionários tem a empresa;
         4- media do salario dos funcionários
         */

        String[] funcionario = new String[0];
        String nomeFuncionario;
        int qtFuncionarios = 0;
        double salario;
        double somaSalario = 0;
        double mediaSalario = 0;

        //inserção de nome e salário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do Funcionário: ");
        nomeFuncionario = entrada.nextLine();
        System.out.println("Digite o salário: ");
        salario = entrada.nextInt();
        //somaSalario=somaSalario+salario;


        //for (int i = 0; i <= nomeFuncionario.length; i++) {

    }
}