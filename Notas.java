package variaveis;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = teclado.next()+teclado.nextLine();
		System.out.println("Digite a nota 1: ");
		double nota1 = teclado.nextDouble();
		System.out.println("Digite a nota 2: ");
		double nota2 = teclado.nextDouble();
		
		double media = (nota1+nota2)/2;
		System.out.println("Aluno: " + nome);
		System.out.println("M�dia: " + media);
		//%f => n�meros reais 
		//%d => n�meros inteiros
		//%s => strings
		System.out.printf("Aluno %s sua m�dia � %.1f \n", nome, media);
		
	}

}
