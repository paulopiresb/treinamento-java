import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * For => é próprio para quando não existe a interação com o usuário
		 * Sintaxe:
		 * 1º - variável que vai controlar o laço 
		 * 2º - condição
		 * 3º - evolução da contagem
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		for (int cont=1;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
		
		
	}

}
