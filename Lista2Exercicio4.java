import javax.swing.JOptionPane;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo  número"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
		
		if (num1==num2 || num2==num3 || num1==num3) {
			System.out.println("Existem números iguais");
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
