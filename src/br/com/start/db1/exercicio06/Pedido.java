package br.com.start.db1.exercicio06;

import java.util.Date;

public class Pedido extends Restaurante{
	
	private Integer numero;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	private Integer numeroDaMesa;
	
	public Integer getNumeroDaMesa() {
		return numeroDaMesa;
	}
	public void setNumeroDaMesa(Integer numeroDaMesa) {
		this.numeroDaMesa = numeroDaMesa;
	}

	private Date dataDoPedido;
	
	public void CadastrarPedido() {
	}
	public void fecharPedido() {
	}
	public Date getDataDoPedido() {
		return dataDoPedido;
	}
	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

}
