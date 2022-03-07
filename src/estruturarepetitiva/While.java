package estruturarepetitiva;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		/*
		 * while(enquanto) � uma estrutura de controle que repete um bloco de comandos,
		 * enquanto uma condi��o for verdadeira. Quando n�o usar: Quando n�o se sabe
		 * previamente a quantidade de repeti��es que ser� realizadas
		 */
		/*
		 * Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final
		 * mostra a soma dos n�meros lidos.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um n�mero");
		int soma = 0;
		int numero = scanner.nextInt();
		while (numero != 0) {
			soma += numero;
			numero = scanner.nextInt();
		}
		System.out.println("Soma dos n�meros digitados = " + soma);
		scanner.close();
	
	}

}
