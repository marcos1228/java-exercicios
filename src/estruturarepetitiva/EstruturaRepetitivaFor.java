package estruturarepetitiva;

import java.util.Iterator;
import java.util.Scanner;

public class EstruturaRepetitivaFor {
	/*
	 * estrutura de repeti��o for(para) � uma estrutura de controle que repete um
	 * bloco de comandos para um certo intervalo de valores Quando usa-se: quando se
	 * sabe previamente a quantidade de repeti��es, ou intervalo de valores.
	 */
	/*
	 * Sintaxe for(inicio; condi��o; incremento){ comando 1 comando 2 } inicio-->
	 * Executa somente na primeira vez condi��o--> verdadeiro(executa e volta)
	 * condi��o--> falso(pula fora)
	 */
	/*
	 * Por exemplo: Fazer um programa que l� um valor inteiro N e depois N n�meros
	 * inteiros. Ao final, mostra a soma dos N n�meros lidos
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
