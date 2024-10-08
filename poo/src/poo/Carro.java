package poo;

public class Carro {

	String marca;
	String modelo;
	int ano;
	double velocidadeAtual;
	
	public Carro(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeAtual = velocidadeAtual;
	}
	
	 public void acelerar(double incremento) {
	        velocidadeAtual += incremento;
	    }
	 
	 public void frear (double decremento) {
		 velocidadeAtual -= decremento;
		 if (velocidadeAtual < 0) {
			velocidadeAtual = 0;
		}
	 }
	 
	 public void exibirDetalhes() {
		 System.out.println("A marca do carro é: " + marca);
		 System.out.println("O modelo do carro é: " + modelo);
		 System.out.println("O ano do carro é: " + ano);
		 System.out.println("A velocidade atual é: " + velocidadeAtual + "km/");
	 }
	
}
