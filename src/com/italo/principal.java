package com.italo;

import com.italo.model.pessoa;

public class principal {

	public static void main(String[] args) {
		
		pessoa person = new pessoa();
		person.setNome("Italo Sanches Freitas");
		person.setIdade(27);
		person.setSexo("Masculino");
		
		System.out.println("Nome: "+person.getNome());
		System.out.println("Idade: "+person.getIdade()+" anos");
		System.out.println("Sexo: "+person.getSexo());
		System.out.println("Fim da impressao dos dados");
	
	}

}
