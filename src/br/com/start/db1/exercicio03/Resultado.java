package br.com.start.db1.exercicio03;

public class Resultado extends Calculadora{

	public void zerarCalculo(double primeiroValor, double segundoValor) {
		primeiroValor = 0d;
		segundoValor = 0d;
	}

	public Double somar(Double primeiroValor, Double segundoValor) {
		return primeiroValor + segundoValor;
	}

	public Double subtrair(Double primeiroValor, Double segundoValor) {
		return primeiroValor - segundoValor;
	}

	public Double multiplicar(Double primeiroValor, Double segundoValor) {
		return primeiroValor * segundoValor;
	}

	public Double dividir(Double primeiroValor, Double segundoValor) {
		return primeiroValor / segundoValor;
	}
	
}
