import javax.swing.JOptionPane;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo  n�mero"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero"));
		
		if (num1==num2 || num2==num3 || num1==num3) {
			System.out.println("Existem n�meros iguais");
		}else {
			if (num1>num2 && num1>num3) {
				System.out.println(num1);
				if (num2>num3) {
					System.out.println(num2);
					System.out.println(num3);
				}else {
					System.out.println(num3);
					System.out.println(num2);
				}
			}else if(num2>num3 && num2>num1) {
				System.out.println(num2);
				if (num1>num3) {
					System.out.println(num1);
					System.out.println(num3);
				}else {
					System.out.println(num3);
					System.out.println(num1);
				}
			}else {
				System.out.println(num3);
				if (num1>num2) {
					System.out.println(num1);
					System.out.println(num2);
				}else {
					System.out.println(num2);
					System.out.println(num1);
				}
			}
		}
	}
}
