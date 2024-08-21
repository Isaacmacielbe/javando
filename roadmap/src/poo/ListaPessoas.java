package poo;

import java.util.ArrayList;

public class ListaPessoas {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Isaac", 23));
		pessoas.add(new Pessoa("Carlos", 22));
        pessoas.add(new Pessoa("Beatriz", 34));
        pessoas.add(new Pessoa("Daniel", 19));
        
     // Exibir lista ordenada
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

	}

}
