import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		float valorDiaria=80;
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Qtde Diarias"));
		if (diarias>15) {
			//valorDiaria=valorDiaria + (float) 5.5;
			valorDiaria+=5.5;
		}else if(diarias==15) {
			valorDiaria+=6;
		}else {
			valorDiaria+=8;
		}
		System.out.println("Conta:" + (valorDiaria*diarias));
	}

}
