package estruturaCondicional;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * Sintaxe (condção) ? valor verdadeir : valor falso
		 */
		System.out.println("Informe o valor do preço");
		double preco = scanner.nextDouble();
		double desconto;
		double resultado;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.85;
		}

		resultado = preco - desconto;
		System.out.println("O desconto foi de R$ =" + desconto + "O Preco final é R$= " + resultado);
		scanner.close();
	}

}
