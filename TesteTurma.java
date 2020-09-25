package br.com.universidadereferencia.principal;

import br.com.universidadereferencia.beans.Aluno;
import br.com.universidadereferencia.beans.Curso;
import br.com.universidadereferencia.beans.Endereco;
import br.com.universidadereferencia.beans.Turma;
import br.com.universidadereferencia.tela.Magica;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma = new Turma(
				Magica.s("Sigla"),
				Magica.s("Periodo"),
				new Curso(
						Magica.s("Nome do Curso"),
						Magica.f("Valor do Curso"),
						Magica.i("Carga Horaria")
						),
				new Aluno(
						Magica.i("RM"),
						Magica.s("Nome do Aluno"),
						Magica.s("Email"),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Complemento"),
								Magica.s("Número"),
								Magica.s("Cidade"),
								Magica.s("Bairro"),
								Magica.s("UF"),
								Magica.s("CEP")
								)
							
							)
				);
		
		System.out.println(turma.getAluno().getEndereco().getBairro());
        System.out.println(turma.getAluno().getNome());
        System.out.println(turma.getCurso().getNome());
        System.out.println(turma.getSigla());
		
		
	}

}
