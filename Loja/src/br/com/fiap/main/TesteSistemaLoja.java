package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Loja;
import br.com.fiap.beans.Produto;

public class TesteSistemaLoja {

	public static void main(String[] args) {
		// Instanciar objetos
        Loja objLoja = new Loja ();
        Produto objProduto = new Produto ();
        Colaborador objColaborador = new Colaborador ();
        
        
        ///Entradas:
        
        // Loja
        objLoja.setCnpj("0001/00005626");
        objLoja.setRazaoSocial("Churumelas Corporation");
        objLoja.setUnidade(2);
        
        // Produto
        objProduto.setTipo("Manteiga");
        objProduto.setMarca("Sonic");
        objProduto.setQuantidade(1);
        objProduto.setValor(6.50);
                
        // Colaborador
        objColaborador.setNome("Bob Esponja");
        objColaborador.setCargo("Gerente");
        objColaborador.setIdade(24);
        objColaborador.setSalario(2500.58);
        
        
        ///Saídas:
        
        // Loja
        System.out.println("CNPJ: " + objLoja.getCnpj() +
        		"\nRazão Social: " + objLoja.getRazaoSocial() +
        		"\nUnidade: " + objLoja.getUnidade());
        
        //Produto
        System.out.println("\n\nTipo: " + objProduto.getTipo() +
        		"\nQuantidade: " + objProduto.getQuantidade() +
        		"\nValor: " + objProduto.getValor());
        
        //colaborador
        System.out.println("\nNome: " + objColaborador.getNome() +
        		"\nCargo: " + objColaborador.getCargo());
        

      
        
        
        
        
        
        
        
		
		
	}

}
