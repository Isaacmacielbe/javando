package areilist;

import java.util.ArrayList;

class ExercicieOne2 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Fazer tarefas");
		lista.add("Desenvolver campanhas");
		
		lista.remove(0);
		
		for (String elemento  : lista) {
            System.out.println(elemento);

		}
		
		System.out.println("Tamanho da lista: " + lista.size());
	}

}
