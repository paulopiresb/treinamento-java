import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Qtde Faltas"));
		double media=0;
		if (faltas<=20) {
			double nota1= Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
			double nota2= Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
			media = (nota1 + nota2) /2;
			
			if (media>=6) {
				System.out.println("Parab�ns " + nome + " voc� est� aprovado!");
			}else if (media<3) {
				System.out.println("Infelizmente voc� foi reprovado");
			}else {
				System.out.println("Tente o exame");
			}
		}else {
			System.out.println("Voc� foi reprovado por falta");
		}
		System.out.println("Sua m�dia foi: " + media);
	}

}
