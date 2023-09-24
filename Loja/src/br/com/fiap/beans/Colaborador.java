package br.com.fiap.beans;

public class Colaborador {
	
	// Visibilidade, tipo de dado e variável
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	
	// Atalho pra salvar tudo --> ctrl + shift + S
	// Setters (entrada) e Getters (exibir)
		
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	

}
