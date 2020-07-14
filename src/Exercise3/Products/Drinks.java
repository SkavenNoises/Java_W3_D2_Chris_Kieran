package Exercise3.Products;

import Exercise3.Product;

public class Drinks extends Product {
	private int tax;

	public Drinks(String name, double price, int quantity) {
		super(name, price, quantity);
		this.tax = 15;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
}
