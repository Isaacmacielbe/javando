package excecoes;

public class ExercicieTwo {

	public static void main(String[] args) {
		int numerador = 0;
		int denominador = 10;
		
		//try - define um bloco de código onde pode ocorrer uma exceção;
		try {
			int resultado = numerador / denominador;
			System.out.println("Resultado: " + resultado);
		} 
		//catch - define um bloco de código onde as exceções são tratadas;
		catch (ArithmeticException e) {
			System.out.println("Erro: Não é possível dividir por zero.");
			e.printStackTrace(); // Imprime a stack trace para ajudar a identificar a origem do erro
		}
	}
}

// Uma exceção se trata de algum tipo de condição excepcional que ocorre durante a execução de um programa.
//As exceções em Java são usadas para tratar erros que ocorrem durante a execução do programa, e não para preveni-los