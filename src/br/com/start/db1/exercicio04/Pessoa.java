package br.com.start.db1.exercicio04;

import java.util.Date;
import java.util.List;

public class Pessoa {
	
	private String nome;
	
	private Date dataNascimento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Sexo sexo;
	
	private List<Telefone> telefones;

}
