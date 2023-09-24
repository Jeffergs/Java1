package br.com.fiap.beans;

public class Colaborador {
	
	// Visibilidade, tipo de dado e variavel 
	private String nome;
	private double salario;
	
	// Setters (Entrada) e Getters (Retornar/Exibir)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// metodo get que exibe o resultado para mais de um atributo 
	public String getTudo() {
		
		return "\nNome: " + nome + "\nSalario: " + salario;
	}
	
	// if else 
	public String pagaTaxa() {
		String informacao = null;
		if (salario >= 22000) {
			informacao = "Paga Taxa";
		}else {
			informacao = "Não Paga Taxa";
		}
		
		return informacao;		
	}

}
