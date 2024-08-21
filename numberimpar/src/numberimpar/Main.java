package numberimpar;

public class Main {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 100; i++) {
		    if(i % 2 != 0) { // Verifica se o número é ímpar
		        System.out.println(i + " é um número ímpar");
		    } else {
		        System.out.println(i + " é um número par");
		    }
	}

}}
