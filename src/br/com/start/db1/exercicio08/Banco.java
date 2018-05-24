package br.com.start.db1.exercicio08;

import java.util.Date;
import java.util.List;

public class Banco {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private Date dataFundacao;
	
	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	private String publico;
	
	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}
	
	public Boolean isPublico() {
		return isPublico();
	}
	
	private List<Conta> Conta;
	
	public List<Conta> getConta() {
		return Conta;
	}

	public void setConta(List<Conta> conta) {
		Conta = conta;
	}
}
