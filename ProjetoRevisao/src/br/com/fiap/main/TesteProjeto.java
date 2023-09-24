package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteProjeto {

	public static void main(String[] args) {
		// Instanciar objetos
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		Colaborador objColaborador = new Colaborador();
		
		// Entradas 
		// Cliente 
		objCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
		objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
		
		
		// Endereco 
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro"));
		objEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
		
		objCliente.setEndereco(objEndereco);
		
		// Colaborador 
		objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
		objColaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog
				("Digite o salario")));
		
		System.out.println("INFORMAÇÕES DO CLIENTE" + 
		"\nNome: " + objCliente.getNome() + 
		"\nIdade: " + objCliente.getIdade() + 
		"\n\nENDEREÇO DO CLIENTE" + 
		"\nLogradouro: " + objCliente.getEndereco().getLogradouro() + 
		"\nCEP: " + objCliente.getEndereco().getCep() + 
		"\nNumero: " + objCliente.getEndereco().getNumero() + 
		"\n\nINFORMAÇÕES DO COLABORADOR" + 
		objColaborador.getTudo());	
		
		
		System.out.println("\n\nINFORMAÇÃO DE TAXA\n" +  
				objColaborador.pagaTaxa());

	}

}
