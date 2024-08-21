package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        while (true) {
            // Menu de operações
            System.out.println("Escolha a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int opcao = ent.nextInt();

            // Sair do loop se a opção for 5
            if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            }

            // Pedir números ao usuário
            System.out.print("Digite o primeiro número: ");
            double num1 = ent.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = ent.nextDouble();

            double resultado = 0;

            // Realizar operação de acordo com a escolha do usuário
            switch (opcao) {
                case 1: // Soma
                    resultado = num1 + num2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2: // Subtração
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3: // Multiplicação
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4: // Divisão
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println(); // Linha em branco para organizar a saída
        }

        ent.close(); // Fechar o Scanner
    }
}
