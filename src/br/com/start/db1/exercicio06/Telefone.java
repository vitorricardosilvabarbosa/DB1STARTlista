package br.com.start.db1.exercicio06;

public class Telefone extends Restaurante{
	
	private Integer DDD;
	
	private Integer Numero;
	
	public Integer getDDD() {
		return DDD;
	}

	public void setDDD(Integer dDD) {
		DDD = dDD;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public String exibirTelefoneFormatado() {
		return "_";
	}

}
