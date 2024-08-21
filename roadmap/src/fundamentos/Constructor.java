package fundamentos;

public class Constructor {

	String nome;
	String sobreNome;
	int idade;
	String email;
	
	//Constructor é usada para inicializar os objetos de uma classe
	//Usado automaticamento quando um novo objeto é criado
	
	public Constructor(String nome, String sobreNome, int idade, String email) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.email = email;
	}
	
	
}
