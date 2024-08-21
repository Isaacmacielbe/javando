package colecoes;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<String>();
		frutas.add("Laranja");
		frutas.add("Mamão");
		frutas.add("Maça");
		frutas.add("Goiaba");
		frutas.add("Melancia");

		frutas.remove(1);
		
		System.out.println(frutas);
		System.out.println(frutas.size());
	}

}
