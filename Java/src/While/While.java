package While;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = -1;
        while (numero != 10) { 
            // enquanto a variável não for 10, o trecho de código será repetido
            System.out.println("Digite um número: ");
            numero = in.nextInt();
            if (numero == 10) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");
            }
        }
        in.close(); // Fechar o Scanner quando não for mais necessário
    }

}
