package br.com.polimorfismo.implementacao;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.tela.Magica;

public class TesteFormacao {

	public static void main(String[] args) {

		Formacao formacao = new Formacao();
		char resp = Magica.s("Escolha:\n<1> Tecnolo \n<2> Medio \n<3>Bacharelado").charAt(0);
		//Preencher o que é comum
		String descricao = Magica.s("Descrição");
		int periodo = Magica.i("Digite <1> para Manhã, ");
		
		if (resp=='1') {
			formacao = new Tecnologo(
					descricao,
					periodo,
					0,
					0,
					true
				);	
			
		}else if (resp=='2') {
			formacao = new Medio(
					descricao,
					periodo,
					0,
					0,
					Magica.s("Tipo")
				);	

		}else if (resp=='3') {
			formacao = new Bacharelado(
					descricao,
					periodo,
					0,
					0,
					Magica.s("Projeto Conclusão"),
					Magica.i("Carga Horária Estagio")
				);	
		}else {
			System.out.println("Opção inválida!");
		}
		formacao.definirDuracao();
		formacao.calcularMensalidade(Magica.f("Digite o fator"));
		System.out.println(formacao.getAll());
	}

}
