package com.italo.model;

import java.util.Objects;

public class pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public pessoa() {
	}

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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, sexo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pessoa other = (pessoa) obj;
		return idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
	}
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
