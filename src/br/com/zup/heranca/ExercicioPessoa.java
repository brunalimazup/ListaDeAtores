package br.com.zup.heranca;

public class ExercicioPessoa {

	private String nome;
	private String sobrenome;
	public String getNome() {
		return nome;
	}

	private int idade;

	public ExercicioPessoa(String nome, String sobrenome, int idade) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;

	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
