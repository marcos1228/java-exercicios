package desafioEdu;

import java.math.BigDecimal;

public class Programin {
	public static void main(String[] args) {
		Product[100] product = new Product();
		product.setId(1l);
		product.setNome("Macarrão");
		product.setValor(new BigDecimal(1));
		System.out.println(product.getNome());
	}
}
