package br.com.zup.heranca;

import java.util.ArrayList;
import java.util.List;

public class Ator extends ExercicioPessoa {

	private List<String> filmesParticipados = new ArrayList<String>();
	private boolean temOscar;
	private int anoNascimento;
	private String melhorFilme;

	public Ator(String nome, String sobrenome, int idade, List<String> filmesParticipados, boolean temOscar,
			int anoNascimento, String melhorFilme) {
		super(nome, sobrenome, idade);
		this.filmesParticipados = filmesParticipados;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
		this.melhorFilme = melhorFilme;
	}

	public List<String> getFilmesParticipados() {
		return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
		this.filmesParticipados = filmesParticipados;
	}

	public boolean isTemOscar() {
		return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}

	public String toString() {

		String Ator = "";
		Ator += "Nome: " + super.getNome() + "\n";
		Ator += "Sobrenome: " + super.getSobrenome() + "\n";
		Ator += "Idade: " + super.getIdade() + "\n";
		Ator += "Filmes Participantes: " + this.filmesParticipados + "\n";
		Ator += "Tem Oscar? " + this.temOscar + "\n";
		Ator += "Ano de Nascimentos: " + this.anoNascimento + "\n";
		Ator += "Melhor Filme: " + this.melhorFilme + "\n";

		return Ator;

	}

}
