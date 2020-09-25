import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));
		while(ano>2001 || ano<1000) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano novamente"));
		}
		
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mês"));
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mês novamente"));
		}
		
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia"));
		if (mes==2) {
			while(dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}else if (mes==4 || mes==6 || mes==9 || mes==11) {
			while(dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}else {
			while(dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}
		
		System.out.println(dia + "/" + mes + "/" + ano);
		
	}

}
