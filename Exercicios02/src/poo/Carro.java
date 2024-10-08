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
}
