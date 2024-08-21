package pooExcercicies2;

public class ContaBancaria {
	String numeroConta;
	String titular;
	double saldo;
	
	public ContaBancaria(String numeroConta, String titular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}


	public void depositar(int saldo) {
		this.saldo += saldo;
		System.out.println("Deposito feito.");
	}
	
	   public void sacar(double valor) {
	        if (valor > saldo) {
	            System.out.println("Saldo insuficiente. Saque não realizado.");
	        } else {
	            this.saldo -= valor;
	            System.out.println("Saque feito.");
	        }
	        
	    }
	   public void ExibirSaldo() {
	    	System.out.println(saldo);
	    }
	
}
