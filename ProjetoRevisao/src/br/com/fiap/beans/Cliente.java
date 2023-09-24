package br.com.fiap.beans;

public class Cliente {
	
	// visibilidade, tipo de dado e a variavel
	private String nome;
	private int idade;
	private Endereco endereco;
	
	// Setters (Entrada) e Getters (Exibir)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

}
