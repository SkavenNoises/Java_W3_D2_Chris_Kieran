package Exercise3;

import Exercise3.Products.Commodity;
import Exercise3.Products.Drinks;
import Exercise3.Products.Food;

import java.util.ArrayList;

public class Invoice {
	private ArrayList<Product> productList;

	public Invoice() {
		this.productList = new ArrayList<>();
	}

	public void addProduct(Product product) {
		this.productList.add(product);
	}

	public void clearInvoice() {
		this.productList.clear();
	}

	private double calculateTaxTotal(double tax, double price) {
		return price * (1 + (tax / 100));
	}

	public void showSum() {
		if (this.productList.size() > 0){
			String headerString = String.format("%1$-20s %2$20s", "Sum", "Total");
			System.out.println("#".repeat(headerString.length()) + "\n"+ headerString+ "\n" + "#".repeat(headerString.length()));

			double tempSum = 0;

			// Displaying total before tax
			for (Product product : productList) {
				tempSum += (product.getPrice() * product.getQuantity());
			}

			System.out.println(String.format("%1$-20s %2$20s", "Before Tax", "€" + tempSum));

			// Displaying Sum with taxes
			tempSum = 0;
			for (Product product : productList) {
				if (product instanceof Commodity) {
					tempSum += (calculateTaxTotal(20, product.getPrice())) * product.getQuantity();

				} else if (product instanceof Food) {
					tempSum += (calculateTaxTotal(10, product.getPrice())) * product.getQuantity();

				} else if (product instanceof Drinks) {
					tempSum += (calculateTaxTotal(15, product.getPrice())) * product.getQuantity();

				}
			}

			System.out.println(String.format("%1$-20s %2$20s", "After Tax", "€" + tempSum));

		}
	}
}
