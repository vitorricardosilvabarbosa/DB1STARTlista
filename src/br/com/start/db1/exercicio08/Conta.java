package br.com.start.db1.exercicio08;

public class Conta {
	
	private Integer numeroDaConta;
	
	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	private Integer digitoVerificador;
	
	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}
	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	
	public void calcularDigitoVerificador() {
	}
	
	public Boolean validarDigitoVerificador() {
		return validarDigitoVerificador();
	}
	
	private Agencia agencia;
	
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
