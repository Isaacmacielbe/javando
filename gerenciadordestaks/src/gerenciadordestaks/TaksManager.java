package gerenciadordestaks;

import java.util.ArrayList;

public class TaksManager {

	public static void main(String[] args) {
		// declarando o arraylist
		ArrayList<String> tasks = new ArrayList<String>();

		// Adicionando novas tarefas
		tasks.add("Estudar java");
		tasks.add("Estudar postgre");
		tasks.add("Estudar py");
		tasks.add("Finalziar o projeto do BI");

		System.out.println("Esse é o sistema de tarefas");

		for (String taks : tasks) {
			System.out.println(taks);
		}
	}

}
