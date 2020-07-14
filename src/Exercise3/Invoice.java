package Exercise3;

import Exercise3.Products.Commodity;
import Exercise3.Products.Drinks;
import Exercise3.Products.Food;

import java.util.ArrayList;

public class Invoice {
	private ArrayList<Product> productList;
	private double invoiceBeforeTax;
	private double invoiceAfterTax;

	public Invoice() {
		this.productList = new ArrayList<>();
		this.invoiceBeforeTax = 0;
		this.invoiceAfterTax = 0;
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

	private void calculateBeforeTaxTotal() {
		double i = 0;
		for (Product product : productList) {
			i += (product.getPrice() * product.getQuantity());
		}

		this.invoiceBeforeTax = i;
	}

	private void calculateAfterTaxTotal() {
		double i = 0;
		for (Product product : this.productList) {
			if (product instanceof Commodity) {
				i += (calculateTaxTotal(((Commodity) product).getTax(), product.getPrice())) * product.getQuantity();

			} else if (product instanceof Food) {
				i += (calculateTaxTotal(((Food) product).getTax(), product.getPrice())) * product.getQuantity();

			} else if (product instanceof Drinks) {
				i += (calculateTaxTotal(((Drinks) product).getTax(), product.getPrice())) * product.getQuantity();

			}
		}

		this.invoiceAfterTax = i;
	}

	public void showSum() {
		if (this.productList.size() > 0){
			String headerString = String.format("%1$-20s %2$20s", "Sum", "Total");
			System.out.println("#".repeat(headerString.length()) + "\n"+ headerString+ "\n" + "#".repeat(headerString.length()));

			calculateBeforeTaxTotal();
			System.out.println(String.format("%1$-20s %2$20s", "Before Tax", "€" + this.invoiceBeforeTax));

			calculateAfterTaxTotal();
			System.out.println(String.format("%1$-20s %2$20s", "After Tax", "€" + this.invoiceAfterTax));
		}
	}

	public double getInvoiceBeforeTax() {
		calculateBeforeTaxTotal();
		return invoiceBeforeTax;
	}

	public double getInvoiceAfterTax() {
		calculateAfterTaxTotal();
		return invoiceAfterTax;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}



}
