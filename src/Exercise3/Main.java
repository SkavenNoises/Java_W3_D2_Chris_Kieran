package Exercise3;

import Exercise3.Products.Commodity;

public class Main {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();

		invoice.addProduct(new Commodity("TestBook", 20.99, 2));

		invoice.showSum();
	}
}
