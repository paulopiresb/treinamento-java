package variaveis;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Digite seu nome: ");
		String nome = teclado.next() + teclado.nextLine();
		System.out.println("Digite sua idade: ");
		int idade=teclado.nextInt();
		System.out.println("Digite sua altura");
		double altura=teclado.nextDouble();
		System.out.println("Digite seu peso");
		double peso=teclado.nextDouble();
		System.out.println("Nome...: "+nome);
		System.out.println("Idade..: "+idade+" ano(s)");
		System.out.println("Altura.: "+altura+" mts.");
		System.out.println("Peso...: "+peso+" kgs.");
		double imc = peso / (altura * altura);
		System.out.println("IMC....: "+imc);
		
		
	}

}
