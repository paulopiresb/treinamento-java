package br.com.tratamento.principal;

public class TesteExcecoes {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("1");
			System.out.println(num);
			
			String palavra="";
			System.out.println(palavra.length());
			
			int nums[] = new int[2];
			nums[0]=521;
			nums[1]=350;
			nums[2]=150;
			
		}catch(NumberFormatException e) {
			System.out.println("Número Inválido");
		}catch(NullPointerException e) {
			System.out.println("Objeto nulo");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vetor estourou");
		}catch(Exception e) {
			System.out.println("Erro desconhecido");
			e.printStackTrace();
		}
	}

}
