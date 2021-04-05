package aula08;

public class Operador implements Runnable {

	private boolean bol;
	private Troca obj;

	public Operador(Troca obj, boolean bol) {
		this.bol = bol;
		this.obj = obj;
	}

	@Override
	public void run() {
		while (true) {
			obj.faca(bol);			
		}
	}
}
