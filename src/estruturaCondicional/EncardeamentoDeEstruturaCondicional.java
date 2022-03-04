package estruturaCondicional;

import java.util.Scanner;

public class EncardeamentoDeEstruturaCondicional {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hora;
		hora = scanner.nextInt();
		if (hora < 12) {
			System.out.println("BOM DIA");
		} else if (hora < 18) {
			System.out.println("BOA TARDE");
		} else
			System.out.println("BOA NOITE");

		scanner.close();

	}

}
