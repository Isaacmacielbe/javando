package excecoes;

public class ExercicieOne {

	public static void main(String[] args) {
		 
		//try é onde você coloca o código que pode lançar uma exceção.
		try {
			int resultado = 10 / 0;		
		} 
		//O bloco de código dentro do catch captura e trata a exceção
		catch (ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
		} 
		//O bloco finally é opcional e será executado sempre, independentemente de uma exceção ser lançada ou não. 
		finally {
			System.out.println("Bloco finally executado");
		}

	}

}
