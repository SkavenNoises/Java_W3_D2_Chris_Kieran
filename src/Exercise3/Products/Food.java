package Exercise3.Products;

import Exercise3.Product;

public class Food extends Product {
	private int tax;

	public Food(String name, double price, int quantity) {
		super(name, price, quantity);
		this.tax = 10;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
}
