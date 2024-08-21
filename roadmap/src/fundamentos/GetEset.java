package fundamentos;

public class GetEset {
	
	String nome;
	String sobreNome;
	int idade;
	String email;
	
	//Get e set são usandos no POO para acessar e modificar os atribuitos de uma classe de forma ocntrolada.
	//Get = usado para acessar o valor de uma variavel privada de uma ckasse, ex: "getNome()" retornaria o valor do atribuito nome;
	//Set = usada para modificar o valor de uma variavel privada de uma classe
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
