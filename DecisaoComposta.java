import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		double nota1= Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		double nota2= Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		// and => &&
		// or => ||
		double media = (nota1 + nota2) /2;
		if (media>=6) {
			System.out.println("Parabéns " + nome + " você está aprovado!");
		}else if (media<3) {
			System.out.println("Infelizmente você foi reprovado");
		}else {
			System.out.println("Tente o exame");
		}
		System.out.println("Sua média foi: " + media);
		/*
		 * Classes Wrapper´s => são as classes que apoiam os tipos primitivos
		 * double => Double
		 * float => Float
		 * short => Short
		 * int => Integer
		 */
		
		/*
		 * Conversões:
		 * A-) Cast => quando ocorre entre dados do mesmo TIPO (problema é só tamanho)
		 * B-) Parse => quando ocorre entre dados de diferentes tipos (String => Numérico) 
		 */
	
		
		/*Scanner tec = new Scanner(System.in);
		System.out.println("Digite o nome do aluno");
		String nome2 = tec.next() + tec.nextLine();
		
		System.out.println("Digite a primeira nota");
		double n1 = tec.nextDouble(); */

	}

}
