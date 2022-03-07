package estruturarepetitiva;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		/*
		 * while(enquanto) é uma estrutura de controle que repete um bloco de comandos,
		 * enquanto uma condição for verdadeira. Quando não usar: Quando não se sabe
		 * previamente a quantidade de repetições que será realizadas
		 */
		/*
		 * Fazer um programa que lê números inteiros até que um zero seja lido. Ao final
		 * mostra a soma dos números lidos.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um número");
		int soma = 0;
		int numero = scanner.nextInt();
		while (numero != 0) {
			soma += numero;
			numero = scanner.nextInt();
		}
		System.out.println("Soma dos números digitados = " + soma);
		scanner.close();
	
	}

}
