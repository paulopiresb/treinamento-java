import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		char resp=0;
		int num1=0;
		int num2=0;
		do {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1º numero"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2º numero"));
			JOptionPane.showMessageDialog(null, "Soma: " + (num1+num2));
			resp = JOptionPane.showInputDialog("Digite <S> para Continuar").toUpperCase().charAt(0);
		}while(resp=='S');

	}

}
