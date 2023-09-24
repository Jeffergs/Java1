package br.com.fiap.beans;

public class Loja {
	
	// Visibilidade, tipo de dado e variável
	private String cnpj; 
	private String razaoSocial;
	private int unidade;
	private Produto produto; // Produto = variave/atributo de referência
	// A variável produto se refere a uma classe Produto
	//A clase loja vai ter acesso a tudo da classe produto
	
	
	// Setters (entrada) e Getters (exibir)
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

	

}
