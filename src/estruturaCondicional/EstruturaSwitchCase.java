package estruturaCondicional;

import java.util.Scanner;

public class EstruturaSwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe um n�mero");
		int x = scanner.nextInt();
		String dia;
		if (x == 1) {
			dia = "domingo";
		} else {
			if (x == 2) {
				dia = "segunda";
			} else {
				if (x == 3) {
					dia = "ter�a";
				} else {
					if (x == 4) {
						dia = "quarta";
					} else {
						if (x == 5) {
							dia = "quinta";
						} else {
							if (x == 6) {
								dia = "sexta";
							} else if (x == 7) {
								dia = "s�bado";
							} else
								dia = "valor invalido";
						}
						
					}
					
				}
			}
			
		}
		System.out.println("O DIA DA SEMANA �: " + dia);
		scanner.close();
	}

}
