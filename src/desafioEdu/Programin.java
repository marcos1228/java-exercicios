package desafioEdu;

import java.math.BigDecimal;

public class Programin {
	public static void main(String[] args) {
		Product product = new Product(1l, "Macarr�o", new BigDecimal(1l));
		Product product1 = new Product(2l, "Macarr�o", new BigDecimal(1l));

		System.out.println(product.getNome());
	}
}