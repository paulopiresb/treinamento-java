import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {

		// Plus: exibir no final quantas tentativas ele usou.
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
		int chute=0;
		int contador=0;
		// Usando Do
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Acerte o nº"));
			contador+=1; //contador++; // contador=contador+1;
			if(chute>numero) {
				JOptionPane.showMessageDialog(null, "Você chutou alto");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Você chutou baixo");
			}
		}while(numero!=chute);
		
		System.out.println("Parabéns você acertou utilizando " + contador + " tentativa(s)!");
		
		
	}

}
