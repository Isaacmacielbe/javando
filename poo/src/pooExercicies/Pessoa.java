package pooExercicies;

public class Pessoa {
	String nome;
    int idade;
	String cpf;
	
	
	public Pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}


	public void fazerAniversario() {
		idade++;
	}
	
	public void exibirInformacoes() {
		System.out.println("Meu nome é " + nome);
		System.out.println("Minha idade é " + idade);
		System.out.println("Meu cpf é " + cpf);
	}
}
