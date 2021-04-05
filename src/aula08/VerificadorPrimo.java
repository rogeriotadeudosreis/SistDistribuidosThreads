package aula08;

public class VerificadorPrimo extends Thread {

	private long numero;

	public VerificadorPrimo(long numero) {
		this.numero = numero;
	}

	public void run() {
		boolean primo = true;

		for (int i = 2; i < numero; i++) {

			if ((numero % i) == 0) {
				primo = false;
			}
		}

		if (primo) {
			System.out.printf("\nO n�mero: %d � primo", numero);
		} else {
			System.out.printf("\nO n�mero: %d n�o � primo", numero);
		}
	}
}
