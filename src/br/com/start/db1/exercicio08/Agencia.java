package br.com.start.db1.exercicio08;

public class Agencia extends Conta{
	
	private Integer numero;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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
}
