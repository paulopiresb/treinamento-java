import javax.swing.JOptionPane;

public class Exercio4Slide77 {

	public static void main(String[] args) {
		String nome="";
		int idade=0;
		int contMaioresDeIdade=0;
		int qtdePessoas=0;
		int totalIdades=0;
		int idadeMaisNova=0;
		int idadeMaisVelha=0;
		String nomeMaisNova="";
		String nomeMaisVelha="";
		do {
			nome = JOptionPane.showInputDialog("Nome").toUpperCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			if(idade>17) {
				contMaioresDeIdade++; // contMaioresIdade=contMaioresIdade+1; // contMaioresIdade+=1;
			}
			qtdePessoas++;
			totalIdades+=idade; // totalIdades=totalIdades+idade;
			if (qtdePessoas==1) {
				idadeMaisVelha=idade;
				nomeMaisVelha=nome;
				idadeMaisNova=idade;
				nomeMaisNova=nome;	
			}else {
				if (idade>idadeMaisVelha) {
					idadeMaisVelha=idade;
					nomeMaisVelha=nome;
				}else if (idade<idadeMaisNova) {
					idadeMaisNova=idade;
					nomeMaisNova=nome;	
				}
			}
		}while(JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0)=='S');
		
		System.out.println("Pessoas maiores de idade: " + contMaioresDeIdade);
		System.out.println("A média de idade é: " + (totalIdades/qtdePessoas));
		System.out.println("Pessoa mais experiente: " + nomeMaisVelha + "com : " + idadeMaisVelha + " anos");
		System.out.println("Pessoa mais jovem: " + nomeMaisNova+ "com : " + idadeMaisNova + " anos");	
	}

}
