package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
	 
	//aumentar o valor do carro 
	void atualizarValor(double porcentagem){
		valor *= (1+ porcentagem);
	}
	
	//Criar um metodo que calcula e retorna o valor so seguro do carro
	//Seguro do carro eh baseado no valor, 5% do valor do carro
	double calcularSeguro () {
		double seguro = valor *0.05;
		return seguro;
	}
	
	//Criar um metodo que recebe a quantidade de parcelas, calcula e retorna
	//o calor da parcebela do seguro
	double calcularValorParcelasSeguro(int parcelas) {
		double parcela = (valor *00.5) / parcelas;
		return parcela;
	}
}
	