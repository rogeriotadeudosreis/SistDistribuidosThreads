package aula08;

import javax.swing.JOptionPane;

public class TestPrimo {

	public static void main (String []args) {
		String resposta;
		do {
			
			resposta = JOptionPane.showInputDialog("Digite um n�mero: ");
			try {
				long numero = new Long(resposta);
				VerificadorPrimo vf = new VerificadorPrimo(numero);
				vf.start();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "n�mero inv�lido");
			}
			
		}while (!resposta.equals("sair"));
		
		
		
	}

}
