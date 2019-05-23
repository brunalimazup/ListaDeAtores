package br.com.zup.heranca;

import java.util.ArrayList;
import java.util.List;

public class Programador extends ExercicioPessoa {

	private List<String> linguagensUsadas = new ArrayList<String>();
	private int anosExperiência;
	private boolean gostaDeCafe;

	public Programador(String nome, String sobrenome, int idade, List<String> linguagensUsadas, int anosExperiência,
			boolean gostaDeCafe) {
		super(nome, sobrenome, idade);
		this.linguagensUsadas = linguagensUsadas;
		this.anosExperiência = anosExperiência;
		this.gostaDeCafe = gostaDeCafe;
	}

	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}

	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}

	public int getAnosExperiência() {
		return anosExperiência;
	}

	public void setAnosExperiência(int anosExperiência) {
		this.anosExperiência = anosExperiência;
	}

	public boolean isGostaDeCafe() {
		return gostaDeCafe;
	}

	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}

	public String toString() {
		String programador = "";
		programador += "nome: " + super.getNome() + "\n";
		programador += "sobrenome: " + super.getSobrenome() + "\n";
		programador += "idade: " + super.getIdade() + "\n";
		programador += "Linguagens: " + this.linguagensUsadas + "\n";
		programador += "Anos de Experiencia: " + this.anosExperiência + "\n";
		programador += "Gosta de café? " + this.gostaDeCafe;

		return programador;

	}

}
