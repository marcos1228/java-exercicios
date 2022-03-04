package estruturaCondicional;

import java.util.Scanner;

public class AlgoritmoDeIdentificaBomDia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hora;
		System.out.println("QUANTAS HORAS?");
		hora = scanner.nextInt();
		if (hora < 12) {
			System.out.println("BOM DIA");
		} else {
			System.out.println("BOA TARDE");
		}
		scanner.close();
	}

}
