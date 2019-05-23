package br.com.zup.dois;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.zup.heranca.Ator;
import br.com.zup.heranca.ExercicioPessoa;
import br.com.zup.heranca.Programador;

public class TesteDois {
	
	public static void main(String[] args) {
		List<String> filmes = new ArrayList<>(Arrays.asList("Vingadores", "Lucy", "A vigilante do amanhã"));
		
		Ator ator = new Ator("Scarlett" , "Johansson", 34 , filmes, false, 1984, "Vingadores");
		System.out.println(ator);
		
		List<String> linguagens = new ArrayList<>(Arrays.asList("Java", "JavaScript", "C", "Python"));
		
		Programador programador = new Programador("Milena", "Figueredo", 19 , linguagens, 1, true);
		System.out.println(programador);
	}

}
