package br.com.fiap.beans;

public class Endereco {

	// Visibilidade, tipo de dado e a variavel
	private String logradouro;
	private String cep;
	private int numero;
	
	// Setters (Entrada) e Getters (Exibir)
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
