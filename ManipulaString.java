package variaveis;

import java.util.Scanner;

public class ManipulaString {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite o e-mail");
		String email = tec.next();
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		//NUNCA a segundo coordenada ser� maior que a primeira
		System.out.println("Do 2� at� 4�: " + email.substring(1,4));
		System.out.println("A partir do 3�:" + email.substring(2));
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1));
		System.out.println("Primeiro Caracter: " + email.charAt(0));
		System.out.println("Comparando Strings: " + email.equals("xpto@xpto.com"));
		System.out.println("Comparando sem Caixa: " + email.equalsIgnoreCase("xPtO@xPTO.com"));
		
	}

}
