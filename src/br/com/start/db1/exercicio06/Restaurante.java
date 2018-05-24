package br.com.start.db1.exercicio06;

import java.util.Date;

public class Restaurante {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private Boolean serveCafeDaManha;
	
	public Boolean getServeCafeDaManha() {
		return serveCafeDaManha;
	}
	public void setServeCafeDaManha(Boolean serveCafeDaManha) {
		this.serveCafeDaManha = serveCafeDaManha;
	}
	
	private Boolean serveAlmoco;
	
	public Boolean getServeAlmoco() {
		return serveAlmoco;
	}
	public void setServeAlmoco(Boolean serveAlmoco) {
		this.serveAlmoco = serveAlmoco;
	}

	private Boolean serveJantar;
	
	public Boolean getServeJantar() {
		return serveJantar;
	}
	public void setServeJantar(Boolean serveJantar) {
		this.serveJantar = serveJantar;
	}

	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {
	}
	
}
