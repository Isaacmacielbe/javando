package poo;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Chvrolet", 2020);
		carro.acelerar(60.0);
		carro.frear(10.0);
		carro.exibirDetalhes();
	}

}
