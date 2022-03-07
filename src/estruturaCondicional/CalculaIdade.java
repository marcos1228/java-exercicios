package estruturaCondicional;

import java.util.Scanner;

public class CalculaIdade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		String nome;
		System.out.println("INFOME O SEU NOME");
		nome = scanner.next();
		System.out.println("INFROME O DIA DE NASCIMENTO");
		idade = scanner.nextInt();

		if (idade <= 12) {
			System.out.println(nome);
		} else if (idade >= 18)
			System.out.println("Adolecente" + nome);
		else if (idade <= 19)
			System.out.println("Jovens" + nome);
		scanner.close();
	}

}
