package estruturaCondicional;

import java.util.Scanner;

public class AtribuitoresComulativo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade de minutos");
		int minutos = scanner.nextInt();
		
		double conta = 50.0;

		if (minutos > 100) {
			conta+= (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta é = R$ %.2f%n", conta);

		scanner.close();

	}

}
