package Exercise3.Products;

import Exercise3.Product;

public class Commodity extends Product {
	private int tax;

	public Commodity(String name, double price, int quantity) {
		super(name, price, quantity);
		this.tax = 20;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
}
