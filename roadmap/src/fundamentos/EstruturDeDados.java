package fundamentos;

public class EstruturDeDados {

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5};
		System.out.println(numeros[0]);
		
		numeros [0] = 1;
		System.out.println(numeros.length);
		
		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[0]);
		
		 int[][] graph = {
		            {0, 1, 1, 0},  // Vértice 0 está conectado a 1 e 2
		            {1, 0, 1, 1},  // Vértice 1 está conectado a 0, 2 e 3
		            {1, 1, 0, 1},  // Vértice 2 está conectado a 0, 1 e 3
		            {0, 1, 1, 0}   // Vértice 3 está conectado a 1 e 2
		        };
		 
		// Imprimir a matriz
	        for (int i = 0; i < graph.length; i++) {
	            for (int j = 0; j < graph[i].length; j++) {
	                System.out.print(graph[i][j] + " ");
	            }
	            System.out.println();
		
	}
	
	}

}
