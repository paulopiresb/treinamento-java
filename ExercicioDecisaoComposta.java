import javax.swing.JOptionPane;

public class ExercicioDecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Solicitar nome e idade de uma pessoa
		 * E ir�o exibir:
		 * 
		 *"Voc� � obrigado a votar" => com idade maior ou igual a 18 e menor ou igual a 70
		 *"Pra voc� o voto � facultativo" => 16, 17 ou maior que 70 anos
		 *"Voc� n�o pode votar" => menor que 16 anos
		 */
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));
		
		if (idade<16) {
			System.out.println(nome + " voc� ainda n�o pode ter o prazer de votar!");
		}else if(idade>=18 && idade<=70) {
			System.out.println(nome + " voc� � obrigado a votar!");
		}else {
			System.out.println(nome + " o voto � facultativo pra voc�!");
		}

	}

}
