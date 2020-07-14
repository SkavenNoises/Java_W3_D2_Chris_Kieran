package Exercise3;

import Exercise3.Products.Commodity;
import Exercise3.Products.Drinks;
import Exercise3.Products.Food;

public class Main {

	public static void main(String[] args) {
		// Client 1 invoicing
		Client travellingLibrary = new Client("TravellingLibrary");

		Invoice travellingLibrary_Invoice1 = new Invoice();

		travellingLibrary_Invoice1.addProduct(new Commodity("Java 101", 20.99, 5));
		travellingLibrary_Invoice1.addProduct(new Commodity("Basics in Java", 25.99, 8));

		travellingLibrary.addInvoice(travellingLibrary_Invoice1);


		// Client 2 invoicing
		Client restaurant66 = new Client("Restaurant66");

		Invoice restaurant66_Invoice1 = new Invoice();
		restaurant66_Invoice1.addProduct(new Food("Veggie Lasagne", 3.50, 10));

		Invoice restaurant66_Invoice2 = new Invoice();
		restaurant66_Invoice2.addProduct(new Food("Baked Alaska", 5.18, 25));

		restaurant66.addInvoice(restaurant66_Invoice1);
		restaurant66.addInvoice(restaurant66_Invoice2);


		// Client 3 invoicing
		Client azure = new Client("azure");
		Invoice azure_invoice = new Invoice();
		azure_invoice.addProduct(new Drinks("Vodka", 25.68, 10));
		azure_invoice.addProduct(new Drinks("Tequilla", 32.21, 12));

		azure.addInvoice(azure_invoice);


		// Storing all clients in an Arr
		Client[] clientArr = new Client[] {travellingLibrary, restaurant66, azure};

		// Displaying how much all customers owe
		double totalOwed = 0;
		for (Client client : clientArr) {
			for (Invoice invoice: client.getInvoices()) {
				totalOwed += invoice.getInvoiceAfterTax();
			}
		}
		System.out.println("Total owed by all clients : " + totalOwed);
	}
}
