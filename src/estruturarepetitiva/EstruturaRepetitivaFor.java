package estruturarepetitiva;

import java.util.Iterator;
import java.util.Scanner;

public class EstruturaRepetitivaFor {
	/*
	 * estrutura de repetição for(para) É uma estrutura de controle que repete um
	 * bloco de comandos para um certo intervalo de valores Quando usa-se: quando se
	 * sabe previamente a quantidade de repetições, ou intervalo de valores.
	 */
	/*
	 * Sintaxe for(inicio; condição; incremento){ comando 1 comando 2 } inicio-->
	 * Executa somente na primeira vez condição--> verdadeiro(executa e volta)
	 * condição--> falso(pula fora)
	 */
	/*
	 * Por exemplo: Fazer um programa que lê um valor inteiro N e depois N números
	 * inteiros. Ao final, mostra a soma dos N números lidos
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int soma = 0;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			soma += i + x;
		}
		System.out.println("Somar dos valores" + soma);

		scanner.close();
	}
}
