package aula08;

import javax.swing.JOptionPane;

public class TestPrimo {

	public static void main (String []args) {
		String resposta;
		do {
			
			resposta = JOptionPane.showInputDialog("Digite um número: ");
			try {
				long numero = new Long(resposta);
				VerificadorPrimo vf = new VerificadorPrimo(numero);
				vf.start();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "número inválido");
			}
			
		}while (!resposta.equals("sair"));
		
		
		
	}

}
