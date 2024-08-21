package herança;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.idade = 3;
        cachorro.comer();
        cachorro.latir();
        
        Gato gato = new Gato();
        gato.nome = "Xani";
        gato.idade = 1;
        gato.miar();
        gato.dormir();

	}

}
