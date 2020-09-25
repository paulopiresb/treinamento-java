package variaveis;

public class Primitivos {

	public static void main(String[] args) {
		/*
		 * Hierarquia (do menor pro maior):
		 * boolean = logico (True/False)
		 * char = 1 caracter
		 * 
		 * Para inteiros:
		 * byte = -127/+128
		 * short = -32000... / +32000...
		 * int = -1milhao/+1milhao (default java)
		 * long = 
		 * 
		 * Para reais: diferenciam na exatidão das casas decimais
		 * float = menos precisao
		 * double = dobro de precisao que o float (default java)
		 */
		// Cast=> é um processo de conversão entre dados primitivos (maior => menor)
		float valor = 1000;
		float desconto =  1000 * (float) 2;
		System.out.println(desconto);
		System.out.println(valor==desconto);
	}

}
