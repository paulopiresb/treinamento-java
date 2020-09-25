import javax.swing.JOptionPane;

public class ExercicioDecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Solicitar nome e idade de uma pessoa
		 * E irão exibir:
		 * 
		 *"Você é obrigado a votar" => com idade maior ou igual a 18 e menor ou igual a 70
		 *"Pra você o voto é facultativo" => 16, 17 ou maior que 70 anos
		 *"Você não pode votar" => menor que 16 anos
		 */
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));
		
		if (idade<16) {
			System.out.println(nome + " você ainda não pode ter o prazer de votar!");
		}else if(idade>=18 && idade<=70) {
			System.out.println(nome + " você é obrigado a votar!");
		}else {
			System.out.println(nome + " o voto é facultativo pra você!");
		}

	}

}
