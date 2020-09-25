import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
		while (email.indexOf("@")<1 || email.length()<5) {
			email= JOptionPane.showInputDialog("Digite um email válido").toLowerCase();
		}
		System.out.println(email.substring(0,email.indexOf("@")));
	}

}
