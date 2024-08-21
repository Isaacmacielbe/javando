package fundamentos;

import java.util.Iterator;

public class Sintaxbasic {

	public static void main(String[] args) {
		String name;
		int idade;
		
		//String e int são os tipos de dados
		//Name e idade são os nomes de variáveis
		//O tipo de dados deve ser escolhido com base nas necessidade do programa

		//Tipos de dados primitivos: byte , short , int , long , float , double , boolean e char
		double idade1 = 20.5;
		boolean idadeCorreta = false;
		
		//Tipos de dados não primitivos: String , Arrays e Classes
		String sobreNome;
		
		System.out.println(idade1);
		System.out.println(idadeCorreta);
		
		
		int idadeDoFulano = 30;
		int idadeDoIsaac = 23;
		//// Soma das idades
		int soma = idadeDoFulano + idadeDoIsaac;
		
		//Quero saber quem é o mais velho
		if (idadeDoFulano > idadeDoIsaac) {
			System.out.println("é mais velho que o Isaac");
		} else {
			System.out.println("Mais novo que o Isaac");
		}
		
		//Calculando a media das idades
		double media = (double) soma / 2;
		System.out.println(media);
		
		//Convertendo a media para int
		int mediaInt = (int) media;
		System.out.println(mediaInt);
		 
		
		switch (mediaInt) {
		case 20: {
			System.out.println("A média é 20 ");
			
		}
		case 21:{
			System.out.println("A média é 21 ");
		}
		case 22: {
			System.out.println("A Média é 22 ");
		}
		case 23: {
			System.out.println("A Média é 23 ");
		}
		case 24: {
			System.out.println("A Média é 24 ");
		}
		case 25: {
			System.out.println("A Média é 25 ");
		}
		case 26: {
			System.out.println("A Média é 26 ");
		}
		case 27: {
			System.out.println("A Média é 27 ");
		}
		default: 
			System.out.println("A média é " + mediaInt + ", fora dos casos específicos.");
	}
		
		
		
		int valorBancarioAtual = 3450;
		while (valorBancarioAtual >= 5000) {
			System.out.println(valorBancarioAtual);
			valorBancarioAtual++;
		}
		
		
		int contador = 0;
		while (contador < 50) {
			System.out.println("Repetição até o 50: " + contador);
			contador++;
		}
		
      for (int contador1 = 0; contador1 < 50; contador1++) {
					System.out.println(contador1);
		}

      
      int SaldoBancario = 2000;
      int Descontos = 1250;

      while (SaldoBancario > 1000) {
          SaldoBancario -= Descontos;
          System.out.println("Saldo atual: " + SaldoBancario);
      }
      
      

}
	}
