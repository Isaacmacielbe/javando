package gerenciadordestaks;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// Cria o ArrayList para armazenar as tarefas
		ArrayList<String> tasks = new ArrayList<String>();
		
		 // Cria um Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		boolean running = true;
		
		while (running) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha1
            
            
            switch (option) {
                case 1:
                    // Adicionar uma nova tarefa
                    System.out.print("Digite a tarefa: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Tarefa adicionada.");
                    break;
                case 2:
                    // Remover uma tarefa pelo índice
                    System.out.print("Digite o índice da tarefa a remover: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Tarefa removida.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    // Listar todas as tarefas
                    System.out.println("Lista de Tarefas:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 4:
                    // Sair do programa
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        

	}

}
