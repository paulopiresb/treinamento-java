import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * For => � pr�prio para quando n�o existe a intera��o com o usu�rio
		 * Sintaxe:
		 * 1� - vari�vel que vai controlar o la�o 
		 * 2� - condi��o
		 * 3� - evolu��o da contagem
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		for (int cont=1;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
		
		
	}

}
