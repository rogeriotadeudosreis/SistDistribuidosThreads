package aula08;

public class SegundaThread implements Runnable {

	private String nome;

	public SegundaThread(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {

		int limite = 100000;
		int i = 0;

		while (i < limite) {
			System.out.printf("\n Thread: %s (executando) - %5d", nome, i++);
		}

	}

}
