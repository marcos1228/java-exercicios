package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {
	/*
	 * do while(fa�a enquanto) O bloco de comandos que for colocado dentro dela
	 * executa pelos menos uma vez, pois a condi��o e verificado no final
	 */
	/*
	 * sintaxe do{ comando 1 comando 2} while(condi��o); regra verdadeira-->
	 * verdeira volta falso--> pula fora
	 */
	/*
	 * Exemplo: Fazer um programa para ler uma temperatura em Celsius e mostrar o
	 * equivalente em Fahrenheit. Perguntar se o usu�rio deseja repetir(s/n). Caso o
	 * usu�rio digite "S", repitir o programa
	 */
	/*
	 * F�rmula: F 9c / 5 + 32
	 */
	public static void main(String[] args) {
		/* Primeiro resolver o problema utilizando do while */
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		char resp = 's';
		while (resp != 'n') {
			System.out.println("Digite a temperatura em celsius: ");
			double C = scanner.nextDouble();
			double F = 9.0 * C / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit :%.1f%n", F);
			System.out.print("Deseja repetir (s/n) ?");
			resp = scanner.next().charAt(0);
		}
		scanner.close();
	}
}
