package estruturasequencial;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = scanner.nextInt();
		scanner.hasNextLine();
		s1 = scanner.nextLine();
		s2 = scanner.nextLine();
		s3 = scanner.nextLine();

		System.out.println("DADOS DIGITADOS");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		scanner.close();
	}

}
