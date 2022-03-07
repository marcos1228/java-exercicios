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
		double resultado;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.85;
		resultado = preco - desconto;
		System.out.println("O desconto foi de R$ =" + desconto + "O Preco final é R$= " + resultado);
		scanner.close();
	}

}
