package br.com.polimorfismo.beans;

import br.com.polimorfismo.padrao.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{

		private String projetoConclusao;
		private int cargaHorariaEstagio;
		
		public void calcularMensalidade(double fator) {
			super.setMensalidade((super.getDuracao()*fator*600)+(cargaHorariaEstagio*12));
		}

		public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
				int cargaHorariaEstagio) {
			super.setAll(descricao, periodo, mensalidade, duracao);
			this.projetoConclusao = projetoConclusao;
			this.cargaHorariaEstagio = cargaHorariaEstagio;
		}
		
		public String getAll() {
			return
					"Projeto Conclusão: " + projetoConclusao + "\n" +
					"Carga Horario Estagio: " + cargaHorariaEstagio + "\n" +
			super.getAll();		
		}
				
		public Bacharelado() {
			super();
		}

		public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
				int cargaHorariaEstagio) {
			super(descricao, periodo, mensalidade, duracao);
			this.projetoConclusao = projetoConclusao;
			this.cargaHorariaEstagio = cargaHorariaEstagio;
		}
		
		public String getProjetoConclusao() {
			return projetoConclusao;
		}
		public void setProjetoConclusao(String projetoConclusao) {
			this.projetoConclusao = projetoConclusao;
		}
		public int getCargaHorariaEstagio() {
			return cargaHorariaEstagio;
		}
		public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
			this.cargaHorariaEstagio = cargaHorariaEstagio;
		}

		@Override
		public String exibirDetalhes() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
}
