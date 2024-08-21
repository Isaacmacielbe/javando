package exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");

		 try {
	            int numero = scanner.nextInt();

	            // Tentativa de divisão
	            int resultado = 100 / numero;
	            System.out.println("100 dividido por " + numero + " é: " + resultado);
	            
	        } catch (ArithmeticException e) {
	            // Tratamento para divisão por zero
	            System.out.println("Erro: Não é possível dividir por zero.");
	        } catch (Exception e) {
	            // Tratamento para qualquer outra exceção
	            System.out.println("Erro: Entrada inválida.");
	        } finally {
	            scanner.close();
	        }

	}

}
