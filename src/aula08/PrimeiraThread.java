package aula08;

public class PrimeiraThread extends Thread {

	public PrimeiraThread(String nome) {
		super(nome);
	}

	public void run() {
		int limite = 30000;
		int i = 0;
		while (i < limite) {
			System.out.printf("\n Thread: %s (executando) - %5d", getName(), i++);
		}
	}

}
